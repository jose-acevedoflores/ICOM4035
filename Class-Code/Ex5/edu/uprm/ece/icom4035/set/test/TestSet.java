package edu.uprm.ece.icom4035.set.test;

import java.util.Scanner;

import edu.uprm.ece.icom4035.set.Set;
import edu.uprm.ece.icom4035.set.StaticImpSet;

public class TestSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> courseNames = new StaticImpSet<String>(7);
		Scanner in = new Scanner(System.in);
		boolean done = false;
		String input = null;
		while (!done){
			System.out.println("Enter the next class: ");
			input = in.nextLine();
			if (input.equalsIgnoreCase("Done")){
				done = true;
			}
			else {
				courseNames.add(input);
				if (courseNames.size() == 7){
					done = true;
				}
			}
		}
		System.out.println("Courses: ");
		for (String s: courseNames){
			System.out.println(s);
		}
	}

}
