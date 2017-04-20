package gamemaker;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;

import javax.swing.*;

/*
 * Class for GameMaker GUI
 * @author Group 1
 */
public class GameMaker extends JFrame implements MouseListener, WindowListener {

	int x, y;
	Container c;
	
	public GameMaker(){
		setTitle("Mouse Events");
        setSize(1000, 1000);
        c = getContentPane();
        
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setVisible(true);
	}
	
	public void paint(Graphics g){
    	super.paint(g);
    	g.setColor(Color.blue);
    	
	}
	
	public void mousePressed(MouseEvent e){
    	x = e.getX();
    	y = e.getY();
    }
	
	public static void main(String[] args) {
        System.out.println("Welcome to the Game Maker.");
	}
}
