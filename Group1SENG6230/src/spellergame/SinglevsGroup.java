package spellergame;

import javax.swing.*;

import gamemaker.GameMaker;

import java.awt.*;

/**
 * Class for Single Player vs. Group Speller Game
 * @author labudac17
 *
 */
public class SinglevsGroup extends JFrame {

	private PlayerInformation playerInfoPanel;
	private SpellTransPanel spellTransPanel;
	private PlayerRankings playerRankingsPanel;
	private JLabel panelGreeting;
	private JPanel buttonPanel;
	private JButton playAudio;
	private JButton enter;
	
	
	public SinglevsGroup() {
		
		setTitle("Speller Game");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        //Create Panels
        panelGreeting = new JLabel("Single Player vs. Group Mode");
        playerInfoPanel = new PlayerInformation();
        spellTransPanel = new SpellTransPanel();
        playerRankingsPanel = new PlayerRankings();
        
        //Create buttonPanel for panel operations
        buildButtonPanel();
        
     // Add the components to the content pane
        add(panelGreeting, BorderLayout.NORTH);
        add(playerInfoPanel, BorderLayout.WEST);
        add(spellTransPanel, BorderLayout.CENTER);
        add(playerRankingsPanel, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
        
        
		
	}
	
	private void buildButtonPanel() {
		buttonPanel = new JPanel();
		playAudio = new JButton("Click to Hear Word");
		enter = new JButton("Enter All");
		
		//Add the buttons to the Panel
		buttonPanel.add(playAudio);
		buttonPanel.add(enter);
		
	}
	
	public static void main(String[] args) {
        new SinglevsGroup();
	}
	
}
