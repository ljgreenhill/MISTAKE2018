
public class Score {
	String color;
	int count;
	int score;
	int testScore;

	public Score(String c) {
		this.color = "c";
	}

	public int updateScore(int myAmount) {
		this.score += myAmount;

		return score;
	}

	public void setScore(int myScore) {
		this.testScore = myScore;
	}
	
	public int getScore() {
		return score;
	}

	/*
	 * public int addScaleScore(Main.Control state) { while(count <= 135) { count++;
	 * if(state == state.blue) {
	 * 
	 * }
	 * 
	 * } return score; }
	 */

}
