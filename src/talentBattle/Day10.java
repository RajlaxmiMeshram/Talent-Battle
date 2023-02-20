/*Day 10 coding Statement:  Write a program to find Factorial of a number
Description
Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output. */
package talentBattle;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=1,i=1;
		int a = sc.nextInt();
		
		for (i = 1;i<=a;i++)
		{
			sum =sum *i;		 
		}
		 System.out.println(sum);
	}

}
