
public class Score {
	String color;
	int count;
	int score;

	public Score(String c) {
		this.color = "c";
	}

	public int updateScore(int myAmount) {
		this.score += myAmount;

		return score;
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
