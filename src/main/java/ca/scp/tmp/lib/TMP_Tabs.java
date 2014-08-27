package ca.scp.tmp.lib;

import ca.scp.tmp.block.TMP_Blocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TMP_Tabs {
	
	public static CreativeTabs tabGlass = new CreativeTabs("tabGlass"){
		
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			
			return Item.getItemFromBlock(TMP_Blocks.clear_glow_glass);
			
		}
	};

}
