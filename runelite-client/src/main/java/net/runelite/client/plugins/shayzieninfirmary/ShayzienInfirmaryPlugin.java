/*
 * Copyright (c) 2019, Owain van Brakel <https://github.com/Owain94>
 * Copyright (c) 2019, Yani <yani@xenokore.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.shayzieninfirmary;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.NpcDefinitionChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@Slf4j
@PluginDescriptor(
	name = "Shayzien Infirmary",
	description = "Shows the status of wounded soldiers",
	tags = {"shayzien", "infirmary", "soldiers"},
	type = PluginType.UTILITY,
	enabledByDefault = false
)
@Singleton
public class ShayzienInfirmaryPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private Client client;

	@Inject
	private EventBus eventBus;

	@Inject
	private ShayzienInfirmaryOverlay overlay;

	@Getter(AccessLevel.PACKAGE)
	private List<NPC> unhealedSoldiers = new ArrayList<>();

	@Override
	protected void startUp() throws Exception
	{
		addSubscriptions();
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		eventBus.unregister(this);
		unhealedSoldiers.clear();
		overlayManager.remove(overlay);
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(NpcSpawned.class, this, this::onNpcSpawned);
		eventBus.subscribe(NpcDefinitionChanged.class, this, this::onNpcDefinitionChanged);
		eventBus.subscribe(NpcDespawned.class, this, this::onNpcDespawned);
		eventBus.subscribe(GameStateChanged.class, this, this::onGameStateChanged);
	}

	private void onGameStateChanged(GameStateChanged event)
	{
		unhealedSoldiers.clear();
	}

	private void onNpcSpawned(NpcSpawned npcSpawned)
	{
		NPC npc = npcSpawned.getNpc();

		if (isUnhealedSoldierId(npc.getId()))
		{
			unhealedSoldiers.add(npc);
		}
	}

	private void onNpcDefinitionChanged(NpcDefinitionChanged npcDefinitionChanged)
	{
		NPC npc = npcDefinitionChanged.getNpc();

		if (isUnhealedSoldierId(npc.getId()))
		{
			unhealedSoldiers.remove(npc);
		}
	}

	private void onNpcDespawned(NpcDespawned npcDespawned)
	{
		final NPC npc = npcDespawned.getNpc();

		unhealedSoldiers.remove(npc);
	}

	private boolean isSoldierId(int npcId)
	{
		return (npcId >= 6826 && npcId <= 6857);
	}

	private boolean isUnhealedSoldierId(int npcId)
	{
		return (isSoldierId(npcId) && npcId % 2 == 0);
	}

	boolean isNotAtInfirmary()
	{
		if (client == null || client.getLocalPlayer() == null)
		{
			return true;
		}

		return client.getLocalPlayer().getWorldLocation().getRegionID() != 6200;
	}
}