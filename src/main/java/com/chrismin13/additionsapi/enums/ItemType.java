package com.chrismin13.additionsapi.enums;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.chrismin13.additionsapi.durability.ArmorDurability;
import com.chrismin13.additionsapi.durability.BowDurability;
import com.chrismin13.additionsapi.durability.ElytraDurability;
import com.chrismin13.additionsapi.durability.FishingRodDurability;
import com.chrismin13.additionsapi.durability.FlintAndSteelDurability;
import com.chrismin13.additionsapi.durability.ItemDurability;
import com.chrismin13.additionsapi.durability.ShearDurability;
import com.chrismin13.additionsapi.durability.ShieldDurability;
import com.chrismin13.additionsapi.permissions.ArmorPermissions;
import com.chrismin13.additionsapi.permissions.BowPermissions;
import com.chrismin13.additionsapi.permissions.ElytraPermissions;
import com.chrismin13.additionsapi.permissions.FishingRodPermissions;
import com.chrismin13.additionsapi.permissions.FlintAndSteelPermissions;
import com.chrismin13.additionsapi.permissions.ItemPermissions;
import com.chrismin13.additionsapi.permissions.PermissionType;
import com.chrismin13.additionsapi.permissions.ShearPermissions;
import com.chrismin13.additionsapi.permissions.ShieldPermissions;

public enum ItemType {

	BLOCK, TOOL, ARMOR, FOOD, RECORD, BOAT, BOOK, RAW_MATERIAL, BOW, BUCKET, UTILITY, BARDING, POTION, PROJECTILE, ELYTRA, SHIELD, ARROW, SHEARS, FISHING_ROD, FLINT_AND_STEEL;

	public static ItemType getItemType(ItemStack item) {
		return getItemType(item.getType());
	}

	public ItemDurability getItemDurability() {
		switch (this) {
		case BOW:
			return new BowDurability();
		case ELYTRA:
			return new ElytraDurability();
		case FISHING_ROD:
			return new FishingRodDurability();
		case FLINT_AND_STEEL:
			return new FlintAndSteelDurability();
		case SHEARS:
			return new ShearDurability();
		case SHIELD:
			return new ShieldDurability();
		case ARMOR:
			return new ArmorDurability();
		default:
			return new ItemDurability();
		}
	}

	public ItemPermissions getItemPermissions(String permissionPrefix, PermissionType type) {
		switch (this) {
		case BOW:
			return new BowPermissions(permissionPrefix, type);
		case ELYTRA:
			return new ElytraPermissions(permissionPrefix, type);
		case FISHING_ROD:
			return new FishingRodPermissions(permissionPrefix, type);
		case FLINT_AND_STEEL:
			return new FlintAndSteelPermissions(permissionPrefix, type);
		case SHEARS:
			return new ShearPermissions(permissionPrefix, type);
		case SHIELD:
			return new ShieldPermissions(permissionPrefix, type);
		case ARMOR:
			return new ArmorPermissions(permissionPrefix, type);
		default:
			return new ItemPermissions(permissionPrefix, type);
		}
	}

