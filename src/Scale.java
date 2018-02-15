
public class Scale {
	
	int redCube;
	int blueCube;
	int scaleCubes;
	Main.Control state;
	Main.Control tempState = state.neutral;
	int startTime = 0;
	int finalTime = 0;
	int count = 0;

	
	
/*	public Main.Control putCube(Robot scaleRobot, Main.Control state, Alliance myAlliance, Alliance opposingAlliance) {
		Main.Control tempState = state;
		startTime = Main.time;
		if(scaleRobot.getRobotAlliance(myAlliance, scaleRobot) == "red") {
			redCube++;
		}
		else {
			blueCube++;
		}
		if(scaleRobot.isTarget(opposingAlliance) == true) {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeDefense());
		}
		else {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeNeutral());
		}
		
		if (blueCube < redCube) {
			state = state.red;
		}
		else if (blueCube > redCube) {
			state = state.blue;
		}
		else {
			state = state.neutral;
		}
		
		return state;
		
	}*/
	
	/*public int getPutCubeTime(Robot scaleRobot, Main.Control state, Alliance myAlliance, Alliance opposingAlliance){
		startTime = Main.time;
		if(scaleRobot.isTarget(opposingAlliance) == true) {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeDefense());
		}
		else {
			finalTime = (int) (startTime + scaleRobot.getScaleTimeNeutral());
		}
		
		return finalTime;
	}*/
	
/*	public Main.Control getState(Robot scaleRobot, Main.Control state, Alliance myAlliance, Alliance opposingAlliance) {
		Main.Control tempState = state;
		if(scaleRobot.getRobotAlliance(myAlliance, opposingAlliance) == "red") {
			redCube++;
		}
		else {
			blueCube++;
		}
		if (blueCube < redCube) {
			state = state.red;
		}
		else if (blueCube > redCube) {
			state = state.blue;
		}
		else {
			state = state.neutral;
		}
		
		return state;
	} */
	
	public int getState(Robot scaleRobot, Main.Control state, Alliance myAlliance, Alliance opposingAlliance, Alliance BlueAlliance, Alliance RedAlliance) {
		Main.Control tempState = state;
		int RedScore = 0;
		int BlueScore = 0;
		for (int i = 1; i <= 135; i ++) {
		  if(i%scaleRobot.getPlaceCubeTimeScale(myAlliance, opposingAlliance) == 0) {
		    if(scaleRobot.getRobotAlliance(myAlliance, opposingAlliance) == "red") {
		    	addToSide(scaleRobot, RedAlliance, BlueAlliance);
		    }
		    else {
		    	addToSide(scaleRobot, BlueAlliance, RedAlliance);
		    }
	      }
		 if(getScaleState() == state.red) {
			 RedScore++;
		 }
		 else if (getScaleState() == state.blue) {
			 BlueScore++;
		 }
		 else {
			 RedScore += 0;
			 BlueScore += 0;
		 }
	  }
	return RedScore BlueScore;
	}
	
	
	//get number of cubes delivered in match
	public int putCubeScale(Alliance myAlliance, Alliance opposingAlliance, Robot myRobot) {
		int scaleCubesMatch = 0;
		if(myAlliance.whoScale().contains(myRobot)) {
			scaleCubesMatch = (int) (myRobot.findMatchTime()/myRobot.getPlaceCubeTimeScale(myAlliance, opposingAlliance)); 
		}
		return scaleCubesMatch;
	}
		
	
	public Main.Control getControl() {
		Main.Control myControl = Main.Control.neutral;
		return myControl;
	}
	
	public void addToSide(Robot scaleRobot, Alliance myAlliance, Alliance opposingAlliance) {
      if(scaleRobot.getRobotAlliance(myAlliance, opposingAlliance) == "red") {
    	  redCube++;
      }
      else {
    	  blueCube++;
      }
	}
	
	public Main.Control getScaleState(){
      if (blueCube < redCube) {
	    state = state.red;
	    }
	  else if (blueCube > redCube) {
	    state = state.blue;
	  }
	  else {
	  state = state.neutral;
	  }
		
	  return state;
	}
	
	
}
