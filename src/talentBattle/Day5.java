/*Day 5 coding Statement:  Write a program to identify if the number is even or odd
Description
Get a number as input from the user and check whether the given number is odd or even*/

package talentBattle;

import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int c = sc.nextInt();
		if(c%2==0)
		{
			System.out.println("Even");
		}else
		{
			System.out.println("Odd");
		}
	}

}
