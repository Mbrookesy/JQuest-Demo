package src.main;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import src.battle.BattleGUI;
import src.battle.BattleHandler;
import src.battle.BattleVisibilityManager;
import src.forest.ForestHandler;
import src.forest.ForestMonster;
import src.forest.ForestVisibilityManager;
import src.maingame.MainHandler;
import src.maingame.MainVisibilityManager;
import src.menu.MenuGUI;
import src.menu.MenuHandler;
import src.menu.MenuVisibilityManager;

public class LoadAllComps {
	
	static ArrayList<ActionListener> handlers;
	
	public void setHandlers(ArrayList<ActionListener> handlers) {
		LoadAllComps.handlers = handlers;
	}

	public static ArrayList<ActionListener> getHandlers() {
		return handlers;
	}

	public void start() {
		MenuGUI menu = new MenuGUI();
		GameGUI fullgame = new GameGUI();
		BattleGUI battle = new BattleGUI();
		
		CreateWindow cw = new CreateWindow();
		
		JFrame window = cw.GUICreation();
		
		MenuVisibilityManager vm = new MenuVisibilityManager(menu); 
		MainVisibilityManager ngvm = new MainVisibilityManager(fullgame); 
		BattleVisibilityManager bvm = new BattleVisibilityManager(fullgame, battle, window); 
		ForestVisibilityManager fvm = new ForestVisibilityManager(fullgame, window); 
		
		ForestMonster fmon = new ForestMonster();
		
		ArrayList<ActionListener> allHandlers = new ArrayList<ActionListener>();
		
		allHandlers.add(new MenuHandler(vm, ngvm, bvm)); // 0
		allHandlers.add(new MainHandler(ngvm, fvm)); // 1
		allHandlers.add(new BattleHandler(bvm)); // 2
		allHandlers.add(new ForestHandler(ngvm, fvm, bvm, fmon)); // 3
		
		setHandlers(allHandlers);
		
		menu.menuScreen(window, getHandlers().get(0));
		fullgame.begin(window, getHandlers());
		battle.Battle(window, getHandlers());
		
		vm.showTitleScreen();
		ngvm.hide();
		bvm.hideall();
	}
	
	
	
	
}

