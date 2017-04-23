package gamemaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;



/*
 * Class for GameMaker GUI
 * @author Group 1
 */
public class GameMaker extends JFrame {

	int x, y;
	//Container c;
	private GameNamePanel gameName;
	private GameModePanel gameMode;
	private VocabularyListPanelStub vocabListStub;
	private JLabel gameMakerGreeting;
	private JPanel buttonPanel;
	private JButton saveGame;
	private JButton launchGame;
	
	/**
	 * Constructor
	 */
	public GameMaker(){
		setTitle("Speller Game");
        setSize(1000, 1000);
        //c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Create panels
        gameMakerGreeting = new JLabel("Welcome to the Speller Game Maker!");
        gameName = new GameNamePanel();
        gameMode = new GameModePanel();
        vocabListStub = new VocabularyListPanelStub();
        
        // Create button panel for panel operations
        buildButtonPanel();
        
        // Add the components to the content pane
        add(gameMakerGreeting, BorderLayout.NORTH);
        add(gameName, BorderLayout.WEST);
        add(vocabListStub, BorderLayout.CENTER);
        add(gameMode, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
	}
	
	private void buildButtonPanel() {
		//Create panel
		buttonPanel = new JPanel();
		
		//Create buttons
		saveGame = new JButton("Save Game");
		launchGame = new JButton("Launch Game");
		
		//Register action listeners
		//saveGame.addActionListener(new SaveButtonListener());
		//launchGame.addActionListener(new LaunchGameListener());
		
		//Add the buttons to the button panel
		buttonPanel.add(saveGame);
		buttonPanel.add(launchGame);
		
		
	}
	
	/**
	private class SaveButtonListener implements Actionlistener {
		
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Game Saved.");
			System.exit(0);
	
		}
	}
	
	private class LaunchGameListener implements Actionlistener {
		
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Game Code: 53692");
			System.exit(0);
		}
	}
	*/
	
	/**
	public void paint(Graphics g){
    	super.paint(g);
    	g.setColor(Color.blue);
    	
	}
	
	public void mousePressed(MouseEvent e){
    	x = e.getX();
    	y = e.getY();
    }
   */
	
	public static void main(String[] args) {
        new GameMaker();
	}
}
