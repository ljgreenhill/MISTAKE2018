import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class FrontEnd extends JFrame {
	
	static final int autoBufferTime = 5000;

	//ArrayList<JLabel> labelList;
	JPanel panel;
	JButton start;
	JLabel allianceSwitch;
	JLabel opponentSwitch;
	JLabel scale;
	JLabel defense;
	JLabel climb;
	JLabel vault;
	JLabel mistake;
	JLabel R1;
	JLabel R2;
	JLabel R3;
	JLabel B1;
	JLabel B2;
	JLabel B3;
	JCheckBox A1;
	JCheckBox A2;
	JCheckBox A3;
	JCheckBox A4;
	JCheckBox A5;
	JCheckBox A6;
	JCheckBox C1;
	JCheckBox C2;
	JCheckBox C3;
	JCheckBox C4;
	JCheckBox C5;
	JCheckBox C6;
	JCheckBox D1;
	JCheckBox D2;
	JCheckBox D3;
	JCheckBox D4;
	JCheckBox D5;
	JCheckBox D6;
	JCheckBox E1;
	JCheckBox E2;
	JCheckBox E3;
	JCheckBox E4;
	JCheckBox E5;
	JCheckBox E6;
	JCheckBox F1;
	JCheckBox F2;
	JCheckBox F3;
	JCheckBox F4;
	JCheckBox F5;
	JCheckBox F6;
	JCheckBox G1;
	JCheckBox G2;
	JCheckBox G3;
	JCheckBox G4;
	JCheckBox G5;
	JCheckBox G6;
	
	
	final String fontName = "comic sans ms"; 	

	public FrontEnd() {
		

		panel = new JPanel();
		
		start = new JButton("RUN");
		allianceSwitch = new JLabel("Alliance Switch");
		opponentSwitch = new JLabel("Opponent Switch");
		scale = new JLabel("Scale");
		defense = new JLabel("Defense");
		climb = new JLabel("Climb");
		vault = new JLabel("Vault");
		mistake = new JLabel("MISTAKE");
		R1 = new JLabel("R1");
		R2 = new JLabel("R2");
		R3 = new JLabel("R3");
		B1 = new JLabel("B1");
		B2 = new JLabel("B2");
		B3 = new JLabel("B3");
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		
		start.setBounds(650, 600, 100, 50);
		start.setFont(new Font(fontName, Font.BOLD, 25));
		
		allianceSwitch.setBounds(100, 50, 300, 100);
		allianceSwitch.setFont(new Font(fontName, Font.BOLD, 25));
		allianceSwitch.setForeground(Color.green);
		
		opponentSwitch.setBounds(300, 50, 300, 100);
		opponentSwitch.setFont(new Font(fontName, Font.BOLD, 25));
		opponentSwitch.setForeground(Color.magenta);
		
		scale.setBounds(550, 50, 300, 100);
		scale.setFont(new Font(fontName, Font.BOLD, 25));
		scale.setForeground(Color.gray);
		
		defense.setBounds(750, 50, 300, 100);
		defense.setFont(new Font(fontName, Font.BOLD, 25));
		defense.setForeground(Color.cyan);
		
		climb.setBounds(100, 50, 300, 100);
		climb.setFont(new Font(fontName, Font.BOLD, 25));
		climb.setForeground(Color.yellow);
		
		vault.setBounds(1200, 50, 300, 100);
		vault.setFont(new Font(fontName, Font.BOLD, 25));
		vault.setForeground(Color.orange);
		
		mistake.setBounds(560, 0, 300, 100);
		mistake.setFont(new Font(fontName, Font.BOLD, 50));
		mistake.setForeground(Color.black);
		
		R1.setBounds(10, 100, 50, 50);
		R1.setFont(new Font(fontName, Font.BOLD, 30));
		R1.setForeground(Color.red);
		
		R2.setBounds(10, 175, 50, 50);
		R2.setFont(new Font(fontName, Font.BOLD, 30));
		R2.setForeground(Color.red);
		
		R3.setBounds(10, 250, 50, 50);
		R3.setFont(new Font(fontName, Font.BOLD, 30));
		R3.setForeground(Color.red);
		
		B1.setBounds(10, 325, 50, 50);
		B1.setFont(new Font(fontName, Font.BOLD, 30));
		B1.setForeground(Color.blue);
		
		B2.setBounds(10, 400, 50, 50);
		B2.setFont(new Font(fontName, Font.BOLD, 30));
		B2.setForeground(Color.blue);
		
		B3.setBounds(10, 475, 50, 50);
		B3.setFont(new Font(fontName, Font.BOLD, 30));
		B3.setForeground(Color.blue);

		panel.add(start);
		panel.add(allianceSwitch);
		panel.add(opponentSwitch);
		panel.add(scale);
		panel.add(defense);
		panel.add(climb);
		panel.add(mistake);
		panel.add(R1);
		panel.add(R2);
		panel.add(R3);
		panel.add(B1);
		panel.add(B2);
		panel.add(B3);
		

		

		// panel and frame stuff
		this.setSize(1500, 725);
		panel.setBackground(Color.white);
		this.add(panel);
		this.setVisible(true);
		
		

	}

	
	}

