package src.maingame;

import src.main.GameGUI;

public class MainVisibilityManager {
	GameGUI fstart;
	
	
	public MainVisibilityManager(GameGUI startingScreen) {
		fstart = startingScreen;
	}
	
	public void hide() {
		fstart.getContinueButtonPanel().setVisible(false);
		fstart.getStartPanel().setVisible(false);
		fstart.getNamePanel().setVisible(false);
	}
	
	public void show() {
		fstart.getContinueButtonPanel().setVisible(true);
		fstart.getContinueButton().setVisible(true);
		fstart.getNoButton().setVisible(false);
		fstart.getYesButton().setVisible(false);
		fstart.getStartPanel().setVisible(true);
	}
	
	public void showNameField() {
		fstart.getNamePanel().setVisible(true);
		fstart.getCharacterNameArea().requestFocusInWindow();
	}
	
	public void hideNameField() {
		fstart.getNamePanel().setVisible(false);
	}
	
	public void showYesNo() {
		fstart.getContinueButton().setVisible(false);
		fstart.getNoButton().setVisible(true);
		fstart.getYesButton().setVisible(true);
	}
	
	public void showContinue() {
		fstart.getContinueButton().setVisible(true);
		fstart.getNoButton().setVisible(false);
		fstart.getYesButton().setVisible(false);
	}
	
	public void ChangeText(String displayText, String nextCall) {
		fstart.getStartArea().setText(displayText);
		fstart.getContinueButton().setActionCommand(nextCall);
	}
	
	public String getName() {
		return fstart.getCharacterNameArea().getText();
	}
	
	public void wakeUpButton() {
		fstart.getContinueButton().setText("Wake Up");
	}

}

