package ca.scp.tmp.lib;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ca.scp.tmp.block.TMP_Blocks;
import ca.scp.tmp.items.TMP_Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class TMP_Recipes {

	public static void registerRecipes(){
	// Crafting Recipes
		
	// The Majestic Project Crafting Recipes
		
		// Stone Stick
		GameRegistry.addRecipe(new ItemStack(TMP_Items.stone_stick, 4), new Object[]{" S ", " S ", 'S', Blocks.stone});
		// Iron Stick
		GameRegistry.addRecipe(new ItemStack(TMP_Items.iron_stick), new Object[]{
			" S ", " S ", 'S', Items.iron_ingot});
		// Glow Glass
		GameRegistry.addShapelessRecipe(new ItemStack(TMP_Blocks.glow_glass), new Object[]{
			Blocks.glass, Blocks.glowstone });
		// Stone Torch
		GameRegistry.addRecipe(new ItemStack(TMP_Blocks.stone_torch, 4), new Object[]{" C ", " S ", 'S', TMP_Items.stone_stick, 'C', Items.coal});		
		GameRegistry.addRecipe(new ItemStack(TMP_Blocks.stone_torch, 4), new Object[]{"C  ", "S  ", 'S', TMP_Items.stone_stick, 'C', Items.coal});	
		GameRegistry.addRecipe(new ItemStack(TMP_Blocks.stone_torch, 4), new Object[]{" C ", " S ", 'S', TMP_Items.stone_stick, 'C', new ItemStack(Items.coal, 1, 1)});	
		GameRegistry.addRecipe(new ItemStack(TMP_Blocks.stone_torch, 4), new Object[]{"C  ", "S  ", 'S', TMP_Items.stone_stick, 'C', new ItemStack(Items.coal, 1, 1)});	
		// Pearl Block
		GameRegistry.addRecipe(new ItemStack(TMP_Blocks.pearl_block), new Object[]{"PPP", "PPP", "PPP", 'P', Items.ender_pearl});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl, 9), new Object[]{TMP_Blocks.pearl_block});
		// Ruby Block
		GameRegistry.addRecipe(new ItemStack(TMP_Blocks.ruby_block), new Object[]{"RRR", "RRR", "RRR", 'R', TMP_Items.ruby});
		GameRegistry.addShapelessRecipe(new ItemStack(TMP_Items.ruby, 9), new Object[]{TMP_Blocks.ruby_block});
		// Sapphire Block
		GameRegistry.addRecipe(new ItemStack(TMP_Blocks.sapphire_block), new Object[]{"RRR", "RRR", "RRR", 'R', TMP_Items.sapphire});
		GameRegistry.addShapelessRecipe(new ItemStack(TMP_Items.sapphire, 9), new Object[]{TMP_Blocks.sapphire_block});		
		// Iron Reinforced Tools
			// Swords
		GameRegistry.addRecipe(new ItemStack(TMP_Items.ris), new Object[]{" Y ", " Y ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.ris), new Object[]{"Y  ", "Y  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rgs), new Object[]{" Y ", " Y ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rgs), new Object[]{"Y  ", "Y  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rds), new Object[]{" Y ", " Y ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rds), new Object[]{"Y  ", "Y  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rrs), new Object[]{" Y ", " Y ", " X ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rrs), new Object[]{"Y  ", "Y  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.srs), new Object[]{" Y ", " Y ", " X ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.sapphire});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.srs), new Object[]{"Y  ", "Y  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.sapphire});
			// Pickaxes
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rip), new Object[]{"YYY", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rgp), new Object[]{"YYY", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rdp), new Object[]{
			"YYY", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rrp), new Object[]{
			"YYY", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.srp), new Object[]{
			"YYY", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.sapphire});
			// Axe
		GameRegistry.addRecipe(new ItemStack(TMP_Items.ria), new Object[]{
			"YY ", "YX ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.ria), new Object[]{
			"YY ", "XY ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rga), new Object[]{
			"YY ", "YX ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rga), new Object[]{
			"YY ", "XY ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rda), new Object[]{
			"YY ", "YX ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rda), new Object[]{
			"YY ", "XY ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rra), new Object[]{
			"YY ", "YX ", " X ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rra), new Object[]{
			"YY ", "XY ", "X  ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.sra), new Object[]{
			"YY ", "YX ", " X ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.sapphire});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.sra), new Object[]{
			"YY ", "XY ", "X  ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.sapphire});
			// Shovel
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rish), new Object[]{
			" Y ", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rish), new Object[]{
			"Y  ", "X  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rgsh), new Object[]{
			" Y ", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rgsh), new Object[]{
			"Y  ", "X  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rdsh), new Object[]{
			" Y ", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rdsh), new Object[]{
			"Y  ", "X  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rrsh), new Object[]{
			" Y ", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rrsh), new Object[]{
			"Y  ", "X  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.srsh), new Object[]{
			" Y ", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.sapphire});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.srsh), new Object[]{
			"Y  ", "X  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.sapphire});
			// Hoe
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rih), new Object[]{
			"YY ", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rih), new Object[]{
			"YY ", "X  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rgh), new Object[]{
			"YY ", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rgh), new Object[]{
			"YY ", "X  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rdh), new Object[]{
			"YY ", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rdh), new Object[]{
			"YY ", "X  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rrh), new Object[]{
			"YY ", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rrh), new Object[]{
			"YY ", "X  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.srh), new Object[]{
			"YY ", " X ", " X ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.sapphire});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.srh), new Object[]{
			"YY ", "X  ", "X  ", 'X', TMP_Items.iron_stick, 'Y', TMP_Items.sapphire});
		// Ruby Set
			// Sword
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rs), new Object[]{	" Y ", " Y ", " X ", 'X', Items.stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rs), new Object[]{	"Y  ", "Y  ", "X  ", 'X', Items.stick, 'Y', TMP_Items.ruby});
			// Pickaxe
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rp), new Object[]{"YYY", " X ", " X ", 'X', Items.stick, 'Y', TMP_Items.ruby});
			// Axe
		GameRegistry.addRecipe(new ItemStack(TMP_Items.ra), new Object[]{"YY ", "YX ", " X ", 'X', Items.stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.ra), new Object[]{"YY ", "XY ", "X  ", 'X', Items.stick, 'Y', TMP_Items.ruby});
			// Shovel
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rsh), new Object[]{" Y ", " X ", " X ", 'X', Items.stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rsh), new Object[]{"Y  ", "X  ", "X  ", 'X', Items.stick, 'Y', TMP_Items.ruby});
			// Hoe
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rh), new Object[]{"YY ", " X ", " X ", 'X', Items.stick, 'Y', TMP_Items.ruby});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.rh), new Object[]{"YY ", "X  ", "X  ", 'X', Items.stick, 'Y', TMP_Items.ruby});
		// Sapphire Set
			// Sword
		GameRegistry.addRecipe(new ItemStack(TMP_Items.ss), new Object[]{" Y ", " Y ", " X ", 'X', Items.stick, 'Y', TMP_Items.sapphire});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.ss), new Object[]{"Y  ", "Y  ", "X  ", 'X', Items.stick, 'Y', TMP_Items.sapphire});
			// Pickaxe
		GameRegistry.addRecipe(new ItemStack(TMP_Items.sp), new Object[]{"YYY", " X ", " X ", 'X', Items.stick, 'Y', TMP_Items.sapphire});
			// Axe
		GameRegistry.addRecipe(new ItemStack(TMP_Items.sa), new Object[]{"YY ", "YX ", " X ", 'X', Items.stick, 'Y', TMP_Items.sapphire});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.sa), new Object[]{"YY ", "XY ", "X  ", 'X', Items.stick, 'Y', TMP_Items.sapphire});
			// Shovel
		GameRegistry.addRecipe(new ItemStack(TMP_Items.ssh), new Object[]{" Y ", " X ", " X ", 'X', Items.stick, 'Y', TMP_Items.sapphire});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.ssh), new Object[]{"Y  ", "X  ", "X  ", 'X', Items.stick, 'Y', TMP_Items.sapphire});
			// Hoe
		GameRegistry.addRecipe(new ItemStack(TMP_Items.sh), new Object[]{"YY ", " X ", " X ", 'X', Items.stick, 'Y', TMP_Items.sapphire});
		GameRegistry.addRecipe(new ItemStack(TMP_Items.sh), new Object[]{"YY ", "X  ", "X  ", 'X', Items.stick, 'Y', TMP_Items.sapphire});
		
	// Extra Minecraft Crafting Recipes
		
		// Grass
		GameRegistry.addRecipe(new ItemStack(Blocks.grass), new Object[]{"S  ","D  ", 'S', Items.wheat_seeds, 'D', Blocks.dirt});
		// Grass
		GameRegistry.addRecipe(new ItemStack(Blocks.grass), new Object[]{"S  ","D  ", 'S', Blocks.vine, 'D', Blocks.dirt});
		// Grass
		GameRegistry.addRecipe(new ItemStack(Blocks.grass, 6), new Object[]{"SSS","DDD","DDD", 'S', Items.wheat_seeds, 'D', Blocks.dirt});
		// Grass
		GameRegistry.addRecipe(new ItemStack(Blocks.grass, 6), new Object[]{"SSS","DDD","DDD", 'S', Blocks.vine, 'D', Blocks.dirt});
		// Mycelium
		GameRegistry.addRecipe(new ItemStack(Blocks.mycelium, 6), new Object[]{"SSS","DDD","DDD", 'S', Blocks.brown_mushroom, 'D', Blocks.dirt});
		// Mycelium
		GameRegistry.addRecipe(new ItemStack(Blocks.mycelium, 6), new Object[]{"SSS","DDD","DDD", 'S', Blocks.red_mushroom, 'D', Blocks.dirt});
		// Mycelium
		GameRegistry.addRecipe(new ItemStack(Blocks.mycelium), new Object[]{"S  ","D  ", 'S', Blocks.red_mushroom, 'D', Blocks.dirt});
		// Mycelium
		GameRegistry.addRecipe(new ItemStack(Blocks.mycelium), new Object[]{"S  ","D  ", 'S', Blocks.brown_mushroom, 'D', Blocks.dirt});
		// Name Tag
		GameRegistry.addRecipe(new ItemStack(Items.name_tag, 2), new Object[]{"S  ","D  ", 'S', Items.paper, 'D', Items.iron_ingot});
		// Ice Block
		GameRegistry.addRecipe(new ItemStack(Blocks.ice, 16), new Object[]{"SSS", "SWS", "SSS", 'S', Blocks.snow, 'W', Items.water_bucket});
		// Sponge
		GameRegistry.addRecipe(new ItemStack(Blocks.sponge, 8), new Object[]{"SSS", "SWS", "SSS", 'S', Blocks.wool, 'W', Items.bucket});
		// Exp Bottle
		GameRegistry.addRecipe(new ItemStack(Blocks.ice, 16), new Object[]{" S ", "SWS", " S ", 'S', Items.glass_bottle, 'W', Items.diamond});
		// Nether Star	
		GameRegistry.addRecipe(new ItemStack(Items.nether_star), new Object[]{"OSO", "DWD", "OSO", 'O', Blocks.obsidian, 'S', Blocks.soul_sand, 'D', Blocks.diamond_block, 'W', new ItemStack(Items.skull, 1, 1)});
		// Web
		GameRegistry.addRecipe(new ItemStack(Blocks.web), new Object[]{"S S", " S ", "S S", 'S', Items.string});
		// Wool
		GameRegistry.addRecipe(new ItemStack(Blocks.wool), new Object[]{"SS ", "SS ", 'S', Items.string});
		// Chainmail Helmet
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), new Object[]{"III", "I I", 'I', Blocks.iron_bars});
		// Chainmail Chestplate
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate), new Object[]{"I I", "III", "III", 'I', Blocks.iron_bars});
		// Chainmail Leggings
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings), new Object[]{"III", "I I", "I I", 'I', Blocks.iron_bars});
		// Chainmail Boots
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), new Object[]{"I I", "I I", 'I', Blocks.iron_bars});
		// Diamond Horse Armor
		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor), new Object[]{"  D", "DDB", "III", 'I', Items.iron_ingot, 'B', Blocks.diamond_block, 'D', Items.diamond});
		// Gold Horse Armor
		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor), new Object[]{"  D", "DDB", "III", 'I', Items.iron_ingot, 'B', Blocks.gold_block, 'D', Items.gold_ingot});
		// Iron Horse Armro
		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor), new Object[]{"  I", "IIB", "III", 'I', Items.iron_ingot, 'B', Blocks.iron_block, });
		// Saddle
		GameRegistry.addRecipe(new ItemStack(Items.saddle), new Object[]{"LLL", "WWW", "SIS", 'I', Items.iron_ingot, 'W', Blocks.wool, 'S', Items.string, 'L', Items.leather});
		// Dragon Egg
		GameRegistry.addRecipe(new ItemStack(Blocks.dragon_egg), new Object[]{"OPO", "DED", "OPO", 'O', Blocks.obsidian, 'P', Items.ender_pearl, 'D', Blocks.diamond_block, 'E', Items.egg});
		// Obsidian
		GameRegistry.addRecipe(new ItemStack(Items.nether_star), new Object[]{"LLL", "LWL", "LLL", 'L', Items.lava_bucket, 'W', Items.water_bucket});
		
	// Furnace Recipes
		
	// The Majestic Project Furnace Recipes
		
		// Clear Glass
		GameRegistry.addSmelting(Blocks.glass, new ItemStack(TMP_Blocks.clear_glass), 0.1F);
		// Clear Glow Glass
		GameRegistry.addSmelting(TMP_Blocks.glow_glass, new ItemStack(TMP_Blocks.clear_glow_glass), 0.1F);
		
	// Extra Minecraft Furnace Recipes
		
		// Leather
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 0.1F);
		
	}
	
}
