
public class Score {
	String color;
	
	
	public Score(String c) {
		this.color = "c";
	}

	int count;
	int score;
	
	public int updateScore(int myAmount) {
		this.score += myAmount;
		
		return score;
	}
	
/*	public int addScaleScore(Main.Control state) {
	  while(count <= 135) {
	    count++;
	    if(state == state.blue) {
				
		}
		
	  }
	  return score;
	}*/
	
	
}
