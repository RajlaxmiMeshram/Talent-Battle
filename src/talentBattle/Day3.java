
/*
 Day 3 coding Statement: Write a program to find ASCII values of a character
Description:
Get an input character from the user and give the ASCII value of the given input as the output.
 */
package talentBattle;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char str = sc.nextLine().charAt(0);		
		int letter = (int)str;
		System.out.println(letter);
	}

}
