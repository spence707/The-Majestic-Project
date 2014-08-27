package ca.scp.tmp.items;

import ca.scp.tmp.lib.TMP_Armor;
import ca.scp.tmp.lib.TMP_ArmorMaterials;
import ca.scp.tmp.lib.TMP_ToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.util.IIcon;

public class TMP_Items {
	
	public static Item stone_stick;
	public static Item iron_stick;	
	public static Item ruby;
	public static Item sapphire;
	// Reinforced Iron Tools
	public static Item ris;
	public static Item rip;
	public static Item ria;
	public static Item rish;
	public static Item rih;
	// Reinforced Gold Tools
	public static Item rgs;
	public static Item rgp;
	public static Item rga;
	public static Item rgsh;
	public static Item rgh;
	// Reinforced Diamond Tools
	public static Item rds;
	public static Item rdp;
	public static Item rda;
	public static Item rdsh;
	public static Item rdh;
	// Ruby Tools
	public static Item rs;
	public static Item rp;
	public static Item ra;
	public static Item rsh;
	public static Item rh;
	// Sapphire Tools
	public static Item ss;
	public static Item sp;
	public static Item sa;
	public static Item ssh;
	public static Item sh;
	// Reinforced Ruby Tools
	public static Item rrs;
	public static Item rrp;
	public static Item rra;
	public static Item rrsh;
	public static Item rrh;
	// Reinforced Sapphire Tools
	public static Item srs;
	public static Item srp;
	public static Item sra;
	public static Item srsh;
	public static Item srh;
	// Ruby Armor
	public static Item rah;
	public static Item rac;
	public static Item ral;
	public static Item rab;
	// Sapphire Armor
	public static Item sah;
	public static Item sac;
	public static Item sal;
	public static Item sab;
	
