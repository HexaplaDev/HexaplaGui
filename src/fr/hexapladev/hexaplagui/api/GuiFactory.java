package fr.hexapladev.hexaplagui.api;

import fr.hexapladev.hexaplagui.HexaplaGui;

import org.bukkit.inventory.ItemStack;

/**
 * The factory of a Gui Object
 * 
 * @author RedSpri
 *
 */
public class GuiFactory {
	private String name = HexaplaGui.getDefaultSettings().getName();
	private Integer lines = HexaplaGui.getDefaultSettings().getLines();
	private Boolean backenable = HexaplaGui.getDefaultSettings().isBackEnable();
	private Boolean closeenable = HexaplaGui.getDefaultSettings().isCloseEnable();
	private Integer backposition = HexaplaGui.getDefaultSettings().getBackPosition();
	private Integer closeposition = HexaplaGui.getDefaultSettings().getClosePosition();
	private ItemStack backitem = HexaplaGui.getDefaultSettings().getBackItem();
	private ItemStack closeitem = HexaplaGui.getDefaultSettings().getCloseItem();
	
	
	public GuiFactory(String name) {
		this.name = name;
	}
	
	public GuiFactory(Integer lines) {
		this.lines = lines;
	}
	
	public GuiFactory(String name, Integer lines) {
		this.name = name;
		this.lines = lines;
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
}
