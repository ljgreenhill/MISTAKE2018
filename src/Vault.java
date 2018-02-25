
public class Vault {

	int vaultCubes;
	String color;

	public Vault(String c) {
		this.color = c;

	}

	public int putCube(Robot myRobot, Score RedScore, Score BlueScore) {
		vaultCubes++;
		
		
		if (myRobot.getMyAlliance().getAllianceColor().equals("red")) {
			RedScore.updateScore(5);
		} else {
			BlueScore.updateScore(5);
		}
	  return vaultCubes;
	}

}
