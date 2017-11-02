package fr.hexapladev.hexaplagui;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Defaults HexaplaGui Settings (can be edit)
 * 
 * @author RedSpri
 */
public class DefaultSettings {
	private String name = "§r";
	private Integer lines = 1;
	private Boolean backenable = false;
	private Boolean closeenable = false;
	private Integer backposition = 0;
	private Integer closeposition = 0;
	private ItemStack backitem = new ItemStack(Material.ARROW);
	private ItemStack closeitem = new ItemStack(Material.BARRIER);
	{
		ItemMeta backmeta = backitem.getItemMeta();
		backmeta.setLore(Arrays.asList(new String[]{"§eClick to return to the previous menu"}));
		backmeta.setDisplayName("§cReturn");
		backitem.setItemMeta(backmeta);
		ItemMeta closemeta = closeitem.getItemMeta();
		closemeta.setLore(Arrays.asList(new String[]{"§eClick to leave the current menu"}));
		closemeta.setDisplayName("§cLave");
		closeitem.setItemMeta(closemeta);
	}
	public String getName() {
		return name;
	}
	
	public Integer getLines() {
		return lines;
	}
	
	public Boolean isBackEnable() {
		return backenable;
	}
	
	public Boolean isCloseEnable() {
		return closeenable;
	}
	
	public Integer getBackPosition() {
		return backposition;
	}
	
	public Integer getClosePosition() {
		return closeposition;
	}
	
	public ItemStack getBackItem() {
		return backitem;
	}
	
	public ItemStack getCloseItem() {
		return closeitem;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLines(Integer lines) {
		this.lines = lines;
	}
	
	public void setBackEnable(Boolean backenable) {
		this.backenable = backenable;
	}
	
	public void setCloseEnable(Boolean closeenable) {
		this.closeenable = closeenable;
	}
	
	public void setBackPosition(Integer backposition) {
		this.backposition = backposition;
	}
	
	public void setClosePosition(Integer closeposition) {
		this.closeposition = closeposition;
	}
	
	public void setBackItem(ItemStack backitem) {
		this.backitem = backitem;
	}
	
	public void setCloseItem(ItemStack closeitem) {
		this.closeitem = closeitem;
	}
	
	
}
