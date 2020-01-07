package src.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import src.forest.ForestStart;
import src.forest.ForestVisibilityManager;
import src.handlers.ForestHandler;
import src.handlers.MenuHandler;
import src.menu.Menu;
import src.menu.VisibilityManager;

public class LoadAllComps {
	
	
	public void start() {
		Menu menu = new Menu();
		ForestStart start = new ForestStart();
		
		VisibilityManager vm = new VisibilityManager(menu, start);
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

