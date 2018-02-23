
public class Match {
	Field myField;
	Alliance RedAlliance;
	Alliance BlueAlliance;
	Score RedScore;
	Score BlueScore;
  
    
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
