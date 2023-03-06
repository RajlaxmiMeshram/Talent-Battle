/*Day 28 coding Statement : Write a Program to reverse a string.
Description
Get an input string from user and print it in reverse order.*/
package talentBattle;

import java.util.Scanner;

public class Day28 {
	public static void ReverseString(String string)
	{
		StringBuilder revstr = new StringBuilder(string);
		revstr.reverse();
		System.out.println(revstr);
	}

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
String string = sc.nextLine();

ReverseString(string);
	}

}
