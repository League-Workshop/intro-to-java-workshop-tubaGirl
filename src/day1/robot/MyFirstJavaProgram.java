package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot myRobot = new Robot();
		myRobot.sparkle();
		myRobot.setPenColor(Color.CYAN);
		myRobot.penDown();
		myRobot.setSpeed(10);
		for(int i = 0;i<900;i++)
		{
			myRobot.move(9);
			myRobot.turn(1);
		
		}
	}
}
