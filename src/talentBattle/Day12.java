/*Day 12 coding Statement:  Write a program to find Sum of digits of a number
Description
Get a number from user and then find the sum of the digits in the given number.
*/
package talentBattle;
import java.util.*;
import java.util.Scanner;

public class Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int sum = 0;
		  
		 for(char c : Integer.toString(n).toCharArray())
		 {
			 int d = Character.getNumericValue(c);
			 sum+=d;
		 }
		 System.out.println(sum);
	}
}
