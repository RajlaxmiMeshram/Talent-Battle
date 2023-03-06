/*Day 29 coding Statement : Write a Program to concatenate a string.
Description
Get two strings as input from the user and then concatenate it.*/

package talentBattle;

import java.util.Scanner;

public class Day29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str = sc.nextLine();
		System.out.println("Enter second string");
		String str1 = sc.nextLine();
		System.out.println(str+str1);
	}

}
