import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class FrontEnd extends JFrame {

	ArrayList<JLabel> labelList;
	JPanel panel;
	JButton start;
	
	final String fontName = "comic sans ms"; 	

	public FrontEnd() {
		

		panel = new JPanel();
		start = new JButton("RUN");
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);

		
		

		

		// panel and frame stuff
		this.setSize(900, 725);
		panel.setBackground(Color.white);
		this.add(panel);
		this.setVisible(true);

	}

	
	}

