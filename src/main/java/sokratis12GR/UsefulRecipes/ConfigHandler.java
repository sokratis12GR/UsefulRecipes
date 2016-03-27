package sokratis12GR.UsefulRecipes;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigHandler
{
	public boolean isChild = true;

	public static Configuration config;
	// Settings
	public static boolean FleshToBeef;
	public static boolean PoisonPotatoSmelting;
	public static boolean GoldArmorToGold;
	public static boolean DiamondArmorToDiamond;
	public static boolean IronArmorToIron;
	public static boolean LeatherArmorToLeather;
	public static boolean WoodenSlabsToPlanks;
	public static boolean StoneSlabsToStone;
	public static boolean WoolToString;
	public static boolean Saplings;
	public static boolean Skull;
	public static boolean WitherSkull;
	public static boolean Cobweb;
	public static boolean DirtToGrass;
	public static boolean GravelToFlint;
	public static boolean FasterIronSmelting;
	public static boolean FasterGoldSmelting;

	public static boolean setCategoryRequiresMcRestart;

	public static void init(File file)
	{
		config = new Configuration(file);
		syncConfig();
	}

	public static void syncConfig()
	{
		String category;
		// Crafting Recipes
		category = "Crafting";
		config.setCategoryLanguageKey("Crafting", "config.crafting");
		LeatherArmorToLeather= config.getBoolean("LeatherArmorToLeather", category, true,
				"Enable/Disable LeatherArmorToLeather Crafting");
		GoldArmorToGold = config.getBoolean("GoldArmorToGold", category, true,
				"Enable/Disable GoldArmorToGold Crafting");
		IronArmorToIron = config.getBoolean("IronArmorToIron", category, true,
				"Enable/Disable IronArmorToIron Crafting");
		DiamondArmorToDiamond = config.getBoolean("DiamondArmorToDiamond", category, true,
				"Enable/Disable DiamondArmorToDiamond Crafting");
		WoodenSlabsToPlanks = config.getBoolean("WoodenSlabsToPlanks", category, true,
				"Enable/Disable WoodenSlabsToPlanks Crafting");
		StoneSlabsToStone = config.getBoolean("StoneSlabsToPlanks", category, true,
				"Enable/Disable StoneSlabsToPlanks Crafting");
		WoolToString = config.getBoolean("WoolToString", category, true, "Enable/Disable WoolToString Crafting");
		Saplings = config.getBoolean("Saplings", category, true, "Enable/Disable Saplings Crafting");
		Skull = config.getBoolean("Skull", category, true, "Enable/Disable Skull Crafting");
		WitherSkull = config.getBoolean("WitherSkull", category, true, "Enable/Disable WitherSkull Crafting");
		Cobweb = config.getBoolean("Cobweb", category, true, "Enable/Disable Cobweb Crafting");
		DirtToGrass = config.getBoolean("DirtToGrass", category, true, "Enable/Disable DirtToGrass Crafting");
		GravelToFlint = config.getBoolean("GravelToFlint", category, true, "Enable/Disable GravelToFlint Crafting");
		FasterIronSmelting = config.getBoolean("FasterIronSmelting", category, true,
				"Enable/Disable FasterIronSmelting Crafting");
		FasterGoldSmelting = config.getBoolean("FasterGoldSmelting", category, true,
				"Enable/Disable FasterGoldSmelting Crafting");

		// Smelting Recipes
		category = "Smelting";
		PoisonPotatoSmelting = config.getBoolean("PoisonPotatoSmelting", category, true,
				"Enable/Disable PoisonPotato Smelting");
		FleshToBeef = config.getBoolean("FleshToBeef", category, true, "Enable/Disable FleshToBeef Smelting");
		config.setCategoryLanguageKey("Smelting", "config.smelting");

		if (config.hasChanged())
			config.save();
	}
}