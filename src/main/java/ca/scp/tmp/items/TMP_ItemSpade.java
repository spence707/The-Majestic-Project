package ca.scp.tmp.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class TMP_ItemSpade extends ItemSpade {

	public TMP_ItemSpade(ToolMaterial reinforced_iron) {
		
		super(reinforced_iron);
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}

}
