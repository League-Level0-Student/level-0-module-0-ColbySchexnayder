package _02_code_flow._1_robot_square;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

// This recipe draws a square using the Robot

public class RobotSquare {

	public static void main(String[] args) {

		// This code makes a new Robot
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);
		int num = 0;
		// Put the robot's pen down so it can draw
		// Use the rob.penDown(); command. 

		// SPEED. Make the robot move quickly.
		// Use the rob.setSpeed(); command.
		while (num < 4) {
			rob.move(200);
			// DRAW. Draw a line
			// Use the rob.move(); command
			rob.turn(90);

			// TURN. Turn 90 degrees
			// Use the rob.turn(); command
			num = num + 1;
			// num += 1;
			// num++;
		}

		// LOOP. Now put the DRAW and TURN code into a for loop to repeat 4 times.
		// Did your Robot draw a square?

	}
}
