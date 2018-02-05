
public class Robot {
	

	double switchAllianceTimeDefense;
	double switchAllianceTimeNeutral;
	double switchOpponentTime;
	double scaleTimeDefense;
	double scaleTimeNeutral;
	double climbTime;
	double vaultTime;
	String mode;
	boolean climb = false;
	
	public Robot () {}
	

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
	
	//get and set time to deliver to opponent's switch
	public double getSwitchOpponentTime() {
		return switchOpponentTime;
	}
	
	public void setSwitchOpponentTime(double switchOpponentTime) {
		this.switchOpponentTime = switchOpponentTime;
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
	
	//get and set time to deliver to the vault
	public double getVaultTime() {
		return vaultTime;
	}
	
	public void setVaultTime(double vaultTime) {
		this.vaultTime = vaultTime;
	}
	
/*	//get and set robot mode
	public String getMode() {
		return mode;
	}
	
	public void setMode(String mode) {
		this.mode = mode;
	}*/

}
