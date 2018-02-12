
public class Main {
	
	final static double GAME_TIME = 135;
	
	public enum Side {
		red, blue
	}
	
	public enum Control {
		neutral, red, blue
	}
	
	int time;
	int score;
	
	public int getTime() {
		return this.time;
	}
	
	
	
	
	public static void main(String[] args) {
	
	  Alliance BlueAlliance = new Alliance("blue", new Robot(), new Robot(), new Robot());
	  Alliance RedAlliance = new Alliance("red", new Robot(), new Robot(), new Robot());
	  FrontEnd myFrontEnd = new FrontEnd(BlueAlliance.getRobot1(), BlueAlliance.getRobot2(), BlueAlliance.getRobot2(), RedAlliance.getRobot1(), RedAlliance.getRobot2(), RedAlliance.getRobot3());
	//  Scale myScale = new Scale (scaleRobot, Main.Control state, Main.getTime() );
		
		
		
		
		
	}

}
