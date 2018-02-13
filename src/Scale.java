
public class Scale {
	
	int redCube;
	int blueCube;
	int scaleCubes;
	Main.Control state;
	Main.Control tempState = state.neutral;
	int startTime = 0;
	int finalTime = 0;
	
	
/*	public Main.Control putCube(Robot scaleRobot, Main.Control state, Alliance myAlliance, Alliance opposingAlliance) {
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
		
	}*/
	
	/*public int getPutCubeTime(Robot scaleRobot, Main.Control state, Alliance myAlliance, Alliance opposingAlliance){
		startTime = Main.time;
		if(scaleRobot.isTarget(opposingAlliance) == true) {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeDefense());
		}
		else {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeNeutral());
		}
		
		return finalTime;
	}*/
	
	public Main.Control getState(Robot scaleRobot, Main.Control state, Alliance myAlliance, Alliance opposingAlliance) {
		Main.Control tempState = state;
		if(scaleRobot.getRobotAlliance(myAlliance, scaleRobot, opposingAlliance) == "red") {
			redCube++;
		}
		else {
			blueCube++;
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
	
	//get number of cubes delivered in match
	public int putCubeScale(Alliance myAlliance, Alliance opposingAlliance, Robot myRobot) {
		int scaleCubesMatch = 0;
		if(myAlliance.whoScale().contains(myRobot)) {
			scaleCubesMatch = (int) (myRobot.findMatchTime()/myRobot.getPutCubeTime(myRobot, myAlliance, opposingAlliance)); 
		}
		return scaleCubesMatch;
	}
		
	
	public Main.Control getControl() {
		Main.Control myControl = Main.Control.neutral;
		return myControl;
	}

}
