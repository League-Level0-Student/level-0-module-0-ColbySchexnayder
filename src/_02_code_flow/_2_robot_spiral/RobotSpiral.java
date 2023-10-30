package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {

		// Create a new Robot
		Robot robot = new Robot();
		// Set your robot's pen down
		robot.penDown();
		// SPEED. Set the robot to go at max speed (100)
		robot.setSpeed(100);
		// LOOP. Use a for loop to repeat ALL the following lines of code 50 times.
		int count = 0;
		while (count < 50) {
			// Change the robot pen color to random
			robot.setRandomPenColor();

			// DRAW. Move the robot (5*i) pixels
			// "i" is the variable in the for loop
			robot.move(5 * count);
			// TURN. Turn the robot (360/7) degrees to the right
			robot.turn(360 / 7);
			// Change the robot pen width to (i)
			robot.setPenWidth(count);
			count += 1;
		}
		// Check the pattern against the picture in the recipe. If it matches, you are
		// done!

	}
}
