package ca.scp.tmp.block;

import java.util.Random;

import ca.scp.tmp.items.TMP_Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TMP_BlockOre extends Block {

	public TMP_BlockOre(Material material, String name, String texture){
		
		super(material);
		this.canSilkHarvest();
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundTypePiston);
		this.setBlockName(name);
		this.setBlockTextureName(texture);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	   public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return this == TMP_Blocks.ruby_ore ? TMP_Items.ruby : (this == TMP_Blocks.sapphire_ore ? TMP_Items.sapphire : Item.getItemFromBlock(this));
	    }
		
}
	
