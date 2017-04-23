package gamemaker;

import javax.swing.*;
import java.awt.*;

/**
 * Class is a "stub" GUI panel for the Game Maker GUI
 * @author labudac17
 *
 */
public class VocabularyListPanelStub extends JPanel{

	private JLabel targetLanguageLabel;
	private JLabel nativeLanguageLabel;
	private JTextField tlv1, tlv2, tlv3, tlv4, tlv5, tlv6, tlv7, tlv8, tlv9, tlv10, blank;
	private JTextField nlv1, nlv2, nlv3, nlv4, nlv5, nlv6, nlv7, nlv8, nlv9, nlv10;
	
	public VocabularyListPanelStub() {
		setLayout(new GridLayout(10, 2));
		setBackground(Color.WHITE);
		setForeground(Color.GRAY);
		setBorder(BorderFactory.createLineBorder(Color.BLUE));
		targetLanguageLabel = new JLabel("Spanish");
		nativeLanguageLabel = new JLabel("English");
		tlv1 = new JTextField("amarillo", 25);
		nlv1 = new JTextField("yellow", 25);
		tlv2 = new JTextField("anaranjado", 25);
		nlv2 = new JTextField("orange", 25);
		tlv3 = new JTextField("azul", 25);
		nlv3 = new JTextField("blue", 25);
		tlv4 = new JTextField("blanco", 25);
		nlv4 = new JTextField("white", 25);
		tlv5 = new JTextField("cafe", 25);
		nlv5 = new JTextField("brown", 25);
		tlv6 = new JTextField("gris", 25);
		nlv6 = new JTextField("gray", 25);
		tlv7 = new JTextField("morado", 25);
		nlv7 = new JTextField("purple", 25);
		tlv8 = new JTextField("negro", 25);
		nlv8 = new JTextField("black", 25);
		tlv9 = new JTextField("rojo", 25);
		nlv9 = new JTextField("red", 25);
		tlv10 = new JTextField("verde", 25);
		nlv10 = new JTextField("green", 25);
	
		add(targetLanguageLabel);
		add(nativeLanguageLabel);
		add(tlv1);
		add(nlv1);
		add(tlv2);
		add(nlv2);
		add(tlv3);
		add(nlv3);
		add(tlv4);
		add(nlv4);
		add(tlv5);
		add(nlv5);
		add(tlv6);
		add(nlv6);
		add(tlv7);
		add(nlv7);
		add(tlv8);
		add(nlv8);
		add(tlv9);
		add(nlv9);
		add(tlv10);
		add(nlv10);
	}
	
}
