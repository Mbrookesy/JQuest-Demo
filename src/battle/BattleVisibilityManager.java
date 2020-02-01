package src.battle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

import src.main.GameGUI;
import src.main.LoadChar;
import src.mortals.Monster;
import src.spells.SpellBuilder;

public class BattleVisibilityManager {
	BattleGUI battle;
	GameGUI game;
	SpellsGUI spells;
	JFrame windowScreen;
	Monster currentMonster;
	Random randomGen = new Random();

	public BattleVisibilityManager(GameGUI gamingscreen, BattleGUI userMenu, JFrame window, SpellsGUI spl) {
		game = gamingscreen;
		battle = userMenu;
		windowScreen = window;
		spells = spl;
	}

	public void enterBattle(String area, Monster monster) {
		// temp
		String battleText = " Manifested";

		battleMenu();
		windowScreen.getContentPane().setBackground(Color.black);

		if (area == "Tutorial") {
			battle.desc.setText(monster.getName() + battleText);
		}

		this.currentMonster = monster;

	}

	public void basicEnemyAttacks() {
		
		
		
		int accuracy = randomGen.nextInt(100);
		int range = randomGen.nextInt(3);
		if (accuracy < 5) {
			battle.desc.setText("The " + this.currentMonster.getName() + " missed their attack!");
		} else {
			battle.desc.setText("The " + this.currentMonster.getName() + " hit you and did "
					+ (this.currentMonster.attackRange(range) - (LoadChar.mainChar.getDef() / 2)) + " damage!");
			LoadChar.mainChar.setHp(LoadChar.mainChar.getHp()
					+ (this.currentMonster.attackRange(range) - (LoadChar.mainChar.getDef() / 2)));
			battle.HPLabel.setText("HP: " + LoadChar.mainChar.getHp());
		}
		
		enableButtons();

	}

	public void melee() {

		int accuracy = randomGen.nextInt(100);
		int range = randomGen.nextInt(3);
		int damageValue = 0;
		
		disableButtons();

		if (accuracy < 5) {
			battle.desc.setText("You swing your bottle and fall over onto the floor missing the devil!");
		} else if (accuracy == 99) {
			damageValue = LoadChar.mainChar.attackRange(range) * 2;
			battle.desc.setText("As you swing your bottle, it fizzes up and does EXTRA DAMAGE! " + damageValue + " damage!");
		} else {
			damageValue = (LoadChar.mainChar.attackRange(range) - this.currentMonster.getDef());
			battle.desc.setText("You swing your bottle of cola and do " + damageValue + " damage to the devil! ");
		}

		this.currentMonster.setHp(this.currentMonster.getHp() - damageValue);
		
		healthCheck();

		Timer timer = new Timer(3000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				basicEnemyAttacks();
			}
		});
		timer.setRepeats(false);
		timer.start();
		
		

	}
	
	public void spell(SpellBuilder selectedSpell) {
		int accuracy = randomGen.nextInt(100);
		int range = randomGen.nextInt(3);
		int damageValue = 0;
		
		disableButtons();
		
		LoadChar.mainChar.setMana(LoadChar.mainChar.getMana() - selectedSpell.getManaCost());
		battle.MPLabel.setText("JP: " + LoadChar.mainChar.getMana());

		if (accuracy > selectedSpell.getAccuracy()) {
			battle.desc.setText("You use your spell and it misses");
		} else {
			damageValue = selectedSpell.getDamage();
			battle.desc.setText("You use " + selectedSpell.getName() + " and deal " + damageValue + " damage!");
		}

		this.currentMonster.setHp(this.currentMonster.getHp() - damageValue);
		Boolean check = healthCheck();
		if (check) {
			
		
		Timer timer = new Timer(3000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				basicEnemyAttacks();
			}
		});
		
		timer.setRepeats(false);
		timer.start();
		}
		
	}
	
	public SpellBuilder getSpell() {
		SpellBuilder spell = spells.SpellsList.getSelectedValue();
		
		return spell;
	}
	
	public Boolean JPCheck(SpellBuilder checkedSpell) {
		
		if (checkedSpell.getManaCost() < LoadChar.mainChar.getMana()) {
			return true;
		} else {
			spells.SelectLabel.setText("You do not have enough JP");
			return false;
		}
	}
	
	public Boolean healthCheck() {
		if (this.currentMonster.getHp() <= 0) {
			battle.desc.setText(this.currentMonster.getName() + " has been defeated!");
			battle.EnemyPanel.setVisible(false);
			Timer timer2 = new Timer(3000, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					battle.desc.setText("Thank you for playing my demo testing of Java Swing. This was simply practice at Java OOP.");
				}
			});
			timer2.setRepeats(false);
			timer2.start();
			
			Timer exittimer = new Timer(10000, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			exittimer.setRepeats(false);
			exittimer.start();
			return false;
		}
		
		return true;
		
	}
	
	public void battleMenu() {
		battle.ButtonPanel.setVisible(true);
		battle.DescPanel.setVisible(true);
		battle.MPPanel.setVisible(true);
		battle.HPPanel.setVisible(true);
		battle.EnemyPanel.setVisible(true);
		
		spells.ButtonPanel.setVisible(false);
		spells.DescPanel.setVisible(false);
	}
	
	public void spellMenu() {
		battle.ButtonPanel.setVisible(false);
		battle.DescPanel.setVisible(false);
		battle.MPPanel.setVisible(false);
		battle.HPPanel.setVisible(false);
		battle.EnemyPanel.setVisible(false);
		
		spells.ButtonPanel.setVisible(true);
		spells.DescPanel.setVisible(true);
	}
	
	public void disableButtons(){
		battle.attackButton.setActionCommand("NULL");
		battle.spellsButton.setActionCommand("NULL");
	}
	
	public void enableButtons() {
		battle.attackButton.setActionCommand("Melee");
		battle.spellsButton.setActionCommand("Spells");
	}

	public void hideall() {
		battle.ButtonPanel.setVisible(false);
		battle.DescPanel.setVisible(false);
		battle.MPPanel.setVisible(false);
		battle.HPPanel.setVisible(false);
		battle.EnemyPanel.setVisible(false);
		
		spells.ButtonPanel.setVisible(false);
		spells.DescPanel.setVisible(false);
	}

}
