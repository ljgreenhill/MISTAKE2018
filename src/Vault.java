
public class Vault {

	int vaultCubes;
	String color;

	Vault(String c) {
		this.color = c;

	}

	public int putCube() {
		vaultCubes++;
		return vaultCubes;
	}

}
