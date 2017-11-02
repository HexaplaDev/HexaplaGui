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
	Boolean isBackEnable();
	
	/**
	 * Is close item present
	 * 
	 * @return a Boolean
	 */
	Boolean isCloseEnable();
	
	/**
	 * Get the back item slot
	 * 
	 * @return an Integer
	 */
	Integer getBackPosition();
	
	/**
	 * Is back item present
	 * 
	 * @return a Boolean
	 */
	Integer getClosePosition();
	
	/**
	 * Get the back item
	 * 
	 * @return A bukkit ItemStack
	 */
	ItemStack getBackItem();

	/**
	 * Get the close item
	 * 
	 * @return A bukkit ItemStack
	 */
	ItemStack getCloseItem();
	
	/**
	 * Open the gui to a player
	 * 
	 * @param p the player to open the inventory
	 */
	void openGui(Player p);
}
