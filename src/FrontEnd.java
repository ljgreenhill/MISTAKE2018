import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class FrontEnd extends JFrame {

	static final int autoBufferTime = 5000;
	public static int time;

	public int getTime() {
		return this.time;
	}
	Score RedScore3;
	Score BlueScore3;
	// ArrayList<JLabel> labelList;
	JPanel panel;
	JButton start;
	JLabel allianceSwitch;
	JLabel opponentSwitch;
	JLabel scale;
	JLabel defense;
	JLabel climb1;
	JLabel vault;
	JLabel mistake;
	JLabel R1;
	JLabel R2;
	JLabel R3;
	JLabel B1;
	JLabel B2;
	JLabel B3;
	JLabel blueScore;
	JLabel redScore;

	JLabel BlueScore2;
	JLabel RedScore2;

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
	JComboBox E1;
	JComboBox E2;
	JComboBox E3;
	JComboBox E4;
	JComboBox E5;
	JComboBox E6;

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

	public FrontEnd(Field Field, Alliance BlueAlliance, Alliance RedAlliance, Score BlueScore, Score RedScore, Robot RedRobot1, Robot RedRobot2, Robot RedRobot3,
			Robot BlueRobot1, Robot BlueRobot2, Robot BlueRobot3) {

		this.RedScore3 = RedScore;
		this.BlueScore3 = BlueScore;
		panel = new JPanel();

		start = new JButton("RUN");
		allianceSwitch = new JLabel("Alliance Switch");
		opponentSwitch = new JLabel("Opponent Switch");
		scale = new JLabel("Scale");
		defense = new JLabel("Defense");
		climb1 = new JLabel("Climb");
		vault = new JLabel("Vault");
		mistake = new JLabel("MISTAKE");
		// String RedScore = ;

		RedScore2 = new JLabel();
		BlueScore2 = new JLabel();

		R1 = new JLabel("R1");
		R2 = new JLabel("R2");
		R3 = new JLabel("R3");
		B1 = new JLabel("B1");
		B2 = new JLabel("B2");
		B3 = new JLabel("B3");
		redScore = new JLabel("RED SCORE:");
		blueScore = new JLabel("BLUE SCORE:");
		A1 = new JCheckBox();
		A2 = new JCheckBox();
		A3 = new JCheckBox();
		A4 = new JCheckBox();
		A5 = new JCheckBox();
		A6 = new JCheckBox();
		C1 = new JCheckBox();
		C2 = new JCheckBox();
		C3 = new JCheckBox();
		C4 = new JCheckBox();
		C5 = new JCheckBox();
		C6 = new JCheckBox();
		D1 = new JCheckBox();
		D2 = new JCheckBox();
		D3 = new JCheckBox();
		D4 = new JCheckBox();
		D5 = new JCheckBox();
		D6 = new JCheckBox();

		Integer[] defenseInts = { 0, 1, 2, 3 };
		JComboBox E1 = new JComboBox(defenseInts);
		E1.setSelectedIndex(0);

		JComboBox E2 = new JComboBox(defenseInts);
		E2.setSelectedIndex(0);

		JComboBox E3 = new JComboBox(defenseInts);
		E3.setSelectedIndex(0);

		JComboBox E4 = new JComboBox(defenseInts);
		E4.setSelectedIndex(0);

		JComboBox E5 = new JComboBox(defenseInts);
		E5.setSelectedIndex(0);

		JComboBox E6 = new JComboBox(defenseInts);
		E6.setSelectedIndex(0);

		F1 = new JCheckBox();
		F2 = new JCheckBox();
		F3 = new JCheckBox();
		F4 = new JCheckBox();
		F5 = new JCheckBox();
		F6 = new JCheckBox();
		G1 = new JCheckBox();
		G2 = new JCheckBox();
		G3 = new JCheckBox();
		G4 = new JCheckBox();
		G5 = new JCheckBox();
		G6 = new JCheckBox();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);

		start.setBounds(650, 600, 100, 50);
		start.setFont(new Font(fontName, Font.BOLD, 25));
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				for (int i = 0; i < BlueAlliance.allianceRobots.size(); i++) {
					BlueAlliance.allianceRobots.get(i).setMyAlliance(BlueAlliance);
					BlueAlliance.allianceRobots.get(i).setOpposingAlliance(RedAlliance);
				}

				for (int i = 0; i < RedAlliance.allianceRobots.size(); i++) {
					RedAlliance.allianceRobots.get(i).setMyAlliance(RedAlliance);
					RedAlliance.allianceRobots.get(i).setOpposingAlliance(BlueAlliance);
				}
				

				ArrayList<Robot> scaleBots = new ArrayList<Robot>();
				scaleBots.addAll(BlueAlliance.whoScale());
				scaleBots.addAll(RedAlliance.whoScale());

				ArrayList<Robot> allianceSwitchBots = new ArrayList<Robot>();
				allianceSwitchBots.addAll(BlueAlliance.whoAllianceSwitch());
				allianceSwitchBots.addAll(RedAlliance.whoAllianceSwitch());

				ArrayList<Robot> opponentSwitchBots = new ArrayList<Robot>();
				opponentSwitchBots.addAll(BlueAlliance.whoOpponentSwitch());
				opponentSwitchBots.addAll(RedAlliance.whoOpponentSwitch());

				ArrayList<Robot> vaultBots = new ArrayList<Robot>();
				vaultBots.addAll(BlueAlliance.whoVault());
				vaultBots.addAll(RedAlliance.whoVault());

				ArrayList<Robot> climbBots = new ArrayList<Robot>();
				climbBots.addAll(BlueAlliance.whoClimb());
				climbBots.addAll(RedAlliance.whoClimb());
				
				for (time = 1; time <= 135; time++) {
					for (int i = 0; i < scaleBots.size(); i++) {
						if (time != 0 && time % scaleBots.get(i).getPlaceCubeTimeScale(scaleBots.get(i).getMyAlliance(),
								scaleBots.get(i).getOpposingAlliance()) == 0) {
							Field.getScale().putCube(scaleBots.get(i), time, RedScore,
									BlueScore);

						}
					}
					for (int i = 0; i < allianceSwitchBots.size(); i++) {
						if (time != 0 && time % allianceSwitchBots.get(i).getPlaceCubeTimeSwitchAlliance(
								allianceSwitchBots.get(i).getMyAlliance(),
								allianceSwitchBots.get(i).getOpposingAlliance()) == 0) {
							Field.getAllianceSwitch(allianceSwitchBots.get(i)).putCube(allianceSwitchBots.get(i),
									time, RedScore, BlueScore);

						}
					}
					for (int i = 0; i < opponentSwitchBots.size(); i++) {
						if (time != 0 && time % opponentSwitchBots.get(i).getPlaceCubeTimeSwitchOpponent(
								opponentSwitchBots.get(i).getMyAlliance(),
								opponentSwitchBots.get(i).getOpposingAlliance()) == 0) {
							Field.getOpponentSwitch(opponentSwitchBots.get(i)).putCube(opponentSwitchBots.get(i),
									time, RedScore, BlueScore);

						}
					}
					for (int i = 0; i < vaultBots.size(); i++) {
						if (time != 0 && time % vaultBots.get(i).getPlaceCubeTimeVault(vaultBots.get(i).getMyAlliance(),
								vaultBots.get(i).getOpposingAlliance()) == 0) {
							Field.getMyVault(vaultBots.get(i)).putCubeVault(vaultBots.get(i), RedScore,
									BlueScore);

						}
					}
					for (int i = 0; i < climbBots.size(); i++) {
						if (time != 0 && time % climbBots.get(i).findMatchTime() == 0) {
							if (climbBots.get(i).getRobotAlliance() == "red") {
								RedScore.updateScore(30);
							} else {
								BlueScore.updateScore(30);
							}

						}
					}

			}
				refreshScores(RedScore, BlueScore);
				setRedScore();
				setBlueScore();
		  }

		});

		allianceSwitch.setBounds(100, 50, 300, 100);
		allianceSwitch.setFont(new Font(fontName, Font.BOLD, 25));
		allianceSwitch.setForeground(Color.black);

		opponentSwitch.setBounds(380, 50, 300, 100);
		opponentSwitch.setFont(new Font(fontName, Font.BOLD, 25));
		opponentSwitch.setForeground(Color.black);

		scale.setBounds(700, 50, 300, 100);
		scale.setFont(new Font(fontName, Font.BOLD, 25));
		scale.setForeground(Color.black);

		defense.setBounds(890, 50, 300, 100);
		defense.setFont(new Font(fontName, Font.BOLD, 25));
		defense.setForeground(Color.black);

		vault.setBounds(1100, 50, 300, 100);
		vault.setFont(new Font(fontName, Font.BOLD, 25));
		vault.setForeground(Color.black);

		climb1.setBounds(1250, 50, 300, 100);
		climb1.setFont(new Font(fontName, Font.BOLD, 25));
		climb1.setForeground(Color.black);

		mistake.setBounds(560, 0, 300, 100);
		mistake.setFont(new Font(fontName, Font.BOLD, 50));
		mistake.setForeground(Color.red);

		R1.setBounds(10, 120, 50, 50);
		R1.setFont(new Font(fontName, Font.BOLD, 30));
		R1.setForeground(Color.red);

		R2.setBounds(10, 190, 50, 50);
		R2.setFont(new Font(fontName, Font.BOLD, 30));
		R2.setForeground(Color.red);

		R3.setBounds(10, 260, 50, 50);
		R3.setFont(new Font(fontName, Font.BOLD, 30));
		R3.setForeground(Color.red);

		B1.setBounds(10, 330, 50, 50);
		B1.setFont(new Font(fontName, Font.BOLD, 30));
		B1.setForeground(Color.blue);

		B2.setBounds(10, 400, 50, 50);
		B2.setFont(new Font(fontName, Font.BOLD, 30));
		B2.setForeground(Color.blue);

		B3.setBounds(10, 470, 50, 50);
		B3.setFont(new Font(fontName, Font.BOLD, 30));
		B3.setForeground(Color.blue);

		blueScore.setBounds(125, 550, 300, 50);
		blueScore.setFont(new Font(fontName, Font.BOLD, 30));
		blueScore.setForeground(Color.blue);

		redScore.setBounds(1000, 550, 300, 50);
		redScore.setFont(new Font(fontName, Font.BOLD, 30));
		redScore.setForeground(Color.red);

		// number
		BlueScore2.setBounds(125, 585, 300, 50);
		BlueScore2.setFont(new Font(fontName, Font.BOLD, 30));
		BlueScore2.setForeground(Color.blue);
		BlueScore2.setText("0");
		panel.add(BlueScore2);

		RedScore2.setBounds(1000, 585, 300, 50);
		RedScore2.setFont(new Font(fontName, Font.BOLD, 30));
		RedScore2.setForeground(Color.red);
		RedScore2.setText("0");
		panel.add(RedScore2);

		A1.setBounds(175, 120, 50, 50);
		A1.setFont(new Font(fontName, Font.BOLD, 30));
		A1.setBackground(Color.red);
		A1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot1.setMode("allianceSwitch");

			}

		});

		A2.setBounds(175, 190, 50, 50);
		A2.setFont(new Font(fontName, Font.BOLD, 30));
		A2.setBackground(Color.red);
		A2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot2.setMode("allianceSwitch");
			}
		});

		A3.setBounds(175, 260, 50, 50);
		A3.setFont(new Font(fontName, Font.BOLD, 30));
		A3.setBackground(Color.red);
		A3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot3.setMode("allianceSwitch");
			}
		});

		A4.setBounds(175, 330, 50, 50);
		A4.setFont(new Font(fontName, Font.BOLD, 30));
		A4.setBackground(Color.blue);
		A4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot1.setMode("allianceSwitch");
			}
		});

		A5.setBounds(175, 400, 50, 50);
		A5.setFont(new Font(fontName, Font.BOLD, 30));
		A5.setBackground(Color.blue);
		A5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot2.setMode("allianceSwitch");
			}
		});

		A6.setBounds(175, 470, 50, 50);
		A6.setFont(new Font(fontName, Font.BOLD, 30));
		A6.setBackground(Color.blue);
		A6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot3.setMode("allianceSwitch");
			}
		});

		C1.setBounds(450, 120, 50, 50);
		C1.setFont(new Font(fontName, Font.BOLD, 30));
		C1.setBackground(Color.red);
		C1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot1.setMode("opponentSwitch");
			}
		});

		C2.setBounds(450, 190, 50, 50);
		C2.setFont(new Font(fontName, Font.BOLD, 30));
		C2.setBackground(Color.red);
		C2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot2.setMode("opponentSwitch");
			}
		});

		C3.setBounds(450, 260, 50, 50);
		C3.setFont(new Font(fontName, Font.BOLD, 30));
		C3.setBackground(Color.red);
		C3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot3.setMode("opponentSwitch");
			}
		});

		C4.setBounds(450, 330, 50, 50);
		C4.setFont(new Font(fontName, Font.BOLD, 30));
		C4.setBackground(Color.blue);
		C4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot1.setMode("opponentSwitch");
			}
		});

		C5.setBounds(450, 400, 50, 50);
		C5.setFont(new Font(fontName, Font.BOLD, 30));
		C5.setBackground(Color.blue);
		C5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot2.setMode("opponentSwitch");
			}
		});

		C6.setBounds(450, 470, 50, 50);
		C6.setFont(new Font(fontName, Font.BOLD, 30));
		C6.setBackground(Color.blue);
		C6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot3.setMode("opponentSwitch");
			}
		});

		D1.setBounds(710, 120, 50, 50);
		D1.setFont(new Font(fontName, Font.BOLD, 30));
		D1.setBackground(Color.red);
		D1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot1.setMode("scale");
			}
		});

		D2.setBounds(710, 190, 50, 50);
		D2.setFont(new Font(fontName, Font.BOLD, 30));
		D2.setBackground(Color.red);
		D2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot2.setMode("scale");
			}
		});

		D3.setBounds(710, 260, 50, 50);
		D3.setFont(new Font(fontName, Font.BOLD, 30));
		D3.setBackground(Color.red);
		D3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot3.setMode("scale");
			}
		});

		D4.setBounds(710, 330, 50, 50);
		D4.setFont(new Font(fontName, Font.BOLD, 30));
		D4.setBackground(Color.blue);
		D4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot1.setMode("scale");
			}
		});

		D5.setBounds(710, 400, 50, 50);
		D5.setFont(new Font(fontName, Font.BOLD, 30));
		D5.setBackground(Color.blue);
		D5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot3.setMode("scale");
			}
		});

		D6.setBounds(710, 470, 50, 50);
		D6.setFont(new Font(fontName, Font.BOLD, 30));
		D6.setBackground(Color.blue);
		D6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot3.setMode("scale");
			}
		});

		E1.setBounds(850, 120, 175, 50);
		E1.setFont(new Font(fontName, Font.BOLD, 20));
		E1.setBackground(Color.red);
		E1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int defenseMode = ((Integer) E1.getSelectedItem()).intValue();
				RedRobot1.setMode("defense");
				RedRobot1.setTarget(defenseMode);

			}
		});

		E2.setBounds(850, 190, 175, 50);
		E2.setFont(new Font(fontName, Font.BOLD, 20));
		E2.setBackground(Color.red);
		E2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int defenseMode = ((Integer) E2.getSelectedItem()).intValue();
				RedRobot2.setMode("defense");
				RedRobot2.setTarget(defenseMode);

			}
		});

		E3.setBounds(850, 260, 175, 50);
		E3.setFont(new Font(fontName, Font.BOLD, 20));
		E3.setBackground(Color.red);
		E3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int defenseMode = ((Integer) E3.getSelectedItem()).intValue();
				RedRobot3.setMode("defense");
				RedRobot3.setTarget(defenseMode);

			}
		});

		E4.setBounds(850, 330, 175, 50);
		E4.setFont(new Font(fontName, Font.BOLD, 20));
		E4.setBackground(Color.blue);
		E4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int defenseMode = ((Integer) E4.getSelectedItem()).intValue();
				BlueRobot1.setMode("defense");
				BlueRobot1.setTarget(defenseMode);

			}
		});

		E5.setBounds(850, 400, 175, 50);
		E5.setFont(new Font(fontName, Font.BOLD, 20));
		E5.setBackground(Color.blue);
		E5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int defenseMode = ((Integer) E5.getSelectedItem()).intValue();
				BlueRobot2.setMode("defense");
				BlueRobot2.setTarget(defenseMode);

			}
		});

		E6.setBounds(850, 470, 175, 50);
		E6.setFont(new Font(fontName, Font.BOLD, 20));
		E6.setBackground(Color.blue);
		E6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int defenseMode = ((Integer) E6.getSelectedItem()).intValue();
				BlueRobot3.setMode("defense");
				BlueRobot3.setTarget(defenseMode);

			}
		});

		F1.setBounds(1120, 120, 50, 50);
		F1.setFont(new Font(fontName, Font.BOLD, 30));
		F1.setBackground(Color.red);
		F1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot1.setMode("vault");
			}
		});

		F2.setBounds(1120, 190, 50, 50);
		F2.setFont(new Font(fontName, Font.BOLD, 30));
		F2.setBackground(Color.red);
		F2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot2.setMode("vault");
			}
		});

		F3.setBounds(1120, 260, 50, 50);
		F3.setFont(new Font(fontName, Font.BOLD, 30));
		F3.setBackground(Color.red);
		F3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot3.setMode("vault");
			}
		});

		F4.setBounds(1120, 330, 50, 50);
		F4.setFont(new Font(fontName, Font.BOLD, 30));
		F4.setBackground(Color.blue);
		F4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot1.setMode("vault");
			}
		});

		F5.setBounds(1120, 400, 50, 50);
		F5.setFont(new Font(fontName, Font.BOLD, 30));
		F5.setBackground(Color.blue);
		F5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot2.setMode("vault");
			}
		});

		F6.setBounds(1120, 470, 50, 50);
		F6.setFont(new Font(fontName, Font.BOLD, 30));
		F6.setBackground(Color.blue);
		F6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot3.setMode("vault");
			}
		});

		G1.setBounds(1260, 120, 50, 50);
		G1.setFont(new Font(fontName, Font.BOLD, 30));
		G1.setBackground(Color.red);
		G1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot1.setClimb(true);
			}
		});

		G2.setBounds(1260, 190, 50, 50);
		G2.setFont(new Font(fontName, Font.BOLD, 30));
		G2.setBackground(Color.red);
		G2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot2.setClimb(true);
			}
		});

		G3.setBounds(1260, 260, 50, 50);
		G3.setFont(new Font(fontName, Font.BOLD, 30));
		G3.setBackground(Color.red);
		G3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RedRobot3.setClimb(true);
			}
		});

		G4.setBounds(1260, 330, 50, 50);
		G4.setFont(new Font(fontName, Font.BOLD, 30));
		G4.setBackground(Color.blue);
		G4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot1.setClimb(true);
			}
		});

		G5.setBounds(1260, 400, 50, 50);
		G5.setFont(new Font(fontName, Font.BOLD, 30));
		G5.setBackground(Color.blue);
		G5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot2.setClimb(true);
			}
		});

		G6.setBounds(1260, 470, 50, 50);
		G6.setFont(new Font(fontName, Font.BOLD, 30));
		G6.setBackground(Color.blue);
		G6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BlueRobot3.setClimb(true);
			}
		});

		panel.add(start);
		panel.add(allianceSwitch);
		panel.add(opponentSwitch);
		panel.add(scale);
		panel.add(defense);
		panel.add(climb1);
		panel.add(vault);
		panel.add(mistake);
		panel.add(R1);
		panel.add(R2);
		panel.add(R3);
		panel.add(B1);
		panel.add(B2);
		panel.add(B3);
		panel.add(redScore);
		panel.add(blueScore);
		panel.add(A1);
		panel.add(A2);
		panel.add(A3);
		panel.add(A4);
		panel.add(A5);
		panel.add(A6);
		panel.add(C1);
		panel.add(C2);
		panel.add(C3);
		panel.add(C4);
		panel.add(C5);
		panel.add(C6);
		panel.add(D1);
		panel.add(D2);
		panel.add(D3);
		panel.add(D4);
		panel.add(D5);
		panel.add(D6);
		panel.add(E1);
		panel.add(E2);
		panel.add(E3);
		panel.add(E4);
		panel.add(E5);
		panel.add(E6);
		panel.add(F1);
		panel.add(F2);
		panel.add(F3);
		panel.add(F4);
		panel.add(F5);
		panel.add(F6);
		panel.add(G1);
		panel.add(G2);
		panel.add(G3);
		panel.add(G4);
		panel.add(G5);
		panel.add(G6);

		// panel.add(RedScore);
		// panel.add(BlueScore);

		// panel and frame stuff
		this.setSize(1500, 725);
		panel.setBackground(Color.white);
		this.add(panel);
		this.setVisible(true);
	}
	

	public void setRedScore() {

		Integer j = new Integer(RedScore3.getScore());
		RedScore2.setText(j.toString());
	}

	public void setBlueScore() {

		Integer j = new Integer(BlueScore3.getScore());
		BlueScore2.setText(j.toString());
	}

	public void refreshScores(Score RedScore, Score BlueScore) {
		this.RedScore3 = RedScore;
		this.BlueScore3 = BlueScore;
	}

}
