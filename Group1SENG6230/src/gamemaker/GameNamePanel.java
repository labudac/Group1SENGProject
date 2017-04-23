package gamemaker;

import javax.swing.*;
import java.awt.*;

public class GameNamePanel extends JPanel {
	
	private JLabel userLabel;			//to reference player name
	private JTextField userName;		//to reference player name
	private JLabel gameNameLabel;		//to declare game name
	private JTextField gameName;		//to declare game name  
	
	public GameNamePanel() {
		userLabel = new JLabel("User Name:");
		userName = new JTextField(25);
		gameNameLabel = new JLabel("Enter Vocabulary set name:");
		gameName = new JTextField(25);
		
		setLayout(new GridLayout(4,1));
		setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		add(userLabel);
		add(userName);
		add(gameNameLabel);
		add(gameName);
		
	}
	
	/**
	 * Gets the Game/Vocabulary set name entered by the user
	 * @return the name of the game/vocabulary set
	 */
	public String getGameName() {
		String name;
		name = gameName.getText();
		return name;
	}
	
	/**
	 * method to get user name
	 * @return the name of the Game maker
	 */
	public String getUserName() {
		String name;
		name = userName.getText();
		return name;
	}

}
