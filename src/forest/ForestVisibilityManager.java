package src.forest;

import java.awt.Color;

import javax.swing.JFrame;

import src.main.GameGUI;
import src.main.LoadAllComps;

public class ForestVisibilityManager {
	GameGUI gstart;
	JFrame windowscreen;
	
	public ForestVisibilityManager(GameGUI gamingScreen, JFrame window) {
		gstart = gamingScreen;
		windowscreen = window;
	}
	
	public void firstEnteringForest() {
		String forestBg = "#405242";
		
		gstart.getStartPanel().setBackground(Color.decode(forestBg));
		gstart.getNamePanel().setBackground(Color.decode(forestBg));
		gstart.getContinueButtonPanel().setBackground(Color.decode(forestBg));
		gstart.getStartArea().setBackground(Color.decode(forestBg));
		gstart.getContinueButton().setBackground(Color.decode(forestBg));
		windowscreen.getContentPane().setBackground(Color.decode(forestBg));

		gstart.getContinueButton().removeActionListener(LoadAllComps.getHandlers().get(1));
		gstart.getContinueButton().addActionListener(LoadAllComps.getHandlers().get(3));
		gstart.getContinueButton().setActionCommand("C1");
		gstart.getContinueButton().setText(">");
		gstart.getStartArea().setText("You open your eyes in the middle of a deserted forest");
	}

}

