package spellergame;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SpellTransPanel extends JPanel{
	
	private JLabel enterSpelling;
	private JTextField spelling;
	private JLabel enterTranslation;
	private JTextField translation;
	
	
	public SpellTransPanel() {
		
		setLayout(new GridLayout(3,1));
		setBorder(BorderFactory.createLineBorder(Color.GREEN));
		
		enterSpelling = new JLabel("     Enter Spelling:");
		spelling = new JTextField(25);
		enterTranslation = new JLabel("     Enter Translation");
		translation = new JTextField(25);
		
		add(enterSpelling);
		add(spelling);
		add(enterTranslation);
		add(translation);
		
		
	}

	//Gets player spelling entered
	public String getSpelling() {
		String s = spelling.getText();
		return s;
	}
	
	//Gets player translation entered
	public String getTranslation() {
		String t = translation.getText();
		return t;
	}
}