	@SuppressWarnings("deprecation")
	public static ItemType getItemType(Material material) {
		if (material.isBlock())
			return BLOCK;
		if (material.isEdible())
			return FOOD;
		if (material.isRecord())
			return RECORD;
		switch (material) {
		case BLAZE_POWDER:
			return RAW_MATERIAL;
		case BLAZE_ROD:
			return RAW_MATERIAL;
		case OAK_BOAT:
			return BOAT;
		case ACACIA_BOAT:
			return BOAT;
		case BIRCH_BOAT:
			return BOAT;
		case DARK_OAK_BOAT:
			return BOAT;
		case JUNGLE_BOAT:
			return BOAT;
		case SPRUCE_BOAT:
			return BOAT;
		case BONE:
			return RAW_MATERIAL;
		case BOOK:
			return BOOK;
		case WRITABLE_BOOK:
			return BOOK;
		case BOW:
			return BOW;
		case BOWL:
			return RAW_MATERIAL;
		case BROWN_MUSHROOM:
			return RAW_MATERIAL;
		case BUCKET:
			return BUCKET;
		case CARROT_ON_A_STICK:
			return UTILITY;
		case CHAINMAIL_BOOTS:
			return ARMOR;
		case CHAINMAIL_CHESTPLATE:
			return ARMOR;
		case CHAINMAIL_HELMET:
			return ARMOR;
		case CHAINMAIL_LEGGINGS:
			return ARMOR;
		case CLAY_BALL:
			return RAW_MATERIAL;
		case COAL:
			return RAW_MATERIAL;
		case COMPASS:
			return UTILITY;
		case DIAMOND:
			return RAW_MATERIAL;
		case DIAMOND_AXE:
			return TOOL;
		case DIAMOND_HORSE_ARMOR:
			return BARDING;
		case DIAMOND_BOOTS:
			return ARMOR;
		case DIAMOND_CHESTPLATE:
			return ARMOR;
		case DIAMOND_HELMET:
			return ARMOR;
		case DIAMOND_HOE:
			return TOOL;
		case DIAMOND_LEGGINGS:
			return ARMOR;
		case DIAMOND_PICKAXE:
			return TOOL;
		case DIAMOND_SHOVEL:
			return TOOL;
		case DIAMOND_SWORD:
			return TOOL;
		case DRAGON_BREATH:
			return POTION;
		case EGG:
			return PROJECTILE;
		case ELYTRA:
			return ELYTRA;
		case OBSIDIAN:
			return RAW_MATERIAL;
		case ENCHANTED_BOOK:
			return BOOK;
		case ENDER_PEARL:
			return UTILITY;
		case ENDER_EYE:
			return UTILITY;
		case FEATHER:
			return RAW_MATERIAL;
		case FIRE_CHARGE:
			return UTILITY;
		case FIREWORK_ROCKET:
			return UTILITY;
		case FIREWORK_STAR:
			return RAW_MATERIAL;
		case FISHING_ROD:
			return FISHING_ROD;
		case FLINT:
			return RAW_MATERIAL;
		case FLINT_AND_STEEL:
			return FLINT_AND_STEEL;
		case GHAST_TEAR:
			return RAW_MATERIAL;
		case GLASS_BOTTLE:
			return UTILITY;
		case GLOWSTONE_DUST:
			return RAW_MATERIAL;
		case GOLDEN_AXE:
			return TOOL;
		case GOLDEN_HORSE_ARMOR:
			return BARDING;
		case GOLDEN_BOOTS:
			return ARMOR;
		case GOLDEN_CHESTPLATE:
			return ARMOR;
		case GOLDEN_HELMET:
			return ARMOR;
		case GOLDEN_HOE:
			return TOOL;
		case GOLD_INGOT:
			return RAW_MATERIAL;
		case GOLDEN_LEGGINGS:
			return ARMOR;
		case GOLD_NUGGET:
			return RAW_MATERIAL;
		case GOLDEN_PICKAXE:
			return TOOL;
		case GOLDEN_SHOVEL:
			return TOOL;
		case GOLDEN_SWORD:
			return TOOL;
		case INK_SAC:
			return RAW_MATERIAL;
		case CYAN_DYE:
			return RAW_MATERIAL;
		case GRAY_DYE:
			return RAW_MATERIAL;
		case LIME_DYE:
			return RAW_MATERIAL;
		case MAGENTA_DYE:
			return RAW_MATERIAL;
		case ORANGE_DYE:
			return RAW_MATERIAL;
		case PINK_DYE:
			return RAW_MATERIAL;
		case PURPLE_DYE:
			return RAW_MATERIAL;
		case LIGHT_BLUE_DYE:
			return RAW_MATERIAL;
		case LIGHT_GRAY_DYE:
			return RAW_MATERIAL;
		case IRON_AXE:
			return TOOL;
		case IRON_HORSE_ARMOR:
			return BARDING;
		case IRON_BOOTS:
			return ARMOR;
		case IRON_CHESTPLATE:
			return ARMOR;
		case IRON_HELMET:
			return ARMOR;
		case IRON_HOE:
			return TOOL;
		case IRON_INGOT:
			return RAW_MATERIAL;
		case IRON_LEGGINGS:
			return ARMOR;
		case IRON_PICKAXE:
			return TOOL;
		case IRON_SHOVEL:
			return TOOL;
		case IRON_SWORD:
			return TOOL;
		case LAVA_BUCKET:
			return BUCKET;
		case LEAD:
			return UTILITY;
		case LEATHER:
			return RAW_MATERIAL;
		case LEATHER_BOOTS:
			return ARMOR;
		case LEATHER_CHESTPLATE:
			return ARMOR;
		case LEATHER_HELMET:
			return ARMOR;
		case LEATHER_LEGGINGS:
			return ARMOR;
		case LINGERING_POTION:
			return POTION;
		case MAGMA_CREAM:
			return RAW_MATERIAL;
		case MAP:
			return UTILITY;
		case MILK_BUCKET:
			return BUCKET;
		case BAT_SPAWN_EGG:
			return UTILITY;
		case COD_SPAWN_EGG:
			return UTILITY;
		case CHICKEN_SPAWN_EGG:
			return UTILITY;
		case BLAZE_SPAWN_EGG:
			return UTILITY;
		case COW_SPAWN_EGG:
			return UTILITY;
		case CREEPER_SPAWN_EGG:
			return UTILITY;
		case DOLPHIN_SPAWN_EGG:
			return UTILITY;
		case DONKEY_SPAWN_EGG:
			return UTILITY;
		case DROWNED_SPAWN_EGG:
			return UTILITY;
		case ENDERMAN_SPAWN_EGG:
			return UTILITY;
		case ENDERMITE_SPAWN_EGG:
			return UTILITY;
		case EVOKER_SPAWN_EGG:
			return UTILITY;
		case GHAST_SPAWN_EGG:
			return UTILITY;
		case GUARDIAN_SPAWN_EGG:
			return UTILITY;
		case HORSE_SPAWN_EGG:
			return UTILITY;
		case HUSK_SPAWN_EGG:
			return UTILITY;
		case LLAMA_SPAWN_EGG:
			return UTILITY;
		case MOOSHROOM_SPAWN_EGG:
			return UTILITY;
		case MULE_SPAWN_EGG:
			return UTILITY;
		case OCELOT_SPAWN_EGG:
			return UTILITY;
		case PARROT_SPAWN_EGG:
			return UTILITY;
		case PHANTOM_SPAWN_EGG:
			return UTILITY;
		case PIG_SPAWN_EGG:
			return UTILITY;
		case PUFFERFISH_SPAWN_EGG:
			return UTILITY;
		case RABBIT_SPAWN_EGG:
			return UTILITY;
		case SALMON_SPAWN_EGG:
			return UTILITY;
		case SHEEP_SPAWN_EGG:
			return UTILITY;
		case SHULKER_SPAWN_EGG:
			return UTILITY;
		case SILVERFISH_SPAWN_EGG:
			return UTILITY;
		case SKELETON_SPAWN_EGG:
			return UTILITY;
		case SLIME_SPAWN_EGG:
			return UTILITY;
		case SPIDER_SPAWN_EGG:
			return UTILITY;
		case SQUID_SPAWN_EGG:
			return UTILITY;
		case STRAY_SPAWN_EGG:
			return UTILITY;
		case TURTLE_SPAWN_EGG:
			return UTILITY;
		case VEX_SPAWN_EGG:
			return UTILITY;
		case VILLAGER_SPAWN_EGG:
			return UTILITY;
		case VINDICATOR_SPAWN_EGG:
			return UTILITY;
		case WITCH_SPAWN_EGG:
			return UTILITY;
		case WOLF_SPAWN_EGG:
			return UTILITY;
		case ZOMBIE_SPAWN_EGG:
			return UTILITY;
		case CAVE_SPIDER_SPAWN_EGG:
			return UTILITY;
		case ELDER_GUARDIAN_SPAWN_EGG:
			return UTILITY;
		case MAGMA_CUBE_SPAWN_EGG:
			return UTILITY;
		case POLAR_BEAR_SPAWN_EGG:
			return UTILITY;
		case SKELETON_HORSE_SPAWN_EGG:
			return UTILITY;
		case TROPICAL_FISH_SPAWN_EGG:
			return UTILITY;
		case WITHER_SKELETON_SPAWN_EGG:
			return UTILITY;
		case ZOMBIE_HORSE_SPAWN_EGG:
			return UTILITY;
		case ZOMBIE_PIGMAN_SPAWN_EGG:
			return UTILITY;
		case ZOMBIE_VILLAGER_SPAWN_EGG:
			return UTILITY;
		case NAME_TAG:
			return UTILITY;
		case NETHER_STAR:
			return RAW_MATERIAL;
		case PAPER:
			return RAW_MATERIAL;
		case POTION:
			return POTION;
		case PRISMARINE_CRYSTALS:
			return RAW_MATERIAL;
		case PRISMARINE_SHARD:
			return RAW_MATERIAL;
		case QUARTZ:
			return RAW_MATERIAL;
		case REDSTONE:
			return RAW_MATERIAL;
		case SADDLE:
			return UTILITY;
		case SHEARS:
			return SHEARS;
		case SHIELD:
			return SHIELD;
		case SLIME_BALL:
			return RAW_MATERIAL;
		case SNOWBALL:
			return PROJECTILE;
		case SPECTRAL_ARROW:
			return ARROW;
		case SPIDER_EYE:
			return RAW_MATERIAL;
		case SPLASH_POTION:
			return POTION;
		case STICK:
			return RAW_MATERIAL;
		case STONE_AXE:
			return TOOL;
		case STONE_HOE:
			return TOOL;
		case STONE_PICKAXE:
			return TOOL;
		case STONE_SHOVEL:
			return TOOL;
		case STONE_SWORD:
			return TOOL;
		case TIPPED_ARROW:
			return ARROW;
		case CLOCK:
			return UTILITY;
		case WATER_BUCKET:
			return BUCKET;
		case WOODEN_AXE:
			return TOOL;
		case WOODEN_HOE:
			return TOOL;
		case WOODEN_PICKAXE:
			return TOOL;
		case WOODEN_SHOVEL:
			return TOOL;
		case WOODEN_SWORD:
			return TOOL;
		case WRITTEN_BOOK:
			return BOOK;

		// 1.13 new stuffz
		case LEGACY_BOAT:
			return BOAT;
		case LEGACY_BOAT_ACACIA:
			return BOAT;
		case LEGACY_BOAT_BIRCH:
			return BOAT;
		case LEGACY_BOAT_DARK_OAK:
			return BOAT;
		case LEGACY_BOAT_JUNGLE:
			return BOAT;
		case LEGACY_BOAT_SPRUCE:
			return BOAT;
		case LEGACY_BOOK_AND_QUILL:
			return BOOK;
		case LEGACY_CARROT_STICK:
			return UTILITY;
		case LEGACY_DIAMOND_BARDING:
			return BARDING;
		case LEGACY_DIAMOND_SPADE:
			return TOOL;
		case LEGACY_DRAGONS_BREATH:
			return POTION;
		case LEGACY_EMPTY_MAP:
			return UTILITY;
		case LEGACY_EYE_OF_ENDER:
			return UTILITY;
		case LEGACY_FIREBALL:
			return UTILITY;
		case LEGACY_FIREWORK:
			return UTILITY;
		case LEGACY_FIREWORK_CHARGE:
			return RAW_MATERIAL;
		case LEGACY_GOLD_LEGGINGS:
			return ARMOR;
		case LEGACY_GOLD_AXE:
			return TOOL;
		case LEGACY_GOLD_BARDING:
			return BARDING;
		case LEGACY_GOLD_BOOTS:
			return ARMOR;
		case LEGACY_GOLD_CHESTPLATE:
			return ARMOR;
		case LEGACY_GOLD_HELMET:
			return ARMOR;
		case LEGACY_GOLD_HOE:
			return TOOL;
		case LEGACY_GOLD_PICKAXE:
			return TOOL;
		case LEGACY_GOLD_SPADE:
			return TOOL;
		case LEGACY_GOLD_SWORD:
			return TOOL;
		case LEGACY_INK_SACK:
			return RAW_MATERIAL;
		case LEGACY_IRON_BARDING:
			return BARDING;
		case LEGACY_IRON_SPADE:
			return TOOL;
		case LEGACY_LEASH:
			return UTILITY;
		case LEGACY_WATCH:
			return UTILITY;
		case LEGACY_MONSTER_EGGS:
			return UTILITY;
		case LEGACY_SNOW_BALL:
			return PROJECTILE;
		case LEGACY_STONE_SPADE:
			return TOOL;
		case LEGACY_WOOD_AXE:
			return TOOL;
		case LEGACY_WOOD_HOE:
			return TOOL;
		case LEGACY_WOOD_PICKAXE:
			return TOOL;
		case LEGACY_WOOD_SPADE:
			return TOOL;
		case LEGACY_WOOD_SWORD:
			return TOOL;
		default:
			break;
		}

		return null;
	}

}
