
public class Main {
	
	final static double GAME_TIME = 135;
	
	
	
	
	public static void main(String[] args) {
		
		Robot RedRobot1 = new Robot();
		Robot RedRobot2 = new Robot();
		Robot RedRobot3 = new Robot();
		
		Robot BlueRobot1 = new Robot();
		Robot BlueRobot2 = new Robot();
		Robot BlueRobot3 = new Robot();
		
		
		FrontEnd myFrontEnd = new FrontEnd(RedRobot1, RedRobot2, RedRobot3, BlueRobot1, BlueRobot2, BlueRobot3);
		
		Blue_Alliance myBlue_Alliance = new Blue_Alliance(BlueRobot1, BlueRobot2, BlueRobot3);
		
		Red_Alliance myRed_Alliance = new Red_Alliance(RedRobot1, RedRobot2, RedRobot3);
		
		
		
		
	}

}
