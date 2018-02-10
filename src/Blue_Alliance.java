
public class Blue_Alliance {
	
	public static boolean blueAllianceScaleDefense = false; //the blue alliance is guarding the scale
	
	public Blue_Alliance (Robot BlueRobot1, Robot BlueRobot2, Robot BlueRobot3) {
		
		if(BlueRobot1.getMode() == "allianceScaleDefense") {
			blueAllianceScaleDefense = true;
	    }
		else {
			blueAllianceScaleDefense = false;
		}
		
		if(BlueRobot2.getMode() == "allianceScaleDefense") {
			blueAllianceScaleDefense = true;
	    }
		else {
			blueAllianceScaleDefense = false;
		}
		
		if(BlueRobot3.getMode() == "allianceScaleDefense") {
			blueAllianceScaleDefense = true;
	    }
		else {
			blueAllianceScaleDefense = false;
		}
		
		
		
	}

	
	
	

}
