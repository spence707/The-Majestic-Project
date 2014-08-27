package ca.scp.tmp;

import ca.scp.tmp.block.TMP_Blocks;
import ca.scp.tmp.items.TMP_Items;
import ca.scp.tmp.lib.LogHelper;
import ca.scp.tmp.lib.TMP_Recipes;
import ca.scp.tmp.proxy.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TMP.MODID, name=TMP.NAME, version = TMP.VERSION)
public class TMP
{
    public static final String MODID = "tmp";
    public static final String VERSION = "1.0";
    public static final String NAME = "The Majestic Project";
    
    @SidedProxy(clientSide = "ca.scp.tmp.proxy.ClientProxy", serverSide = "ca.scp.tmp.proxy.ServerProxy") 
	public static ServerProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	LogHelper.info("*****TMP Pre-Initialization Complete!*****");
    	
    	TMP_Blocks.registerBlocks();
    	TMP_Items.registerItems();
    	GameRegistry.registerWorldGenerator(new TMP_WorldGenerator(), 1);
    	TMP_Recipes.registerRecipes();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	LogHelper.info("*****TMP Initialization Complete!*****");
    }
}
