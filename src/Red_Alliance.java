


public class Red_Alliance {
	
	 double vaultCubes;
	 double scaleCubes;
	 double opponentSwitchCubes;
	 double allianceSwitchCubes;
	 
	 public static boolean redScaleDefense = false; //the red alliance is guarding the scale
     public static boolean redAllianceSwitchDefense = false; // the red alliance is guarding their own switch
	 public static boolean redOpponentSwitchDefense = false; // the red alliance is guarding their opponents switch
	 public static boolean redOpponentVaultDefense = false; // the red alliance is guarding their opponent's vault
	
  public Red_Alliance (Robot RedRobot1, Robot RedRobot2, Robot RedRobot3) {
	  
	 
	  
	  switch(Robot.mode) {
	  
	    case "scale": Robot.mode = "scale";
	    
	      if(Blue_Alliance.blueScaleDefense == true) {
      	    scaleCubes = Robot.getScaleTimeDefense()/Robot.findMatchTime();
          }
          else {
      	    scaleCubes = Robot.getScaleTimeNeutral()/Robot.findMatchTime();
          }
	    break;
	  
        case "opponentSwitch": Robot.mode = "opponentSwitch";
          if(Blue_Alliance.blueAllianceSwitchDefense == true) {
        	  opponentSwitchCubes = Robot.getSwitchOpponentTimeDefense()/Robot.findMatchTime();
          }
          else {
        	opponentSwitchCubes = Robot.getSwitchOpponentTimeNeutral()/Robot.findMatchTime();	  
          }
        break;
        
        case "allianceSwitch": Robot.mode = "allianceSwitch";
          if(Blue_Alliance.blueOpponentSwitchDefense == true) {
        	  allianceSwitchCubes = Robot.getSwitchAllianceTimeDefense()/Robot.findMatchTime();
          }
          else {
        	  allianceSwitchCubes = Robot.getSwitchAllianceTimeNeutral()/Robot.findMatchTime();
          }
          
        break;
        
        case "vault": Robot.mode = "vault";
          if(Blue_Alliance.blueOpponentVaultDefense == true) {
        	  vaultCubes = Robot.getVaultTimeDefense()/Robot.findMatchTime();
          }
          else {
        	  vaultCubes = Robot.getVaultTimeNeutral()/Robot.findMatchTime();
          }
        break;        
      } // end of switch statement
	  
	//find if red alliance robot is playing defense on the scale
    if(RedRobot1.getMode() == "allianceScaleDefense") {
      redScaleDefense = true;
	}
	else {
      redScaleDefense = false;
	}
			
    if(RedRobot2.getMode() == "allianceScaleDefense") {
	  redScaleDefense = true;
    }
	else {
	  redScaleDefense = false;
	}
			
	if(RedRobot3.getMode() == "allianceScaleDefense") {
	  redScaleDefense = true;
    }
	else {
	  redScaleDefense = false;
	}
			
	//find if red alliance robot is playing defense on their own switch
    if(RedRobot1.getMode() == "allianceSwitchDefense") {
	  redAllianceSwitchDefense = true;
    }
	else {
	  redAllianceSwitchDefense = false;
	}
			
	if(RedRobot2.getMode() == "allianceSwitchDefense") {
	  redAllianceSwitchDefense = true;
	}
	else {
      redAllianceSwitchDefense = false;
	}
			
	if(RedRobot3.getMode() == "allianceSwitchDefense") {
	  redAllianceSwitchDefense = true;
	}
	else {
	  redAllianceSwitchDefense = false;
	}
			
	//find if red alliance robot is playing defense on their opponents switch
    if(RedRobot1.getMode() == "opponentSwitchDefense") {
	  redOpponentSwitchDefense = true;
	}
	else {
      redOpponentSwitchDefense = false;
	}
			
	if(RedRobot2.getMode() == "opponentSwitchDefense") {
      redOpponentSwitchDefense = true;
    }
	else {
	  redOpponentSwitchDefense = false;
	}
			
    if(RedRobot3.getMode() == "opponentSwitchDefense") {
	  redOpponentSwitchDefense = true;
	}
	else {
	  redOpponentSwitchDefense = false;
	}
			
	//find if red alliance robot is guarding their opponents vault
    if(RedRobot1.getMode() == "opponentVaultDefense") {
	  redOpponentVaultDefense = true;
    }
	else {
	  redOpponentVaultDefense = false;
	}
					
	if(RedRobot2.getMode() == "opponentVaultDefense") {
	  redOpponentVaultDefense = true;
	}
	else {
	  redOpponentVaultDefense = false;
	}
					
    if(RedRobot3.getMode() == "opponentVaultDefense") {
      redOpponentVaultDefense = true;
    }
	else {
      redOpponentVaultDefense = false;
	}

  } 
		
}


