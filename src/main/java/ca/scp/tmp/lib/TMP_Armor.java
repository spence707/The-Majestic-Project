package ca.scp.tmp.lib;

import ca.scp.tmp.TMP;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TMP_Armor extends ItemArmor {

	private String modelTexture;
	
	public TMP_Armor(ArmorMaterial material, int renderIndex, int armorPart, String modelTexture, String setUnlocalName, String textureName) {
		super(material, renderIndex, armorPart);
		this.modelTexture = TMP.MODID + ":" + "textures/models/armor/";
		this.modelTexture += modelTexture + "_layer_";
		this.setUnlocalizedName(setUnlocalName);
		this.setTextureName("tmp:"+ textureName);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String RenderingType){
		
		if(this.armorType == 2){
			
			return this.modelTexture + "2.png";
			
		}else{
			
			return this.modelTexture + "1.png";
			
		}
		
	}

}
