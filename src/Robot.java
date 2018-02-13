
public class Robot {
	// should not be static

	double switchAllianceTimeDefense;
	double switchAllianceTimeNeutral;
	double switchOpponentTimeDefense;
	double switchOpponentTimeNeutral;
	double scaleTimeDefense;
	double scaleTimeNeutral;
	double climbTime;
	double vaultTimeDefense;
	double vaultTimeNeutral;
	private String mode;
	private boolean climb;
	double MATCH_TIME;
	int target;
	int id;
	
	public Robot () {
		this.climb = false;
		this.target = 0;
		this.id = 0;
	}
	

	public String getMode() {
		return mode;
	}
	
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public boolean getClimb() {
		return climb;
	}
	
	public void setClimb(boolean climb) {
		this.climb = climb;
	}
	
	//get and set time to deliver to own switch when defended
	public double getSwitchAllianceTimeDefense() {
		return switchAllianceTimeDefense;
	}
	
	public void setSwitchAllianceTimeDefense(double switchAllianceTimeDefense) {
		this.switchAllianceTimeDefense = switchAllianceTimeDefense;
	}
	
	//get and set time to deliver to own switch without defense
	public double getSwitchAllianceTimeNeutral() {
		return switchAllianceTimeNeutral;
	}
	
	public void setSwitchAllianceTimeNeutral(double switchAllianceTimeNeutral) {
		this.switchAllianceTimeNeutral = switchAllianceTimeNeutral;
	}
	
	//get and set time to deliver to opponent's switch with defense
	public double getSwitchOpponentTimeDefense() {
		return switchOpponentTimeDefense;
	}
	
	public void setSwitchOpponentTimeDefense(double switchOpponentTimeDefense) {
		this.switchOpponentTimeDefense = switchOpponentTimeDefense;
	}
	
	//get and set time to deliver to opponent's switch neutral
	public double getSwitchOpponentTimeNeutral() {
		return switchOpponentTimeNeutral;
	}
		
	public void setSwitchOpponentTimeNeutral(double switchOpponentTimeNeutral) {
		this.switchOpponentTimeNeutral = switchOpponentTimeNeutral;
	}
	
	//get and set time to deliver to scale when defended
	public double getScaleTimeDefense() {
		return scaleTimeDefense;
	}
	
	public void setScaleTimeDefense(double scaleTimeDefense) {
		this.scaleTimeDefense = scaleTimeDefense;
	}
	
	//get and set time to deliver to scale without defense
	public double getScaleTimeNeutral() {
		return scaleTimeNeutral;
	}
	
	public void setScaleTimeNeutral(double scaleTimeNeutral) {
		this.scaleTimeNeutral = scaleTimeNeutral;
	}
	
	//get and set climb time
	public double getClimbTime() {
		return climbTime;
	}
	
	public void setClimbTime(double climbTime) {
		this.climbTime = climbTime;
	}
	
	//get and set time to deliver to the vault with defense
	public double getVaultTimeDefense() {
		return vaultTimeDefense;
	}
	
	public void setVaultTimeDefense(double vaultTimeDefense) {
		this.vaultTimeDefense = vaultTimeDefense;
	}
	
	//get and set time to deliver to the vault neutral
	public double getVaultTimeNeutral() {
		return vaultTimeNeutral;
	}
		
	public void setVaultTimeNeutral(double vaultTimeNeutral) {
		this.vaultTimeNeutral = vaultTimeNeutral;
	}
	
	public double findMatchTime() {
		if(this.climb == true) {
			MATCH_TIME = Main.GAME_TIME - this.getClimbTime();
		}
		else {
			MATCH_TIME = 135;
		}
		return MATCH_TIME;
	}
	
	
	public void setTarget(int target) {
		this.target = target;
		
	}
	
	public int getTarget() {
		return target;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public boolean isTarget(Alliance opposingAlliance ) {
		boolean result = false;
		for(int i = 0; i<opposingAlliance.allianceRobots.size(); i++) {
		  if(opposingAlliance.allianceRobots.get(i).getTarget() == this.id) {
		    result = true;
		  }
		  else {
		    result = false;
		}
		
	  }
		return result;
	}
	
	public String getRobotAlliance(Alliance myAlliance, Robot myRobot, Alliance opponentAlliance) {
	  if(myAlliance.allianceRobots.contains(myRobot)) {
		  return myAlliance.getAllianceColor();
	  }
	  else {
		  return opponentAlliance.getAllianceColor();
	  }
	}
	
	public int getPutCubeTime(Robot scaleRobot, Alliance myAlliance, Alliance opposingAlliance){
		int startTime = 0;
		int finalTime;
		
		if(scaleRobot.isTarget(opposingAlliance) == true) {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeDefense());
		}
		else {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeNeutral());
		}
		
		return finalTime;
	}
	
	
	
	
/*	//get and set robot mode
	public String getMode() {
		return mode;
	}
	
	public void setMode(String mode) {
		this.mode = mode;
	}*/

}
