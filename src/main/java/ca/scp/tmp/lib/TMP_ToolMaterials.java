package ca.scp.tmp.lib;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class TMP_ToolMaterials {
	
	// Doubles Number of Uses
	public static Item.ToolMaterial reinforced_iron = EnumHelper.addToolMaterial("reinforced_iron", 2, 500, 6.0F, 2.0F, 14); 
	public static Item.ToolMaterial reinforced_gold = EnumHelper.addToolMaterial("reinforced_gold", 0, 64, 12.0F, 0.0F, 22); 
	public static Item.ToolMaterial reinforced_diamond = EnumHelper.addToolMaterial("reinforced_diamond", 3, 3122, 8.0F, 3.0F, 10);
	public static Item.ToolMaterial reinforced_ruby = EnumHelper.addToolMaterial("reinforced_ruby", 3, 1561, 8.0F, 3.0F, 10);
	
	// Doubles Enchantment ability
	//public static Item.ToolMaterial gold_reinforced_iron = EnumHelper.addToolMaterial("gold_reinforced_iron", 2, 250, 6.0F, 2.0F, 28); 
	//public static Item.ToolMaterial gold_reinforced_gold = EnumHelper.addToolMaterial("gold_reinforced_gold", 2, 32, 12.0F, 0.0F, 44); 
	//public static Item.ToolMaterial gold_reinforced_diamond = EnumHelper.addToolMaterial("gold_reinforced_diamond", 3, 1561, 8.0F, 3.0F, 20);
	//public static Item.ToolMaterial gold_reinforced_ruby = EnumHelper.addToolMaterial("reinforced_ruby", 3, 780, 8.0F, 3.0F, 20);
	
	// Doubles Number of Uses and Enchantment ability
	//public static Item.ToolMaterial diamond_reinforced_iron = EnumHelper.addToolMaterial("diamond_reinforced_iron", 2, 500, 6.0F, 2.0F, 28); 
	//public static Item.ToolMaterial diamond_reinforced_gold = EnumHelper.addToolMaterial("diamond_reinforced_gold", 2, 64, 12.0F, 0.0F, 44); 
	//public static Item.ToolMaterial diamond_reinforced_diamond = EnumHelper.addToolMaterial("diamond_reinforced_diamond", 3, 3122, 8.0F, 3.0F, 20); 
	//public static Item.ToolMaterial diamond_reinforced_ruby = EnumHelper.addToolMaterial("reinforced_ruby", 3, 1561, 8.0F, 3.0F, 20);
	
	// More frequent and same harvest but half the durability than diamond
	public static Item.ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 3, 780, 8.0F, 3.0F, 15);
	
}
