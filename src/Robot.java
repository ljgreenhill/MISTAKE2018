
public class Robot {
	

	static double switchAllianceTimeDefense;
	static double switchAllianceTimeNeutral;
	static double switchOpponentTime;
	static double scaleTimeDefense;
	static double scaleTimeNeutral;
	static double climbTime;
	static double vaultTime;
	static String mode;
	public static boolean climb = false;
	static double MATCH_TIME;
	
	public Robot () {}
	

	public String getMode() {
		return mode;
	}
	
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public static boolean getClimb() {
		return climb;
	}
	
	public void setClimb(boolean climb) {
		this.climb = climb;
	}
	
	//get and set time to deliver to own switch when defended
	public static double getSwitchAllianceTimeDefense() {
		return switchAllianceTimeDefense;
	}
	
	public void setSwitchAllianceTimeDefense(double switchAllianceTimeDefense) {
		this.switchAllianceTimeDefense = switchAllianceTimeDefense;
	}
	
	//get and set time to deliver to own switch without defense
	public static double getSwitchAllianceTimeNeutral() {
		return switchAllianceTimeNeutral;
	}
	
	public void setSwitchAllianceTimeNeutral(double switchAllianceTimeNeutral) {
		this.switchAllianceTimeNeutral = switchAllianceTimeNeutral;
	}
	
	//get and set time to deliver to opponent's switch
	public static double getSwitchOpponentTime() {
		return switchOpponentTime;
	}
	
	public void setSwitchOpponentTime(double switchOpponentTime) {
		this.switchOpponentTime = switchOpponentTime;
	}
	
	//get and set time to deliver to scale when defended
	public static double getScaleTimeDefense() {
		return scaleTimeDefense;
	}
	
	public void setScaleTimeDefense(double scaleTimeDefense) {
		this.scaleTimeDefense = scaleTimeDefense;
	}
	
	//get and set time to deliver to scale without defense
	public static double getScaleTimeNeutral() {
		return scaleTimeNeutral;
	}
	
	public void setScaleTimeNeutral(double scaleTimeNeutral) {
		this.scaleTimeNeutral = scaleTimeNeutral;
	}
	
	//get and set climb time
	public static double getClimbTime() {
		return climbTime;
	}
	
	public void setClimbTime(double climbTime) {
		this.climbTime = climbTime;
	}
	
	//get and set time to deliver to the vault
	public static double getVaultTime() {
		return vaultTime;
	}
	
	public void setVaultTime(double vaultTime) {
		this.vaultTime = vaultTime;
	}
	
	public static double findMatchTime() {
		if(Robot.climb == true) {
			MATCH_TIME = Main.GAME_TIME - Robot.getClimbTime();
		}
		else {
			MATCH_TIME = 135;
		}
		return MATCH_TIME;
	}
	
	
	
/*	//get and set robot mode
	public String getMode() {
		return mode;
	}
	
	public void setMode(String mode) {
		this.mode = mode;
	}*/

}