	public static void registerItems(){
		
		stone_stick = new Item().setUnlocalizedName("stone_stick").setTextureName("tmp:stone_stick").setCreativeTab(CreativeTabs.tabMaterials);
		iron_stick = new Item().setUnlocalizedName("iron_stick").setTextureName("tmp:iron_stick").setCreativeTab(CreativeTabs.tabMaterials);
		ruby = new Item().setUnlocalizedName("ruby").setTextureName("tmp:ruby").setCreativeTab(CreativeTabs.tabMaterials);
		sapphire = new Item().setUnlocalizedName("sapphire").setTextureName("tmp:sapphire").setCreativeTab(CreativeTabs.tabMaterials);
		// Reinforced Iron Tools
		ris = new TMP_ItemSword(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("ris").setTextureName("tmp:iron_iron_sword");
		rip = new TMP_ItemPickaxe(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rip").setTextureName("tmp:iron_iron_pickaxe");
		ria = new TMP_ItemAxe(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("ria").setTextureName("tmp:iron_iron_axe");
		rish = new TMP_ItemSpade(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rish").setTextureName("tmp:iron_iron_shovel");
		rih = new TMP_ItemHoe(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rih").setTextureName("tmp:iron_iron_hoe");
		// Reinforced Gold Tools
		rgs = new TMP_ItemSword(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rgs").setTextureName("tmp:iron_gold_sword");
		rgp = new TMP_ItemPickaxe(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rgp").setTextureName("tmp:iron_gold_pickaxe");
		rga = new TMP_ItemAxe(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rga").setTextureName("tmp:iron_gold_axe");
		rgsh = new TMP_ItemSpade(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rgsh").setTextureName("tmp:iron_gold_shovel");
		rgh = new TMP_ItemHoe(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rgh").setTextureName("tmp:iron_gold_hoe");		
		// Reinforced Diamond Tools
		rds = new TMP_ItemSword(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rds").setTextureName("tmp:iron_diamond_sword");
		rdp = new TMP_ItemPickaxe(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rdp").setTextureName("tmp:iron_diamond_pickaxe");
		rda = new TMP_ItemAxe(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rda").setTextureName("tmp:iron_diamond_axe");
		rdsh = new TMP_ItemSpade(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rdsh").setTextureName("tmp:iron_diamond_shovel");
		rdh = new TMP_ItemHoe(TMP_ToolMaterials.reinforced_iron).setUnlocalizedName("rdh").setTextureName("tmp:iron_diamond_hoe");
		// Ruby Tools
		rs = new TMP_ItemSword(TMP_ToolMaterials.RUBY).setUnlocalizedName("rs").setTextureName("tmp:sword_ruby");
		rp = new TMP_ItemPickaxe(TMP_ToolMaterials.RUBY).setUnlocalizedName("rp").setTextureName("tmp:pickaxe_ruby");
		ra = new TMP_ItemAxe(TMP_ToolMaterials.RUBY).setUnlocalizedName("ra").setTextureName("tmp:axe_ruby");
		rsh = new TMP_ItemSpade(TMP_ToolMaterials.RUBY).setUnlocalizedName("rsh").setTextureName("tmp:shovel_ruby");
		rh = new TMP_ItemHoe(TMP_ToolMaterials.RUBY).setUnlocalizedName("rh").setTextureName("tmp:hoe_ruby");
		// Sapphire Tools
		ss = new TMP_ItemSword(TMP_ToolMaterials.RUBY).setUnlocalizedName("ss").setTextureName("tmp:sword_sapphire");
		sp = new TMP_ItemPickaxe(TMP_ToolMaterials.RUBY).setUnlocalizedName("sp").setTextureName("tmp:pickaxe_sapphire");
		sa = new TMP_ItemAxe(TMP_ToolMaterials.RUBY).setUnlocalizedName("sa").setTextureName("tmp:axe_sapphire");
		ssh = new TMP_ItemSpade(TMP_ToolMaterials.RUBY).setUnlocalizedName("ssh").setTextureName("tmp:shovel_sapphire");
		sh = new TMP_ItemHoe(TMP_ToolMaterials.RUBY).setUnlocalizedName("sh").setTextureName("tmp:hoe_sapphire");
		// Reinforced Ruby Tools
		rrs = new TMP_ItemSword(TMP_ToolMaterials.reinforced_ruby).setUnlocalizedName("rrs").setTextureName("tmp:iron_ruby_sword");
		rrp = new TMP_ItemPickaxe(TMP_ToolMaterials.reinforced_ruby).setUnlocalizedName("rrp").setTextureName("tmp:iron_ruby_pickaxe");
		rra = new TMP_ItemAxe(TMP_ToolMaterials.reinforced_ruby).setUnlocalizedName("rra").setTextureName("tmp:iron_ruby_axe");
		rrsh = new TMP_ItemSpade(TMP_ToolMaterials.reinforced_ruby).setUnlocalizedName("rrsh").setTextureName("tmp:iron_ruby_shovel");
		rrh = new TMP_ItemHoe(TMP_ToolMaterials.reinforced_ruby).setUnlocalizedName("rrh").setTextureName("tmp:iron_ruby_hoe");
		// Reinforced Sapphire Tools
		srs = new TMP_ItemSword(TMP_ToolMaterials.reinforced_ruby).setUnlocalizedName("srs").setTextureName("tmp:iron_sapphire_sword");
		srp = new TMP_ItemPickaxe(TMP_ToolMaterials.reinforced_ruby).setUnlocalizedName("srp").setTextureName("tmp:iron_sapphire_pickaxe");
		sra = new TMP_ItemAxe(TMP_ToolMaterials.reinforced_ruby).setUnlocalizedName("sra").setTextureName("tmp:iron_sapphire_axe");
		srsh = new TMP_ItemSpade(TMP_ToolMaterials.reinforced_ruby).setUnlocalizedName("srsh").setTextureName("tmp:iron_sapphire_shovel");
		srh = new TMP_ItemHoe(TMP_ToolMaterials.reinforced_ruby).setUnlocalizedName("srh").setTextureName("tmp:iron_sapphire_hoe");
		// Ruby Armor
		rah = new TMP_Armor(TMP_ArmorMaterials.RUBY_ARMOR, 3, 0, "ruby", "rah", "ruby_helment");
		rac = new TMP_Armor(TMP_ArmorMaterials.RUBY_ARMOR, 3, 1, "ruby", "rac", "ruby_chestplate");
		ral = new TMP_Armor(TMP_ArmorMaterials.RUBY_ARMOR, 3, 2, "ruby", "ral", "ruby_leggings");
		rab = new TMP_Armor(TMP_ArmorMaterials.RUBY_ARMOR, 3, 3, "ruby", "rab", "ruby_boots");
		// Sapphire Armor
		sah = new TMP_Armor(TMP_ArmorMaterials.RUBY_ARMOR, 3, 0, "sapphire", "sah", "sapphire_helment");
		sac = new TMP_Armor(TMP_ArmorMaterials.RUBY_ARMOR, 3, 1, "sapphire", "sac", "sapphire_chestplate");
		sal = new TMP_Armor(TMP_ArmorMaterials.RUBY_ARMOR, 3, 2, "sapphire", "sal", "sapphire_leggings");
		sab = new TMP_Armor(TMP_ArmorMaterials.RUBY_ARMOR, 3, 3, "sapphire", "sab", "sapphire_boots");
		
		GameRegistry.registerItem(stone_stick, "stone_stick");
		GameRegistry.registerItem(iron_stick, "iron_stick");
		GameRegistry.registerItem(ruby, "ruby");
		GameRegistry.registerItem(sapphire, "sapphire");
		// Reinforced Iron Tools
		GameRegistry.registerItem(ris, "ris");
		GameRegistry.registerItem(rip, "rip");
		GameRegistry.registerItem(ria, "ria");
		GameRegistry.registerItem(rish, "rish");
		GameRegistry.registerItem(rih, "rih");
		// Reinforced Gold Tools
		GameRegistry.registerItem(rgs, "rgs");
		GameRegistry.registerItem(rgp, "rgp");
		GameRegistry.registerItem(rga, "rga");
		GameRegistry.registerItem(rgsh, "rgsh");
		GameRegistry.registerItem(rgh, "rgh");
		// Reinforced Diamond Tools
		GameRegistry.registerItem(rds, "rds");
		GameRegistry.registerItem(rdp, "rdp");
		GameRegistry.registerItem(rda, "rda");
		GameRegistry.registerItem(rdsh, "rdsh");
		GameRegistry.registerItem(rdh, "rdh");
		// Ruby Tools
		GameRegistry.registerItem(rs, "rs");
		GameRegistry.registerItem(rp, "rp");
		GameRegistry.registerItem(ra, "ra");
		GameRegistry.registerItem(rsh, "rsh");
		GameRegistry.registerItem(rh, "rh");
		// Sapphire Tools
		GameRegistry.registerItem(ss, "ss");
		GameRegistry.registerItem(sp, "sp");
		GameRegistry.registerItem(sa, "sa");
		GameRegistry.registerItem(ssh, "ssh");
		GameRegistry.registerItem(sh, "sh");
		// Reinforced Ruby Tools
		GameRegistry.registerItem(rrs, "rrs");
		GameRegistry.registerItem(rrp, "rrp");
		GameRegistry.registerItem(rra, "rra");
		GameRegistry.registerItem(rrsh, "rrsh");
		GameRegistry.registerItem(rrh, "rrh");
		// Reinforced Sapphire Tools
		GameRegistry.registerItem(srs, "srs");
		GameRegistry.registerItem(srp, "srp");
		GameRegistry.registerItem(sra, "sra");
		GameRegistry.registerItem(srsh, "srsh");
		GameRegistry.registerItem(srh, "srh");
		// Ruby Armor
		GameRegistry.registerItem(rah, "rah");
		GameRegistry.registerItem(rac, "rac");
		GameRegistry.registerItem(ral, "ral");
		GameRegistry.registerItem(rab, "rab");
		// Sapphire Armor
		GameRegistry.registerItem(sah, "sah");
		GameRegistry.registerItem(sac, "sac");
		GameRegistry.registerItem(sal, "sal");
		GameRegistry.registerItem(sab, "sab");
		
	}
	
}
