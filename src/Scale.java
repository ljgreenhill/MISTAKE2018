
public class Scale {
	
	int redCube;
	int blueCube;
	int scaleCubes;
	Main.Control state;
	Main.Control tempState = state.neutral;
	int startTime = 0;
	int finalTime = 0;
	
	
	public Main.Control putCube(Robot scaleRobot, Main.Control state, int time) {
		Main.Control tempState = state;
		startTime = Main.time;
		if(scaleRobot.isTarget() == true) {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeDefense());
		}
		else {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeNeutral());
		}
		
		return state;
	}
	
	public Main.Control getControl() {
		Main.Control myControl = Main.Control.neutral;
		return myControl;
	}

}
