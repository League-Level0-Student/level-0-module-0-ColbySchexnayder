package _02_code_flow._3_pentagon_crazy;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class PentagonCrazy {
	
	private void drawPattern() {
		
		//  Create a new Robot
		Robot rob = new Robot();
		//  Put the robot's pen down
		rob.penDown();
		//  SPEED. Make the robot go at maximum speed (100)
		rob.setSpeed(100); 
		//  COLOR. Set the pen to a color that you like for the shape
		rob.setPenColor(Color.GREEN);
		//  NUMBER OF SIDES. Make an int variable for the number of sides the shape has.
		//  				(Hint: its called PentagonCrazy)
		int sides = 8;
		//  TURN ANGLE. Make another int variable for the angle you want the robot to turn. 
		//  			Hint: Divide 360 by the number of sides the shape has.
		int angle = 360 / sides;
		//  LOOP. Use a for loop to repeat ALL the following lines of code 200 times. 
		int count = 0;
		while (count < 200) {
				//  DRAW.  Make the robot move "i" pixels
				//         "i" is the variable in the for loop
			rob.move(count);
				//  TURN.  Turn the robot the amount in your angle variable + 1
			rob.turn(angle+1);
			count++;
		}
		// Hide the robot so you can see the pattern.
		rob.hide();
		// Check the pattern against the picture in the recipe. If it matches, you are done!
	}

	
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	
	public static void main(String[] args) {
		new PentagonCrazy().drawPattern();
	}
}
