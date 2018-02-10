/*


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
	  
	
	  
	 
	  
	  switch(RedRobot1.mode) {
	  
	    case "scale": 
	    
	      if(Blue_Alliance.blueScaleDefense == true) {
      	    scaleCubes = Robot.getScaleTimeDefense()/Robot.findMatchTime();
          }
          else {
      	    scaleCubes = Robot.getScaleTimeNeutral()/Robot.findMatchTime();
          }
	    break;
	  
        case "opponentSwitch": 
          if(Blue_Alliance.blueAllianceSwitchDefense == true) {
        	  opponentSwitchCubes = Robot.findMatchTime()/Robot.getSwitchOpponentTimeDefense();
          }
          else {
        	opponentSwitchCubes = Robot.findMatchTime()/Robot.getSwitchOpponentTimeNeutral();	  
          }
        break;
        
        case "allianceSwitch": 
          if(Blue_Alliance.blueOpponentSwitchDefense == true) {
        	  allianceSwitchCubes = Robot.findMatchTime()/Robot.getSwitchAllianceTimeDefense();
          }
          else {
        	  allianceSwitchCubes = Robot.findMatchTime()/Robot.getSwitchAllianceTimeNeutral();
          }
          
        break;
        
        case "vault": Robot.mode = "vault";
          if(Blue_Alliance.blueOpponentVaultDefense == true) {
        	  vaultCubes = Robot.findMatchTime()/Robot.getVaultTimeDefense();
          }
          else {
        	  vaultCubes = Robot.findMatchTime()/Robot.getVaultTimeNeutral();
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

*/
