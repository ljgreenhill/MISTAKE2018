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
	
	static int score;
	
	public int getTime() {
		return this.time;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
	  Alliance BlueAlliance = new Alliance("blue", new Robot(), new Robot(), new Robot());
	  Alliance RedAlliance = new Alliance("red", new Robot(), new Robot(), new Robot());
	  
	  for(int i = 0; i<BlueAlliance.allianceRobots.size(); i++) {
		  BlueAlliance.allianceRobots.get(i).setMyAlliance(BlueAlliance);
		  BlueAlliance.allianceRobots.get(i).setOpposingAlliance(RedAlliance);
	  }
	  
	  for(int i = 0; i<RedAlliance.allianceRobots.size(); i++) {
		  RedAlliance.allianceRobots.get(i).setMyAlliance(RedAlliance);
		  RedAlliance.allianceRobots.get(i).setOpposingAlliance(BlueAlliance);
	  }
	  
	  FrontEnd myFrontEnd = new FrontEnd(BlueAlliance.getRobot1(), BlueAlliance.getRobot2(), BlueAlliance.getRobot2(), RedAlliance.getRobot1(), RedAlliance.getRobot2(), RedAlliance.getRobot3());
	  Score RedScore = new Score("red");
	  Score BlueScore = new Score("blue");
	  Field myField = new Field(new Scale(), new Vault(), new Switch("red"), new Switch("blue") );
	  
	  ArrayList<Robot> scaleBots = new ArrayList<Robot> (); 
	  scaleBots.addAll(BlueAlliance.whoScale());
	  scaleBots.addAll(RedAlliance.whoScale());
	
	  
	  
	  for(time = 1; time <= 135; time ++) {
		  for(int i = 0; i<scaleBots.size(); i++) {
			  if(time != 0 && time%scaleBots.get(i).getPlaceCubeTimeScale(scaleBots.get(i).getMyAlliance(), scaleBots.get(i).getOpposingAlliance()) ==0 ) {
				  
			  }
		  }
	  
	  
	  
	  }
	  
	  
		
		
		
		
		
	}

}
