/*Day 13 coding Statement:  Write a program to find Sum of N natural numbers
Description
Get the input from the user for the value of n and then find the sum of first n natural numbers.*/
package talentBattle;

import java.util.Scanner;

public class Day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		for (int i =1;i<=a;i++)
		{
			 sum+=i;
			
		}
		System.out.println(sum);
	}

}
