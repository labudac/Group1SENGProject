package gamemaker;

import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author labudac17
 * GameModePanel class allows user to select the game mode.
 *
 */
public class GameModePanel extends JPanel{

	private JRadioButton singleMode;          //for Single player mode
	private JRadioButton teamMode;            //for Team player mode
	private JRadioButton spellOnlyMode;       //for spell only mode
	private JRadioButton spellTranslateMode;  //for spell and translate mode
	private ButtonGroup bg;					  //Radio button group
	int gameMode, spellMode;
	
	public GameModePanel() {
		setLayout(new GridLayout(4, 1));
		singleMode = new JRadioButton("Single Player Mode", true);
		teamMode = new JRadioButton("Team Player Mode");
		spellOnlyMode = new JRadioButton("Spelling Only Mode");
		spellTranslateMode = new JRadioButton("Spelling and Translate Mode", true);
		
		//group the radio buttons
		bg = new ButtonGroup();
		bg.add(singleMode);
		bg.add(teamMode);
		bg.add(spellOnlyMode);
		bg.add(spellTranslateMode);
		
		//border for panel
		setBorder(BorderFactory.createTitledBorder("Select Game Modes"));
		
		//add radio buttons to panel
		add(singleMode);
		add(teamMode);
		add(spellOnlyMode);
		add(spellTranslateMode);
			
	}
	
	/**
	 * Method to select game mode
	 * @return the game mode selections
	 */
	
	public int getGameMode() {
		if (singleMode.isSelected())
			gameMode = 1;
		else if (teamMode.isSelected())
			gameMode = 2;
		return gameMode;
	}
	
	public int getSpellMode() {
		if (spellOnlyMode.isSelected())
			spellMode = 1;
		else if (spellTranslateMode.isSelected())
			spellMode = 2;
		return spellMode;
	}
}
