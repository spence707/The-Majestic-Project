package ca.scp.tmp.block;

import ca.scp.tmp.items.TMP_Items;
import ca.scp.tmp.lib.TMP_Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TMP_Blocks {
	
	public static Block glow_glass;
	public static Block stone_torch;
	public static Block clear_glass;
	public static Block clear_glow_glass;
	public static Block stained_glow_glass;
	public static Block pearl_block;
	public static Block bone_block;
	public static Block ruby_block;
	public static Block ruby_ore;
	public static Block sapphire_block;
	public static Block sapphire_ore;
	
	public static void registerBlocks(){
		
    	glow_glass = new TMP_BlockGlass(Material.glass).setBlockName("glow_glass").setHardness(0.3F).setLightLevel(1.0F).setBlockTextureName("glass");
    	clear_glass = new TMP_BlockGlass(Material.glass).setBlockName("clear_glass").setHardness(0.3F).setBlockTextureName("tmp:clear_glass");
    	clear_glow_glass = new TMP_BlockGlass(Material.glass).setBlockName("clear_glow_glass").setHardness(0.3F).setLightLevel(1.0F).setBlockTextureName("tmp:clear_glass");
    	stained_glow_glass = new BlockStainedGlass(Material.glass).setBlockName("stained_glow_glass").setCreativeTab(TMP_Tabs.tabGlass).setHardness(3.0F).setLightLevel(1.0F).setBlockTextureName("glass");
    	stone_torch = new TMP_BlockTorch().setHardness(1.5F).setLightLevel(1.0F).setBlockName("stone_torch").setBlockTextureName("tmp:stone_torch_on");
    	pearl_block = new BlockPearl(Material.cloth).setHardness(1.0F).setBlockName("pearl_block").setBlockTextureName("tmp:pearl_block");
    	bone_block = new BlockBone(Material.wood).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundTypeWood).setBlockName("bone_block").setBlockTextureName("tmp:bone_block");
    	ruby_block = new BlockGem().setBlockName("ruby_block").setBlockTextureName("tmp:ruby_block");
    	ruby_ore = new TMP_BlockOre(Material.iron, "ruby_ore", "tmp:ruby_ore");
    	sapphire_block = new BlockGem().setBlockName("ruby_block").setBlockTextureName("tmp:sapphire_block");
    	sapphire_ore = new TMP_BlockOre(Material.iron, "sapphire_ore", "tmp:sapphire_ore");
    	
    	GameRegistry.registerBlock(glow_glass, "glow_glass");
    	GameRegistry.registerBlock(clear_glass, "clear_glass");
    	GameRegistry.registerBlock(clear_glow_glass, "clear_glow_glass");
    	GameRegistry.registerBlock(stained_glow_glass, "stained_glow_glass");
    	GameRegistry.registerBlock(stone_torch, "stone_torch");
    	GameRegistry.registerBlock(pearl_block, "pearl_block");
    	GameRegistry.registerBlock(bone_block, "bone_block");
    	GameRegistry.registerBlock(ruby_block, "ruby_block");
    	GameRegistry.registerBlock(ruby_ore, "ruby_ore");
    	GameRegistry.registerBlock(sapphire_block, "sapphire_block");
    	GameRegistry.registerBlock(sapphire_ore, "sapphire_ore");
    	
	}

}
