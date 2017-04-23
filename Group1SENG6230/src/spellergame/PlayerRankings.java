package spellergame;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PlayerRankings extends JPanel{
	
	private JLabel playerRank;
	private JLabel playerName;
	private JLabel p0, p1, p2, p3, p4, p5, p6, p7, p8, p9;
	private JLabel a, b, c, d, e, f, g, h, i, j;
	
	public PlayerRankings() {
		
		setLayout(new GridLayout(11, 2));
		setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		//initialize column labels
		playerRank = new JLabel("Player Rank");
		playerName = new JLabel("Player Name");
		
		//Create array for randomized names for stub
		ArrayList<String> stubNames = new ArrayList<String>(10);
		stubNames.add("John Doe");
		stubNames.add("Jane Doe");
		stubNames.add("Tiara539");
		stubNames.add("Kyle668");
		stubNames.add("Erica891");
		stubNames.add("Fred Smith");
		stubNames.add("Jane Austin28");
		stubNames.add("Jessica3453");
		stubNames.add("PacMan22");
		stubNames.add("DonkeyKong87");
		
		//Stuffle the ArrayList of stubNames
		Random rnum = new Random();
		int n = rnum.nextInt(10);
		Collections.shuffle(stubNames);
		
		//initialize all places for rankings column
		p0 = new JLabel("1st");
		p1 = new JLabel("2nd");
		p2 = new JLabel("3rd");
		p3 = new JLabel("4th");
		p4 = new JLabel("5th");
		p5 = new JLabel("6th");
		p6 = new JLabel("7th");
		p7 = new JLabel("8th");
		p8 = new JLabel("9th");
		p9 = new JLabel("10th");
		
		//initialize all stubNames
		a = new JLabel(stubNames.get(0));
		b = new JLabel(stubNames.get(1));
		c = new JLabel(stubNames.get(2));
		d = new JLabel(stubNames.get(3));
		e = new JLabel(stubNames.get(4));
		f = new JLabel(stubNames.get(5));
		g = new JLabel(stubNames.get(6));
		h = new JLabel(stubNames.get(7));
		i = new JLabel(stubNames.get(8));
		j = new JLabel(stubNames.get(9));
		
		//add all Rankings and Shuffled stub names
		add(playerRank);
		add(playerName);
		add(p0);
		add(a);
		add(p1);
		add(b);
		add(p2);
		add(c);
		add(p3);
		add(d);
		add(p4);
		add(e);
		add(p5);
		add(f);
		add(p6);
		add(g);
		add(p7);
		add(h);
		add(p8);
		add(i);
		add(p9);
		add(j);
		
		
	}
		
}
