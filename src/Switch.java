
public class Switch {

	String color;
	int redCube;
	int blueCube;
	int scaleCubes;
	Main.Control state;
	Main.Control tempState = state.neutral;
	int oldTime = 0;

	Switch(String c) {
		this.color = c;
		oldTime = 0;
	}

	public Main.Control getSwitchState() {
		if (blueCube < redCube) {
			state = state.red;
		} else if (blueCube > redCube) {
			state = state.blue;
		} else {
			state = state.neutral;
		}

		return state;
	}

	public Main.Control updateState() {
		if (blueCube < redCube) {
			state = state.red;
		} else if (blueCube > redCube) {
			state = state.blue;
		} else {
			state = state.neutral;
		}

		return state;
	}

	public Main.Control getState() {
		updateState(); // might change later
		return state;
	}

	public void putCube(Robot myRobot, int newTime, Score RedScore, Score BlueScore) {
		Main.Control currentState = this.getState();

		int timeDifference = newTime - oldTime;
		this.oldTime = newTime;

		if (myRobot.getMyAlliance().getAllianceColor().equals("red")) {
			redCube++;
		} else {
			blueCube++;
		}

		Main.Control newState = this.getState();

		if (currentState == state.neutral && newState == state.red) {
			RedScore.updateScore(1);
		}
		if (currentState == state.neutral && newState == state.blue) {
			BlueScore.updateScore(1);
		}
		if (currentState == state.red && newState == state.neutral) {
			RedScore.updateScore(timeDifference);
		}
		if (currentState == state.blue && newState == state.neutral) {
			BlueScore.updateScore(timeDifference);
		}

	}

}
