package spellergame;

import javax.swing.*;
import java.awt.*;

public class PlayerInformation extends JPanel {

	private JLabel playerLabel;			//to state player name
	private JLabel gameNameLabel;		//to state the name of the Game and Vocabulary List
	private JLabel playerHighScore;		//to display a player's high score
	
	public PlayerInformation(){
		
		playerLabel = new JLabel("John Doe");  //stub for player name
		gameNameLabel = new JLabel ("Spanish and English Colors");  //stub for Game Title
		playerHighScore = new JLabel ("22,500");  //stub for High score
		
		setLayout(new GridLayout(3,1));
		setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		add(playerLabel);
		add(gameNameLabel);
		add(playerHighScore);
		
	}
	
	//TODO create method to getPlayerName() from player database
	//TODO create method to getGameName() from vocabulary list database
	//TODO create method to getPlayerHighScore from player database
	
}
