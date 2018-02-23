
public class Match {
  Field myField = new Field(new Scale(), new Vault("red"), new Vault("blue"), new Switch("red"),
			new Switch("blue"));
  Alliance BlueAlliance = new Alliance("blue", new Robot(), new Robot(), new Robot());
  Alliance RedAlliance = new Alliance("red", new Robot(), new Robot(), new Robot());
  Score RedScore = new Score("red");
	Score BlueScore = new Score("blue");
    Match(Field field1, Alliance redAlliance, Alliance blueAlliance, Score redScore, Score blueScore){
    	this.myField = field1;
    	this.RedAlliance = redAlliance;
    	this.BlueAlliance = blueAlliance;
    	this.RedScore = redScore;
    	this.BlueScore = blueScore;
    }
    
    public Field getField() {
    	return this.myField;
    }
    
    public Alliance getRedAlliance() {
    	return this.RedAlliance;
    }
    
    public Alliance getBlueAlliance() {
    	return this.BlueAlliance;
    }
    
    public Score getRedScore() {
    	return this.RedScore;
    }
    
    public Score getBlueScore() {
    	return this.BlueScore;
    }
    
    
}
