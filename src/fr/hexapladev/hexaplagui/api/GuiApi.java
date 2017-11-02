package fr.hexapladev.hexaplagui.api;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import fr.hexapladev.hexaplagui.HexaplaGui;


public class GuiApi {
	private HexaplaGui instance;
	private List<Gui> guis = new ArrayList<>();
	public GuiApi(HexaplaGui instance) {
		this.instance = instance;
	}
	
	public Gui getNewGuiFactory() {
		return null;
	}
	
	private Gui getNewGui(GuiFactory factory) {
		Gui gui = new Gui() {
			String name = factory.getName();
			Integer lines = factory.getLines();
			Boolean backenable = factory.isBackEnable();
			Boolean closeenable = factory.isCloseEnable();
			Integer backposition = factory.getBackPosition();
			Integer closeposition = factory.getClosePosition();
			
			@Override
			public String getName() {
				return this.name;
			}

			@Override
			public Integer getLinesCount() {
				return this.lines;
			}

			@Override
			public void openGui(Player p) {
				// TODO Auto-generated method stub
				
			}
			
		};
		return gui;
	}
}
