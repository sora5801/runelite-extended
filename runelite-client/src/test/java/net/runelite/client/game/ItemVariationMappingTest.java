/*
 * Copyright (c) 2018, Ron Young <https://github.com/raiyni>
 * All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *     list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
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

package net.runelite.client.game;

import java.util.LinkedHashMap;
import java.util.Map;
import static net.runelite.api.ItemID.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ItemVariationMappingTest
{
	private static final Map<Integer, Integer> ITEMS_MAP = new LinkedHashMap<>()
	{{
		put(_12_ANCHOVY_PIZZA, ANCHOVY_PIZZA);
		put(_12_MEAT_PIZZA, MEAT_PIZZA);
		put(_12_PINEAPPLE_PIZZA, PINEAPPLE_PIZZA);
		put(_12_PLAIN_PIZZA, PLAIN_PIZZA);
		put(ADAMANT_PLATELEGS_T, ADAMANT_PLATELEGS);
		put(ADAMANT_PLATESKIRT_T, ADAMANT_PLATESKIRT);
		put(AGILITY_CAPET, AGILITY_CAPE);
		put(AGILITY_MIX1, AGILITY_MIX2);
		put(AGILITY_MIX2, AGILITY_MIX2);
		put(AHRIMS_ROBETOP_100, AHRIMS_ROBETOP);
		put(AHRIMS_ROBETOP_25, AHRIMS_ROBETOP);
		put(AHRIMS_ROBETOP_50, AHRIMS_ROBETOP);
		put(AHRIMS_ROBETOP_75, AHRIMS_ROBETOP);
		put(AHRIMS_STAFF_0, AHRIMS_STAFF);
		put(AMULET_OF_GLORY5, AMULET_OF_GLORY);
		put(AMULET_OF_GLORY6, AMULET_OF_GLORY);
		put(AMULET_OF_MAGIC_T, AMULET_OF_MAGIC);
		put(ANCIENT_PAGE_1, ANCIENT_PAGE);
		put(ANCIENT_PAGE_2, ANCIENT_PAGE);
		put(ANTIDOTE2, ANTIDOTE_UNF);
		put(ANTIDOTE3, ANTIDOTE_UNF);
		put(ANTIDOTE4, ANTIDOTE_UNF);
		put(ANTIDOTE1_5958, ANTIDOTE_UNF);
		put(ANTIDOTE2_5956, ANTIDOTE_UNF);
		put(APPLES2, APPLES1);
		put(APPLES3, APPLES1);
		put(APPLES4, APPLES1);
		put(APPLES5, APPLES1);
		put(ARCHERS_RING_I, ARCHERS_RING);
		put(ASGARNIAN_ALEM4, ASGARNIAN_ALE);
		put(ATTACK_CAPET, ATTACK_CAPE);
		put(ATTACK_MIX1, ATTACK_MIX2);
		put(ATTACK_MIX2, ATTACK_MIX2);
		put(ATTACK_POTION1, ATTACK_POTION3);
		put(BANANAS2, BANANAS1);
		put(BANANAS3, BANANAS1);
		put(BANANAS4, BANANAS1);
		put(BANANAS5, BANANAS1);
		put(BANDOS_PAGE_1, BANDOS_PAGE_1);
		put(BLACK_KITESHIELD_T, BLACK_KITESHIELD);
		put(BLACK_MASK_1, BLACK_MASK_10);
		put(BLACK_MASK_2, BLACK_MASK_10);
		put(BLACK_MASK_3, BLACK_MASK_10);
		put(BLACK_MASK_4, BLACK_MASK_10);
		put(BLUE_SKIRT_T, BLUE_SKIRT);
		put(BLUE_WIZARD_HAT_T, BLUE_WIZARD_HAT);
		put(BLUE_WIZARD_ROBE_T, BLUE_WIZARD_ROBE);
		put(BOOK_PAGE_1, BOOK_PAGE_1);
		put(BOOK_PAGE_2, BOOK_PAGE_1);
		put(BROODOO_SHIELD_9, BROODOO_SHIELD_10);
		put(BROWN_SPICE_1, BROWN_SPICE_4);
		put(BROWN_SPICE_2, BROWN_SPICE_4);
		put(BROWN_SPICE_3, BROWN_SPICE_4);
		put(BROWN_SPICE_4, BROWN_SPICE_4);
		put(CASKET_ELITE, CASKET);
		put(CASKET_HARD, CASKET);
		put(CASKET_MEDIUM, CASKET);
		put(CASTLE_SKETCH_1, CASTLE_SKETCH_1);
		put(CASTLE_SKETCH_2, CASTLE_SKETCH_1);
		put(CHEFS_DELIGHTM2, CHEFS_DELIGHT);
		put(CHEFS_DELIGHTM3, CHEFS_DELIGHT);
		put(CHEFS_DELIGHTM4, CHEFS_DELIGHT);
		put(CIDER1, CIDER);
		put(CIDER2, CIDER);
		put(CLUE_NEST_ELITE, CLUE_NEST_EASY);
		put(CLUE_NEST_HARD, CLUE_NEST_EASY);
		put(CLUE_NEST_MEDIUM, CLUE_NEST_EASY);
		put(CLUE_SCROLL_EASY, CLUE_SCROLL);
		put(CLUE_SCROLL_ELITE, CLUE_SCROLL);
		put(COMMORB_V2, COMMORB_V2);
		put(COMPOST_POTION1, COMPOST_POTION4);
		put(COMPOST_POTION2, COMPOST_POTION4);
		put(COMPOST_POTION3, COMPOST_POTION4);
		put(COMPOST_POTION4, COMPOST_POTION4);
		put(CRYSTAL_BOW_510_I, NEW_CRYSTAL_BOW);
		put(CRYSTAL_BOW_510, NEW_CRYSTAL_BOW);
		put(CRYSTAL_BOW_610_I, NEW_CRYSTAL_BOW);
		put(CRYSTAL_BOW_610, NEW_CRYSTAL_BOW);
		put(CRYSTAL_BOW_710_I, NEW_CRYSTAL_BOW);
		put(CRYSTAL_HALBERD_510_I, NEW_CRYSTAL_HALBERD_FULL_I);
		put(CRYSTAL_HALBERD_510, NEW_CRYSTAL_HALBERD_FULL_I);
		put(CRYSTAL_HALBERD_610_I, NEW_CRYSTAL_HALBERD_FULL_I);
		put(CRYSTAL_HALBERD_610, NEW_CRYSTAL_HALBERD_FULL_I);
		put(CRYSTAL_HALBERD_710_I, NEW_CRYSTAL_HALBERD_FULL_I);
		put(CRYSTAL_SHIELD_510_I, NEW_CRYSTAL_SHIELD);
		put(CRYSTAL_SHIELD_510, NEW_CRYSTAL_SHIELD);
		put(CRYSTAL_SHIELD_610_I, NEW_CRYSTAL_SHIELD);
		put(CRYSTAL_SHIELD_610, NEW_CRYSTAL_SHIELD);
		put(CRYSTAL_SHIELD_710_I, NEW_CRYSTAL_SHIELD);
		put(DEFENCE_POTION2, DEFENCE_POTION3);
		put(DEFENCE_POTION3, DEFENCE_POTION3);
		put(DEFENCE_POTION4, DEFENCE_POTION3);
		put(DESERT_AMULET_1, DESERT_AMULET);
		put(DESERT_AMULET_2, DESERT_AMULET);
		put(DHAROKS_PLATEBODY_50, DHAROKS_PLATEBODY);
		put(DHAROKS_PLATEBODY_75, DHAROKS_PLATEBODY);
		put(DHAROKS_PLATELEGS_0, DHAROKS_PLATELEGS);
		put(DHAROKS_PLATELEGS_100, DHAROKS_PLATELEGS);
		put(DHAROKS_PLATELEGS_25, DHAROKS_PLATELEGS);
		put(DRAGON_BITTERM3, DRAGON_BITTER);
		put(DRAGON_BITTERM4, DRAGON_BITTER);
		put(DRAGON_DEFENDER_T, DRAGON_DEFENDER);
		put(DRAGONSTONE_BOLTS, DRAGONSTONE_BOLTS_E);
		put(DRAGONSTONE_DRAGON_BOLTS, DRAGONSTONE_DRAGON_BOLTS_E);
		put(ENCHANTED_LYRE2, ENCHANTED_LYRE);
		put(ENCHANTED_LYRE3, ENCHANTED_LYRE);
		put(ENCHANTED_LYRE4, ENCHANTED_LYRE);
		put(ENCHANTED_LYRE5, ENCHANTED_LYRE);
		put(ENERGY_MIX1, ENERGY_MIX2);
		put(EXTENDED_SUPER_ANTIFIRE_MIX1, EXTENDED_SUPER_ANTIFIRE_MIX2);
		put(EXTENDED_SUPER_ANTIFIRE_MIX2, EXTENDED_SUPER_ANTIFIRE_MIX2);
		put(EXTENDED_SUPER_ANTIFIRE1, EXTENDED_SUPER_ANTIFIRE4);
		put(EXTENDED_SUPER_ANTIFIRE2, EXTENDED_SUPER_ANTIFIRE4);
		put(EXTENDED_SUPER_ANTIFIRE3, EXTENDED_SUPER_ANTIFIRE4);
		put(FRAGMENT_1, FRAGMENT_1);
		put(FRAGMENT_2, FRAGMENT_1);
		put(FRAGMENT_3, FRAGMENT_1);
		put(FREMENNIK_SEA_BOOTS_1, FREMENNIK_SEA_BOOTS);
		put(FREMENNIK_SEA_BOOTS_2, FREMENNIK_SEA_BOOTS);
		put(GAMES_NECKLACE3, GAMES_NECKLACE8);
		put(GAMES_NECKLACE4, GAMES_NECKLACE8);
		put(GAMES_NECKLACE5, GAMES_NECKLACE8);
		put(GAMES_NECKLACE6, GAMES_NECKLACE8);
		put(GAMES_NECKLACE7, GAMES_NECKLACE8);
		put(GREENMANS_ALE4, GREENMANS_ALE);
		put(GREENMANS_ALEM1, GREENMANS_ALE);
		put(GREENMANS_ALEM2, GREENMANS_ALE);
		put(GREENMANS_ALEM3, GREENMANS_ALE);
		put(GREENMANS_ALEM4, GREENMANS_ALE);
		put(GUTHANS_PLATEBODY_75, GUTHANS_PLATEBODY);
		put(GUTHANS_WARSPEAR_0, GUTHANS_WARSPEAR);
		put(GUTHANS_WARSPEAR_100, GUTHANS_WARSPEAR);
		put(GUTHANS_WARSPEAR_25, GUTHANS_WARSPEAR);
		put(GUTHANS_WARSPEAR_50, GUTHANS_WARSPEAR);
		put(HALF_A_GARDEN_PIE, PART_GARDEN_PIE);
		put(HALF_A_MEAT_PIE, MEAT_PIE);
		put(MUSHROOM_PIE, HALF_A_MUSHROOM_PIE);
		put(HALF_A_REDBERRY_PIE, REDBERRY_PIE);
		put(HALF_A_ROCK, ROCK);
		put(HUNTING_MIX1, HUNTING_MIX2);
		put(HUNTING_MIX2, HUNTING_MIX2);
		put(IMPINABOX1, IMPINABOX2);
		put(IMPINABOX2, IMPINABOX2);
		put(IRON_FULL_HELM_T, IRON_FULL_HELM);
		put(KARILS_COIF_100, KARILS_COIF);
		put(KARILS_COIF_25, KARILS_COIF);
		put(KARILS_COIF_50, KARILS_COIF);
		put(KARILS_COIF_75, KARILS_COIF);
		put(KARILS_CROSSBOW_0, KARILS_CROSSBOW);
		put(KEY_MEDIUM, KEY);
		put(KODAI_POTION_1, KODAI_POTION_1);
		put(KODAI_POTION_2, KODAI_POTION_1);
		put(KODAI_POTION_3, KODAI_POTION_1);
		put(KODAI_POTION_4, KODAI_POTION_1);
		put(MAGIC_POTION1, MAGIC_POTION4);
		put(MAGIC_POTION2, MAGIC_POTION4);
		put(MAGIC_POTION3, MAGIC_POTION4);
		put(MAGIC_POTION4, MAGIC_POTION4);
		put(MAGIC_SHORTBOW_I, MAGIC_SHORTBOW_U);
		put(MITHRIL_FULL_HELM_T, MITHRIL_FULL_HELM);
		put(MITHRIL_KITESHIELD_T, MITHRIL_KITESHIELD);
		put(MITHRIL_PLATEBODY_T, MITHRIL_PLATEBODY);
		put(MITHRIL_PLATELEGS_T, MITHRIL_PLATELEGS);
		put(MITHRIL_PLATESKIRT_T, MITHRIL_PLATESKIRT);
		put(NECKLACE_OF_PASSAGE1, NECKLACE_OF_PASSAGE5);
		put(NECKLACE_OF_PASSAGE2, NECKLACE_OF_PASSAGE5);
		put(NECKLACE_OF_PASSAGE3, NECKLACE_OF_PASSAGE5);
		put(NECKLACE_OF_PASSAGE4, NECKLACE_OF_PASSAGE5);
		put(NECKLACE_OF_PASSAGE5, NECKLACE_OF_PASSAGE5);
		put(OLIVE_OIL4, OLIVE_OIL4);
		put(ONIONS1, ONIONS1);
		put(ONIONS2, ONIONS1);
		put(ONIONS3, ONIONS1);
		put(ONIONS4, ONIONS1);
		put(ORANGES3, ORANGES1);
		put(ORANGES4, ORANGES1);
		put(ORANGES5, ORANGES1);
		put(OVERLOAD_1, OVERLOAD_4);
		put(OVERLOAD_2, OVERLOAD_4);
		put(PHARAOHS_SCEPTRE_3, PHARAOHS_SCEPTRE_3);
		put(PHARAOHS_SCEPTRE_4, PHARAOHS_SCEPTRE_3);
		put(PHARAOHS_SCEPTRE_5, PHARAOHS_SCEPTRE_3);
		put(PHARAOHS_SCEPTRE_6, PHARAOHS_SCEPTRE_3);
		put(PHARAOHS_SCEPTRE_7, PHARAOHS_SCEPTRE_3);
		put(PRAEL_BAT_1, PRAEL_BAT_1);
		put(PRAYER_CAPET, PRAYER_CAPE);
		put(PRAYER_ENHANCE_1_20965, PRAYER_ENHANCE_1);
		put(PRAYER_ENHANCE_2_20966, PRAYER_ENHANCE_1);
		put(PRAYER_ENHANCE_3_20967, PRAYER_ENHANCE_1);
		put(RANGING_MIX1, RANGING_MIX2);
		put(RANGING_MIX2, RANGING_MIX2);
		put(RANGING_POTION1, RANGING_POTION3);
		put(RANGING_POTION2, RANGING_POTION3);
		put(RANGING_POTION3, RANGING_POTION3);
		put(RED_DHIDE_BODY_T, RED_DHIDE_BODY);
		put(RED_DHIDE_CHAPS_T, RED_DHIDE_CHAPS);
		put(RED_SLAYER_HELMET_I, SLAYER_HELMET);
		put(RED_SPICE_1, RED_SPICE_4);
		put(RED_SPICE_2, RED_SPICE_4);
		put(RESTORE_MIX1, RESTORE_MIX2);
		put(RESTORE_MIX2, RESTORE_MIX2);
		put(RESTORE_POTION1, RESTORE_POTION3);
		put(RESTORE_POTION2, RESTORE_POTION3);
		put(RESTORE_POTION3, RESTORE_POTION3);
		put(RING_OF_DUELING5, RING_OF_DUELING8);
		put(RING_OF_DUELING6, RING_OF_DUELING8);
		put(RING_OF_DUELING7, RING_OF_DUELING8);
		put(RING_OF_DUELING8, RING_OF_DUELING8);
		put(RING_OF_RETURNING1, RING_OF_RETURNING5);
		put(ROD_OF_IVANDIS_4, ROD_OF_IVANDIS_10);
		put(ROD_OF_IVANDIS_5, ROD_OF_IVANDIS_10);
		put(ROD_OF_IVANDIS_6, ROD_OF_IVANDIS_10);
		put(ROD_OF_IVANDIS_7, ROD_OF_IVANDIS_10);
		put(ROD_OF_IVANDIS_8, ROD_OF_IVANDIS_10);
		put(SACRED_OIL3, SACRED_OIL4);
		put(SACRED_OIL4, SACRED_OIL4);
		put(SALVE_AMULET_E, SALVE_AMULET);
		put(SALVE_AMULETI, SALVE_AMULET);
		put(SANDSTONE_1KG, SANDSTONE_1KG);
		put(SARADOMIN_PAGE_4, SARADOMIN_PAGE_1);
		put(SEERS_RING_I, SEERS_RING);
		put(SHAYZIEN_BOOTS_1, SHAYZIEN_BOOTS_1);
		put(SHAYZIEN_BOOTS_2, SHAYZIEN_BOOTS_1);
		put(SHAYZIEN_BOOTS_3, SHAYZIEN_BOOTS_1);
		put(SHAYZIEN_HELM_4, SHAYZIEN_HELM_1);
		put(SHAYZIEN_HELM_5, SHAYZIEN_HELM_1);
		put(SHAYZIEN_PLATEBODY_1, SHAYZIEN_PLATEBODY_1);
		put(SHAYZIEN_PLATEBODY_2, SHAYZIEN_PLATEBODY_1);
		put(SHAYZIEN_PLATEBODY_3, SHAYZIEN_PLATEBODY_1);
		put(SHAYZIEN_SUPPLY_GREAVES_4, SHAYZIEN_SUPPLY_GREAVES_1);
		put(SHAYZIEN_SUPPLY_GREAVES_5, SHAYZIEN_SUPPLY_GREAVES_1);
		put(SHAYZIEN_SUPPLY_HELM_1, SHAYZIEN_SUPPLY_HELM_1);
		put(SHAYZIEN_SUPPLY_HELM_2, SHAYZIEN_SUPPLY_HELM_1);
		put(SHAYZIEN_SUPPLY_HELM_3, SHAYZIEN_SUPPLY_HELM_1);
		put(SHEEP_BONES_4, SHEEP_BONES_1);
		put(SINHAZA_SHROUD_TIER_1, SINHAZA_SHROUD_TIER_1);
		put(SINHAZA_SHROUD_TIER_2, SINHAZA_SHROUD_TIER_1);
		put(SINHAZA_SHROUD_TIER_3, SINHAZA_SHROUD_TIER_1);
		put(SINHAZA_SHROUD_TIER_4, SINHAZA_SHROUD_TIER_1);
		put(SLAYER_RING_6, SLAYER_RING_8);
		put(SLAYER_RING_7, SLAYER_RING_8);
		put(SLAYER_RING_8, SLAYER_RING_8);
		put(SLAYER_RING_ETERNAL, SLAYER_RING_8);
		put(SLAYERS_RESPITE1, SLAYERS_RESPITE);
		put(STAMINA_POTION4, STAMINA_POTION4);
		put(STASH_UNITS_EASY, STASH_UNITS_EASY);
		put(STASH_UNITS_ELITE, STASH_UNITS_EASY);
		put(STASH_UNITS_HARD, STASH_UNITS_EASY);
		put(STASH_UNITS_MASTER, STASH_UNITS_EASY);
		put(STRENGTH_POTION1, STRENGTH_POTION4);
		put(STRENGTH_POTION2, STRENGTH_POTION4);
		put(STRENGTH_POTION3, STRENGTH_POTION4);
		put(STRENGTH_POTION4, STRENGTH_POTION4);
		put(STUDDED_BODY_T, STUDDED_BODY);
		put(SUPER_DEF_MIX1, SUPER_DEF_MIX2);
		put(SUPER_DEF_MIX2, SUPER_DEF_MIX2);
		put(SUPER_DEFENCE1, SUPER_DEFENCE3);
		put(SUPER_DEFENCE2, SUPER_DEFENCE3);
		put(SUPER_DEFENCE3, SUPER_DEFENCE3);
		put(SUPER_RESTORE_MIX1, SUPER_RESTORE_MIX2);
		put(SUPER_RESTORE_MIX2, SUPER_RESTORE_MIX2);
		put(SUPER_RESTORE1, SUPER_RESTORE4);
		put(SUPER_RESTORE2, SUPER_RESTORE4);
		put(SUPER_RESTORE3, SUPER_RESTORE4);
		put(TEAK_SHELVES_2, TEAK_SHELVES_1);
		put(TELEPORT_CRYSTAL_1, TELEPORT_CRYSTAL_4);
		put(TELEPORT_CRYSTAL_2, TELEPORT_CRYSTAL_4);
		put(TELEPORT_CRYSTAL_3, TELEPORT_CRYSTAL_4);
		put(TELEPORT_CRYSTAL_4, TELEPORT_CRYSTAL_4);
		put(TOPAZ_BOLTS, TOPAZ_BOLTS_E);
		put(TOPAZ_DRAGON_BOLTS, TOPAZ_DRAGON_BOLTS_E);
		put(TORAGS_HAMMERS_0, TORAGS_HAMMERS);
		put(TORAGS_HAMMERS_100, TORAGS_HAMMERS);
		put(TORAGS_HAMMERS_25, TORAGS_HAMMERS);
		put(TORAGS_PLATELEGS_50, TORAGS_PLATELEGS);
		put(TORAGS_PLATELEGS_75, TORAGS_PLATELEGS);
		put(TREASONOUS_RING_I, TREASONOUS_RING);
		put(TRIDENT_OF_THE_SEAS_E, TRIDENT_OF_THE_SEAS_FULL);
		put(TRIDENT_OF_THE_SWAMP_E, TRIDENT_OF_THE_SWAMP);
		put(VERACS_BRASSARD_50, VERACS_BRASSARD);
		put(VERACS_BRASSARD_75, VERACS_BRASSARD);
		put(VERACS_FLAIL_0, VERACS_FLAIL);
		put(VERACS_FLAIL_100, VERACS_FLAIL);
		put(VERACS_FLAIL_25, VERACS_FLAIL);
		put(VOID_SEAL1, VOID_SEAL8);
		put(VOID_SEAL2, VOID_SEAL8);
		put(VOID_SEAL3, VOID_SEAL8);
		put(VOID_SEAL4, VOID_SEAL8);
		put(VOID_SEAL5, VOID_SEAL8);
		put(WATERSKIN3, WATERSKIN4);
		put(WATERSKIN4, WATERSKIN4);
		put(WESTERN_BANNER_1, WESTERN_BANNER);
		put(WESTERN_BANNER_2, WESTERN_BANNER);
		put(WESTERN_BANNER_3, WESTERN_BANNER);
		put(YELLOW_SPICE_2, YELLOW_SPICE_4);
		put(YELLOW_SPICE_3, YELLOW_SPICE_4);
		put(YELLOW_SPICE_4, YELLOW_SPICE_4);
		put(ZAMORAK_BREW1, ZAMORAK_BREW3);
		put(ZAMORAK_BREW2, ZAMORAK_BREW3);
	}};

	@Test
	public void testMappedNames() throws Exception
	{
		ItemVariationMapping.load();

		ITEMS_MAP.forEach((key, value) ->
			assertEquals(value, (Integer) ItemVariationMapping.map(key)));
	}
}
