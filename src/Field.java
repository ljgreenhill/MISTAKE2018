
public class Field {
	Scale scale;
	Vault RedVault;
	Vault BlueVault;
	Switch RedSwitch;
	Switch BlueSwitch;

	Field(Scale myScale, Vault RVault, Vault BVault, Switch RSwitch, Switch BSwitch) {
		this.scale = myScale;
		this.RedVault = RVault;
		this.BlueVault = BVault;
		this.BlueSwitch = BlueSwitch;
		this.RedSwitch = RedSwitch;

	}

	public Scale getScale() {
		return this.scale;
	}

	public Vault getRedVault() {
		return this.RedVault;
	}

	public Vault getBlueVault() {
		return this.BlueVault;
	}

	public Switch getRedSwitch() {
		return this.RedSwitch;
	}

	public Switch getBlueSwitch() {
		return this.BlueSwitch;
	}

	public Switch getAllianceSwitch(Robot myRobot) {
		Switch AllianceSwitch;
		if (myRobot.getMyAlliance().getAllianceColor().equals("red")) {
			AllianceSwitch = RedSwitch;
		} else {
			AllianceSwitch = BlueSwitch;
		}
		return AllianceSwitch;
	}

	public Switch getOpponentSwitch(Robot myRobot) {
		Switch OpponentSwitch;
		if (myRobot.getMyAlliance().getAllianceColor().equals("red")) {
			OpponentSwitch = BlueSwitch;
		} else {
			OpponentSwitch = RedSwitch;
		}
		return OpponentSwitch;
	}

	public Vault getMyVault(Robot myRobot) {
		Vault myVault;
		if (myRobot.getMyAlliance().getAllianceColor().equals("red")) {
			myVault = RedVault;
		} else {
			myVault = BlueVault;
		}

		return myVault;
	}

}
