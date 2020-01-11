package src.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import src.forest.ForestHandler;
import src.forest.ForestStartGUI;
import src.forest.ForestVisibilityManager;
import src.menu.MenuGUI;
import src.menu.MenuHandler;
import src.menu.MenuVisibilityManager;

public class LoadAllComps {
	
	
	public void start() {
		MenuGUI menu = new MenuGUI();
		ForestStartGUI start = new ForestStartGUI();
		
		MenuVisibilityManager vm = new MenuVisibilityManager(menu, start);
		ForestVisibilityManager fvm = new ForestVisibilityManager(start);
		
		MenuHandler mHandler = new MenuHandler(vm, fvm);
		ForestHandler fHandler = new ForestHandler(fvm);
		
		CreateWindow cw = new CreateWindow();
		
		JFrame window = cw.GUICreation();
		
		menu.menuScreen(window, mHandler);
		start.begin(window, fHandler);
		
		vm.showTitleScreen();
		fvm.hideForest();
	}
}

