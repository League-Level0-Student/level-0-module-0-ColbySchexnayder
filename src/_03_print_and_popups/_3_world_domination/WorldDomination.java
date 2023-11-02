package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog("Do you know how to code?");
		input = input.toLowerCase();
		// 2. If they say "yes", tell them they will rule the world.
		if (input.contains("y")) {
			JOptionPane.showMessageDialog(null, "You will rule the world!");
		}else {
			JOptionPane.showMessageDialog(null, "Sign up for classes");
		}
		// 3. Otherwise, tell them to sign up for classes at The League.
		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world!");
		}else {
			JOptionPane.showMessageDialog(null, "Sign up for classes");
		}
	}
}

