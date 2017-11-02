package fr.hexapladev.hexaplagui.api;

import org.bukkit.inventory.ItemStack;

import fr.hexapladev.hexaplagui.HexaplaGui;

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
	
	
	GuiFactory(String name) {
		this.name = name;
	}
	
	GuiFactory(Integer lines) {
		this.lines = lines;
	}
	
	GuiFactory(String name, Integer lines) {
		this.name = name;
		this.lines = lines;
	}
	
	String getName() {
		return name;
	}
	
	Integer getLines() {
		return lines;
	}
	
	Boolean isBackEnable() {
		return backenable;
	}
	
	Boolean isCloseEnable() {
		return closeenable;
	}
	
	Integer getBackPosition() {
		return backposition;
	}
	
	Integer getClosePosition() {
		return closeposition;
	}
	
	ItemStack getBackItem() {
		return backitem;
	}
	
	ItemStack getCloseItem() {
		return closeitem;
	}
	
	public GuiFactory setName(String name) {
		this.name = name;
		return this;
	}
	
	public GuiFactory setLines(Integer lines) {
		this.lines = lines;
		return this;
	}
	
	public GuiFactory setBackEnable(Boolean backenable) {
		this.backenable = backenable;
		return this;
	}
	
	public GuiFactory setCloseEnable(Boolean closeenable) {
		this.closeenable = closeenable;
		return this;
	}
	
	public GuiFactory setBackPosition(Integer backposition) {
		this.backposition = backposition;
		return this;
	}
	
	public GuiFactory setClosePosition(Integer closeposition) {
		this.closeposition = closeposition;
		return this;
	}
	
	public GuiFactory setBackItem(ItemStack backitem) {
		this.backitem = backitem;
		return this;
	}
	
	public GuiFactory setCloseItem(ItemStack closeitem) {
		this.closeitem = closeitem;
		return this;
	}
}
