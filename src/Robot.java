
public class Robot {
	

	static double switchAllianceTimeDefense;
	static double switchAllianceTimeNeutral;
	static double switchOpponentTimeDefense;
	static double switchOpponentTimeNeutral;
	static double scaleTimeDefense;
	static double scaleTimeNeutral;
	static double climbTime;
	static double vaultTimeDefense;
	static double vaultTimeNeutral;
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
	
	//get and set time to deliver to opponent's switch with defense
	public static double getSwitchOpponentTimeDefense() {
		return switchOpponentTimeDefense;
	}
	
	public void setSwitchOpponentTimeDefense(double switchOpponentTimeDefense) {
		this.switchOpponentTimeDefense = switchOpponentTimeDefense;
	}
	
	//get and set time to deliver to opponent's switch neutral
	public static double getSwitchOpponentTimeNeutral() {
		return switchOpponentTimeNeutral;
	}
		
	public void setSwitchOpponentTimeNeutral(double switchOpponentTimeNeutral) {
		this.switchOpponentTimeNeutral = switchOpponentTimeNeutral;
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
	
	//get and set time to deliver to the vault with defense
	public static double getVaultTimeDefense() {
		return vaultTimeDefense;
	}
	
	public void setVaultTimeDefense(double vaultTimeDefense) {
		this.vaultTimeDefense = vaultTimeDefense;
	}
	
	//get and set time to deliver to the vault neutral
	public static double getVaultTimeNeutral() {
		return vaultTimeNeutral;
	}
		
	public void setVaultTimeNeutral(double vaultTimeNeutral) {
		this.vaultTimeNeutral = vaultTimeNeutral;
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
