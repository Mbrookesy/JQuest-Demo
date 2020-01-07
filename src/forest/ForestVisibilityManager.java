package src.forest;

import src.forest.ForestStart;

public class ForestVisibilityManager {
	ForestStart fstart;
	
	
	public ForestVisibilityManager(ForestStart startingScreen) {
		fstart = startingScreen;
	}
	
	public void hideForest() {
		fstart.continueButtonPanel.setVisible(false);
		fstart.startPanel.setVisible(false);
	}
	
	public void showForestBegin() {
		fstart.continueButtonPanel.setVisible(true);
		fstart.startPanel.setVisible(true);
	}
	
	public void ChangeText(String displayText, String nextCall) {
		fstart.startArea.setText(displayText);
		fstart.continueButton.setActionCommand(nextCall);
	}

}

