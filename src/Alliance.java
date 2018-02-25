import java.util.ArrayList;

public class Alliance {

	ArrayList<Robot> allianceRobots = new ArrayList<Robot>();
	Robot Robot1;
	Robot Robot2;
	Robot Robot3;

	String color;

	public Alliance(String c, Robot Ro1, Robot Ro2, Robot Ro3) {
		this.color = c;
		this.Robot1 = Ro1;
		this.Robot2 = Ro2;
		this.Robot3 = Ro3;

		this.allianceRobots.add(Robot1);
		this.allianceRobots.add(Robot2);
		this.allianceRobots.add(Robot3);
	}

	public int howManyClimb() {
		int climbNumber = 0;

		for (int i = 0; i < allianceRobots.size(); i++) {
			if (allianceRobots.get(i).getClimb()) {
				climbNumber++;
			}

		}

		return climbNumber;
	}
	
	public ArrayList<Robot> whoClimb() {
		ArrayList<Robot> climbBots = new ArrayList<Robot>();

		for (int i = 0; i < allianceRobots.size(); i++) {
			if (allianceRobots.get(i).getClimb() == true) {
				climbBots.add(allianceRobots.get(i));
			}
		}
		return climbBots;

	}

	public ArrayList<Robot> whoScale() {
		ArrayList<Robot> scaleBots = new ArrayList<Robot>();

		for (int i = 0; i < allianceRobots.size(); i++) {
			if (allianceRobots.get(i).getMode().equals("scale")) {
				scaleBots.add(allianceRobots.get(i));
			}
		}
		return scaleBots;

	}

	public ArrayList<Robot> whoAllianceSwitch() {
		ArrayList<Robot> allianceSwitchBots = new ArrayList<Robot>();

		for (int i = 0; i < allianceRobots.size(); i++) {
			if (allianceRobots.get(i).getMode().equals("allianceSwitch")) {
				allianceSwitchBots.add(allianceRobots.get(i));
			}
		}
		return allianceSwitchBots;
	}

	public ArrayList<Robot> whoOpponentSwitch() {
		ArrayList<Robot> opponentSwitchBots = new ArrayList<Robot>();

		for (int i = 0; i < allianceRobots.size(); i++) {
			if (allianceRobots.get(i).getMode().equals("allianceSwitch")) {
				opponentSwitchBots.add(allianceRobots.get(i));
			}
		}
		return opponentSwitchBots;
	}

	public ArrayList<Robot> whoVault() {
		ArrayList<Robot> vaultBots = new ArrayList<Robot>();

		for (int i = 0; i < allianceRobots.size(); i++) {
			if (allianceRobots.get(i).getMode().equals("allianceSwitch")) {
				vaultBots.add(allianceRobots.get(i));
			}
		}
		return vaultBots;
	}

	public Robot getRobot1() {
		return this.Robot1;
	}

	public Robot getRobot2() {
		return this.Robot2;
	}

	public Robot getRobot3() {
		return this.Robot3;
	}

	public String getAllianceColor() {
		return this.color;
	}

	public Alliance getOpposingAlliance(Alliance myAlliance, Alliance BlueAlliance, Alliance RedAlliance) {
		Alliance opposingAlliance;
		if (myAlliance.getAllianceColor() == "red") {
			opposingAlliance = BlueAlliance;
		} else {
			opposingAlliance = RedAlliance;
		}

		return opposingAlliance;
	}

}
