


public class Red_Alliance {
	
	 double vaultCubes;
	 double scaleCubes;
	 double opponentSwitchCubes;
	 double allianceSwitchCubes;
	
  public Red_Alliance (Robot RedRobot1, Robot RedRobot2, Robot RedRobot3) {
	  
	 
	  
	  switch(Robot.mode) {
	  
	    case "scale": Robot.mode = "scale";
	    scaleCubes = Robot.getScaleTimeNeutral()/Robot.findMatchTime();;
	    break;
	  
        case "opponentSwitch": Robot.mode = "opponentSwitch";
        
        break;
        
        case "allianceSwitch": Robot.mode = "allianceSwitch";
          if(Blue_Alliance.blueAllianceScaleDefense == true) {
        	  allianceSwitchCubes = Robot.getSwitchAllianceTimeDefense()/Robot.findMatchTime();
          }
          else {
        	  allianceSwitchCubes = Robot.getSwitchAllianceTimeNeutral()/Robot.findMatchTime();
          }
        	  
        break;
        
        case "vault": Robot.mode = "vault";
        vaultCubes = Robot.getVaultTime()/Robot.findMatchTime();;
        break;
        
        
        case "noDefense": Robot.mode = "noDefense";
        break;
        
        case "allianceSwitchDefense": Robot.mode = "allianceSwitchDefense";
        break;
        
        case "opponentSwitchDefense": Robot.mode = "opponentSwitchDefense";
        break;
        
        case "scaleDefense": Robot.mode = "scaleDefense";
        break;
      }

  } 
		
}


