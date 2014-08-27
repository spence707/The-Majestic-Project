package ca.scp.tmp.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class TMP_ItemHoe extends ItemHoe {

	public TMP_ItemHoe(ToolMaterial reinforced_iron){
		
		super(reinforced_iron);
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}
	
}
