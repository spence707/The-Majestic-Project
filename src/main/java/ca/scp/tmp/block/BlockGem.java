package ca.scp.tmp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGem extends Block{

	public BlockGem(){
		
		super(Material.iron);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(4.5F);
		this.setResistance(10.0F);
		this.setStepSound(Block.soundTypeMetal);
		
	}
	
}
