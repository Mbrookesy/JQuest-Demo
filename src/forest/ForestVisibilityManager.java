package src.forest;

import src.forest.ForestStartGUI;

public class ForestVisibilityManager {
	ForestStartGUI fstart;
	
	
	public ForestVisibilityManager(ForestStartGUI startingScreen) {
		fstart = startingScreen;
	}
	
	public void hideForest() {
		fstart.continueButtonPanel.setVisible(false);
		fstart.startPanel.setVisible(false);
		fstart.namePanel.setVisible(false);
	}
	
	public void showForestBegin() {
		fstart.continueButtonPanel.setVisible(true);
		fstart.continueButton.setVisible(true);
		fstart.noButton.setVisible(false);
		fstart.yesButton.setVisible(false);
		fstart.startPanel.setVisible(true);
	}
	
	public void showNameField() {
		fstart.namePanel.setVisible(true);
		fstart.characterNameArea.requestFocusInWindow();
	}
	
	public void hideNameField() {
		fstart.namePanel.setVisible(false);
	}
	
	public void showYesNo() {
		fstart.continueButton.setVisible(false);
		fstart.noButton.setVisible(true);
		fstart.yesButton.setVisible(true);
	}
	
	public void showContinue() {
		fstart.continueButton.setVisible(true);
		fstart.noButton.setVisible(false);
		fstart.yesButton.setVisible(false);
	}
	
	public void ChangeText(String displayText, String nextCall) {
		fstart.startArea.setText(displayText);
		fstart.continueButton.setActionCommand(nextCall);
	}
	
	public String getName() {
		return fstart.characterNameArea.getText();
	}
	
	public void wakeUpButton() {
		fstart.continueButton.setText("Wake Up");
	}

}

