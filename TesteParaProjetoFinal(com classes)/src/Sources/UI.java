package Sources;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI 
{
	
	JFrame window;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	Font titleFont = new Font("Time New Roman", Font.PLAIN, 80);
	Font normalFont = new Font("Time New Roman", Font.PLAIN, 26);
	
	public void createUI() 
	{
		// window
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
	
	
		// title screen
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 500);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("CHAOS GEM");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.setFocusPainted(false);
		startButtonPanel.add(startButton);  
		
		window.add(titleNamePanel);
		window.add(startButtonPanel);
		
		// GameScreen
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		window.add(mainTextArea);
		
		mainTextArea = new JTextArea("This is the main text area");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextArea.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		window.add(choiceButtonPanel);
		
		choice1 = new JButton("choice1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choiceButtonPanel.add(choice1);
		choice2 = new JButton("choice1");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choiceButtonPanel.add(choice2);
		choice3 = new JButton("choice1");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choiceButtonPanel.add(choice3);
		choice4 = new JButton("choice1");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,4));
		window.add(playerPanel);
		
		hpLabel = new JLabel("HP:");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		hpNumberLabel = new JLabel();
		hpNumberLabel.setForeground(Color.white);
		hpNumberLabel.setFont(normalFont);
		playerPanel.add(hpNumberLabel);
		weaponLabel = new JLabel("Weapon:");
		
		
		window.setVisible(true);
		
		
	}
}
