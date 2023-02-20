
/*Day 14 coding Statement : Write a program to reverse a given number
Description
Get an input from the user and the print the reverse of the given number as the output*/
package talentBattle;

import java.util.Scanner;

public class Day14 {

	public static void reverse(int n)
	{
		if(n<10)
		{
			System.out.println(n);
		}else
		{
			System.out.print(n%10);
			reverse(n/10);
		}
	}
	public static void main(String args[])  
	{  
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		reverse(n);
	}
	}
