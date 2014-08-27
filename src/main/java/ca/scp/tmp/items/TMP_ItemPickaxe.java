package ca.scp.tmp.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class TMP_ItemPickaxe extends ItemPickaxe{

	public TMP_ItemPickaxe(ToolMaterial reinforced_iron) {
		
		super(reinforced_iron);
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}

}
