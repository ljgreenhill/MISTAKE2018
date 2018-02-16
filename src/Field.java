
public class Field {
	Scale scale;
	Vault vault;
	Switch RedSwitch;
	Switch BlueSwitch;

	Field (Scale myScale, Vault myVault, Switch RSwitch, Switch BSwitch) {
		this.scale = myScale;
		this.vault = myVault;
		this.BlueSwitch = BSwitch;
		this.RedSwitch = RSwitch;
		
	}
	
	public Scale getScale(){
		return this.scale;
	}
	
	public Vault getVault(){
		return this.vault;
	}
	
	public Switch getRedSwitch(){
		return this.RedSwitch;
	}
	
	public Switch getBlueSwitch() {
		return this.BlueSwitch;
	}
	
	
}
