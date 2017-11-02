package fr.hexapladev.hexaplagui;

import org.bukkit.plugin.java.JavaPlugin;

import fr.hexapladev.hexaplagui.api.GuiApi;

public class HexaplaGui extends JavaPlugin {
	private static GuiApi api;
	private static DefaultSettings defaultsettings;
	
	public static GuiApi getApi() {
		return api;
	}
	
	public static DefaultSettings getDefaultSettings() {
		return defaultsettings;
	}
	
	
	@Override
	public void onEnable() {
		super.onEnable();
		api = new GuiApi(this);
		defaultsettings = new DefaultSettings();
	}
}