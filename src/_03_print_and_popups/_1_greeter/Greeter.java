package _03_print_and_popups._1_greeter;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What is your name?");
		
		Scanner sc = new Scanner(System.in);
		String greeting = sc.nextLine();
		
		
		System.out.println("Hello World!");
		JOptionPane.showMessageDialog(null, greeting + name + "!");
	}
}
