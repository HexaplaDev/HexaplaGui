package fr.hexapladev.hexaplagui.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * A gui object
 * 
 * @author RedSpri
 */
public interface Gui {
	
	/**
	 * Get the inventory title
	 * 
	 * @return a String
	 */
	String getName();
	
	/**
	 * Get the inventory lines count
	 * 
	 * @return an Integer
	 */
	Integer getLinesCount();
	
	/**
	 * Is back item present
	 * 
	 * @return a Boolean
	 */
	public Boolean isBackEnable();
	
	/**
	 * Is close item present
	 * 
	 * @return a Boolean
	 */
	public Boolean isCloseEnable();
	
	/**
	 * Get the back item slot
	 * 
	 * @return an Integer
	 */
	public Integer getBackPosition();
	
	/**
	 * Is back item present
	 * 
	 * @return a Boolean
	 */
	public Integer getClosePosition();
	
	/**
	 * 
	 * 
	 * @return A bukkit ItemStack
	 */
	public ItemStack getBackItem();

	public ItemStack getCloseItem();
	
	/**
	 * Open the gui to a player
	 * 
	 * @param p the player to open the inventory
	 */
	void openGui(Player p);
}
