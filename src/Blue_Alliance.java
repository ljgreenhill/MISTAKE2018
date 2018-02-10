
public class Blue_Alliance {
	
	public static boolean blueScaleDefense = false; //the blue alliance is guarding the scale
	public static boolean blueAllianceSwitchDefense = false; // the blue alliance is guarding their own switch
	public static boolean blueOpponentSwitchDefense = false; // the blue alliance is guarding their opponents switch
	public static boolean blueOpponentVaultDefense = false; // the blue alliance is guarding their opponent's vault 
	
	double vaultCubes;
	double scaleCubes;
	double opponentSwitchCubes;
	double allianceSwitchCubes;
	 
	public Blue_Alliance (Robot BlueRobot1, Robot BlueRobot2, Robot BlueRobot3) {
		
		switch(Robot.mode) {
		  
	    case "scale": Robot.mode = "scale";
	    
	      if(Red_Alliance.redScaleDefense == true) {
      	    scaleCubes = Robot.getScaleTimeDefense()/Robot.findMatchTime();
          }
          else {
      	    scaleCubes = Robot.getScaleTimeNeutral()/Robot.findMatchTime();
          }
	    break;
	  
        case "opponentSwitch": Robot.mode = "opponentSwitch";
          if(Red_Alliance.redAllianceSwitchDefense == true) {
        	  opponentSwitchCubes = Robot.getSwitchOpponentTimeDefense()/Robot.findMatchTime();
          }
          else {
        	opponentSwitchCubes = Robot.getSwitchOpponentTimeNeutral()/Robot.findMatchTime();	  
          }
        break;
        
        case "allianceSwitch": Robot.mode = "allianceSwitch";
          if(Red_Alliance.redOpponentSwitchDefense == true) {
        	  allianceSwitchCubes = Robot.getSwitchAllianceTimeDefense()/Robot.findMatchTime();
          }
          else {
        	  allianceSwitchCubes = Robot.getSwitchAllianceTimeNeutral()/Robot.findMatchTime();
          }
          
        break;
        
        case "vault": Robot.mode = "vault";
          if(Red_Alliance.redOpponentVaultDefense == true) {
        	  vaultCubes = Robot.getVaultTimeDefense()/Robot.findMatchTime();
          }
          else {
        	  vaultCubes = Robot.getVaultTimeNeutral()/Robot.findMatchTime();
          }
        break;        
      } // end of switch statement
		
		//find if blue alliance robot is playing defense on the scale
		if(BlueRobot1.getMode() == "allianceScaleDefense") {
			blueScaleDefense = true;
	    }
		else {
			blueScaleDefense = false;
		}
		
		if(BlueRobot2.getMode() == "allianceScaleDefense") {
			blueScaleDefense = true;
	    }
		else {
			blueScaleDefense = false;
		}
		
		if(BlueRobot3.getMode() == "allianceScaleDefense") {
			blueScaleDefense = true;
	    }
		else {
			blueScaleDefense = false;
		}
		
		//find if blue alliance robot is playing defense on their own switch
		if(BlueRobot1.getMode() == "allianceSwitchDefense") {
			blueAllianceSwitchDefense = true;
	    }
		else {
			blueAllianceSwitchDefense = false;
		}
		
		if(BlueRobot2.getMode() == "allianceSwitchDefense") {
			blueAllianceSwitchDefense = true;
	    }
		else {
			blueAllianceSwitchDefense = false;
		}
		
		if(BlueRobot3.getMode() == "allianceSwitchDefense") {
			blueAllianceSwitchDefense = true;
	    }
		else {
			blueAllianceSwitchDefense = false;
		}
		
		//find if blue alliance robot is playing defense on their opponents switch
		if(BlueRobot1.getMode() == "opponentSwitchDefense") {
			blueOpponentSwitchDefense = true;
	    }
		else {
			blueOpponentSwitchDefense = false;
		}
		
		if(BlueRobot2.getMode() == "opponentSwitchDefense") {
			blueOpponentSwitchDefense = true;
	    }
		else {
			blueOpponentSwitchDefense = false;
		}
		
		if(BlueRobot3.getMode() == "opponentSwitchDefense") {
			blueOpponentSwitchDefense = true;
	    }
		else {
			blueOpponentSwitchDefense = false;
		}
		
		//find if blue alliance robot is guarding their opponents vault
		if(BlueRobot1.getMode() == "opponentVaultDefense") {
	      blueOpponentVaultDefense = true;
		}
		else {
		  blueOpponentVaultDefense = false;
		}
				
		if(BlueRobot2.getMode() == "opponentVaultDefense") {
		  blueOpponentVaultDefense = true;
	    }
		else {
		  blueOpponentVaultDefense = false;
		}
				
		if(BlueRobot3.getMode() == "opponentVaultDefense") {
		  blueOpponentVaultDefense = true;
	    }
		else {
		  blueOpponentVaultDefense = false;
		}
		
		
		
	}

	
	
	

}
