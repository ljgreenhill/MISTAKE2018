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
	
	//static int score;
	
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
	  
	  
	  Score RedScore = new Score("red");
	  Score BlueScore = new Score("blue");
	  FrontEnd myFrontEnd = new FrontEnd(BlueScore, RedScore, BlueAlliance.getRobot1(), BlueAlliance.getRobot2(), BlueAlliance.getRobot2(), RedAlliance.getRobot1(), RedAlliance.getRobot2(), RedAlliance.getRobot3());
	  
	  Field myField = new Field(new Scale(), new Vault("red"), new Vault("blue"), new Switch("red"), new Switch("blue") );
	  
	  ArrayList<Robot> scaleBots = new ArrayList<Robot> (); 
	  scaleBots.addAll(BlueAlliance.whoScale());
	  scaleBots.addAll(RedAlliance.whoScale());
	  
	  ArrayList<Robot> allianceSwitchBots = new ArrayList<Robot> ();
	  allianceSwitchBots.addAll(BlueAlliance.whoAllianceSwitch());
	  allianceSwitchBots.addAll(RedAlliance.whoAllianceSwitch());
	  
	  ArrayList<Robot> opponentSwitchBots = new ArrayList<Robot> ();
	  opponentSwitchBots.addAll(BlueAlliance.whoOpponentSwitch());
	  opponentSwitchBots.addAll(RedAlliance.whoOpponentSwitch());
	  
	  ArrayList<Robot> vaultBots = new ArrayList<Robot> ();
	  vaultBots.addAll(BlueAlliance.whoVault());
	  vaultBots.addAll(RedAlliance.whoVault());
	
	  
	  
	  for(time = 1; time <= 135; time ++) {
		  for(int i = 0; i<scaleBots.size(); i++) {
			  if(time != 0 && time%scaleBots.get(i).getPlaceCubeTimeScale(scaleBots.get(i).getMyAlliance(), scaleBots.get(i).getOpposingAlliance()) ==0 ) {
				  myField.getScale().putCube(scaleBots.get(i), time, RedScore, BlueScore);
			  }
			  if(time != 0 && time%allianceSwitchBots.get(i).getPlaceCubeTimeSwitchAlliance(allianceSwitchBots.get(i).getMyAlliance(), allianceSwitchBots.get(i).getOpposingAlliance()) ==0 ) {
				  myField.getAllianceSwitch(allianceSwitchBots.get(i)).putCube(allianceSwitchBots.get(i), time, RedScore, BlueScore);
			  }
			  if(time != 0 && time%opponentSwitchBots.get(i).getPlaceCubeTimeSwitchOpponent(opponentSwitchBots.get(i).getMyAlliance(), opponentSwitchBots.get(i).getOpposingAlliance()) ==0 ) {
				  myField.getOpponentSwitch(opponentSwitchBots.get(i)).putCube(opponentSwitchBots.get(i), time, RedScore, BlueScore);
			  }
			  if(time != 0 && time%vaultBots.get(i).getPlaceCubeTimeScale(vaultBots.get(i).getMyAlliance(), vaultBots.get(i).getOpposingAlliance()) ==0 ) {
				  myField.getMyVault(vaultBots.get(i)).putCube();
			  }
			  
		  }
	  
	  
	  
	  }
	  
	  
		
		
		
		
		
	}

}
