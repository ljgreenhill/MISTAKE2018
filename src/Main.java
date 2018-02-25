import java.util.ArrayList;

public class Main {

	static double GAME_TIME = 135;

	public enum Side {
		red, blue
	}

	public enum Control {
		neutral, red, blue
	}

	public static int time;

	public int getTime() {
		return this.time;
	}

	public static void main(String[] args) {
		// Alliance BlueAlliance = new Alliance("blue", new Robot(), new Robot(), new
		// Robot());
		// Alliance RedAlliance = new Alliance("red", new Robot(), new Robot(), new
		// Robot());

		Alliance BlueAlliance = new Alliance("blue", new Robot(), new Robot(), new Robot());
		Alliance RedAlliance = new Alliance("red", new Robot(), new Robot(), new Robot());

		for (int i = 0; i < BlueAlliance.allianceRobots.size(); i++) {
			BlueAlliance.allianceRobots.get(i).setMyAlliance(BlueAlliance);
			BlueAlliance.allianceRobots.get(i).setOpposingAlliance(RedAlliance);
		}

		for (int i = 0; i < RedAlliance.allianceRobots.size(); i++) {
			RedAlliance.allianceRobots.get(i).setMyAlliance(RedAlliance);
			RedAlliance.allianceRobots.get(i).setOpposingAlliance(BlueAlliance);
		}

		Score RedScore = new Score("red");
		Score BlueScore = new Score("blue");
		FrontEnd myFrontEnd = new FrontEnd(BlueScore, RedScore, BlueAlliance.getRobot1(), BlueAlliance.getRobot2(),
				BlueAlliance.getRobot2(), RedAlliance.getRobot1(), RedAlliance.getRobot2(), RedAlliance.getRobot3());

		Field myField = new Field(new Scale(), new Vault("red"), new Vault("blue"), new Switch("red"),
				new Switch("blue"));

		Match myMatch = new Match(
				new Field(new Scale(), new Vault("red"), new Vault("blue"), new Switch("red"), new Switch("blue")),
				new Alliance("red", new Robot(), new Robot(), new Robot()),
				new Alliance("blue", new Robot(), new Robot(), new Robot()), new Score("red"), new Score("blue"));

		ArrayList<Robot> scaleBots = new ArrayList<Robot>();
		scaleBots.addAll(myMatch.getBlueAlliance().whoScale());
		scaleBots.addAll(myMatch.getRedAlliance().whoScale());

		ArrayList<Robot> allianceSwitchBots = new ArrayList<Robot>();
		allianceSwitchBots.addAll(myMatch.getBlueAlliance().whoAllianceSwitch());
		allianceSwitchBots.addAll(myMatch.getRedAlliance().whoAllianceSwitch());

		ArrayList<Robot> opponentSwitchBots = new ArrayList<Robot>();
		opponentSwitchBots.addAll(myMatch.getBlueAlliance().whoOpponentSwitch());
		opponentSwitchBots.addAll(myMatch.getRedAlliance().whoOpponentSwitch());

		ArrayList<Robot> vaultBots = new ArrayList<Robot>();
		vaultBots.addAll(myMatch.getBlueAlliance().whoVault());
		vaultBots.addAll(myMatch.getRedAlliance().whoVault());

		for (time = 1; time <= 135; time++) {
			for (int i = 0; i < scaleBots.size(); i++) {
				if (time != 0 && time % scaleBots.get(i).getPlaceCubeTimeScale(scaleBots.get(i).getMyAlliance(),
						scaleBots.get(i).getOpposingAlliance()) == 0) {
					myMatch.getField().getScale().putCube(scaleBots.get(i), time, myMatch.getRedScore(),
							myMatch.getBlueScore());

				}
				if (time != 0 && time % allianceSwitchBots.get(i).getPlaceCubeTimeSwitchAlliance(
						allianceSwitchBots.get(i).getMyAlliance(),
						allianceSwitchBots.get(i).getOpposingAlliance()) == 0) {
					myMatch.getField().getAllianceSwitch(allianceSwitchBots.get(i)).putCube(allianceSwitchBots.get(i),
							time, myMatch.getRedScore(), myMatch.getBlueScore());

				}
				if (time != 0 && time % opponentSwitchBots.get(i).getPlaceCubeTimeSwitchOpponent(
						opponentSwitchBots.get(i).getMyAlliance(),
						opponentSwitchBots.get(i).getOpposingAlliance()) == 0) {
					myMatch.getField().getOpponentSwitch(opponentSwitchBots.get(i)).putCube(opponentSwitchBots.get(i),
							time, myMatch.getRedScore(), myMatch.getBlueScore());

				}
				if (time != 0 && time % vaultBots.get(i).getPlaceCubeTimeScale(vaultBots.get(i).getMyAlliance(),
						vaultBots.get(i).getOpposingAlliance()) == 0) {
					myMatch.getField().getMyVault(vaultBots.get(i)).putCube();

				}

			}

		}
		myFrontEnd.refreshScores(myMatch.getRedScore(), myMatch.getBlueScore());
		System.out.print(RedScore.getScore());
		System.out.print(BlueScore.getScore());
	}// end of main

}
