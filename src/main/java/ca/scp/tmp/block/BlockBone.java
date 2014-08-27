package ca.scp.tmp.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBone extends Block{

	protected BlockBone(Material material) {
		
		super(material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	
	}

}
