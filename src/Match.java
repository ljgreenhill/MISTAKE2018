
public class Match {
	
	static long endTime = 0;
	static long startTime = 0;
	static long timeElapsed = 0;
	

	enum MatchState(int ) {
		  opponent(0), alliance(1);
	}
	
	MatchState allianceSwitch;
	MatchState opponentSwitch;
	MatchState allianceScale;
	MatchState opponentScale;
	

	public static void main(String argsp[]) {
		
	      long timeLeft = 135000;
		
		  while(System.currentTimeMillis() < endTime){
		    timeElapsed = System.currentTimeMillis() - startTime;
		    timeLeft = endTime - System.currentTimeMillis();
	      
		  }// end of timer while
		  
		}// end of main

	void predictScore() {
		currentScore + 
	}
	
	
}
