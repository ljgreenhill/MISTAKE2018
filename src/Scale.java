
public class Scale {
	
	int redCube;
	int blueCube;
	int scaleCubes;
	Main.Control state;
	Main.Control tempState = state.neutral;
	int startTime = 0;
	int finalTime = 0;
	
	
	public Main.Control putCube(Robot scaleRobot, Main.Control state, Alliance myAlliance, Alliance opposingAlliance) {
		Main.Control tempState = state;
		startTime = Main.time;
		if(scaleRobot.getRobotAlliance(myAlliance, scaleRobot) == "red") {
			redCube++;
		}
		else {
			blueCube++;
		}
		if(scaleRobot.isTarget(opposingAlliance) == true) {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeDefense());
		}
		else {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeNeutral());
		}
		
		if (blueCube < redCube) {
			state = state.red;
		}
		else if (blueCube > redCube) {
			state = state.blue;
		}
		else {
			state = state.neutral;
		}
		
		return state;
	}
		
	
	public Main.Control getControl() {
		Main.Control myControl = Main.Control.neutral;
		return myControl;
	}

}
