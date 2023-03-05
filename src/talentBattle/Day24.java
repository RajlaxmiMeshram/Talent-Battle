/*Day 24 coding Statement : Write a program to print Pyramid pattern using stars
Description
Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.*/

package talentBattle;

import java.util.Scanner;

public class Day24 {
	
	public static void Pattern(int n)
	{
		int k = 1;
		for(int i=0;i<n;i++)		
	{
			for(int j=0;j<k;j++)
			{
				
				System.out.print("*");
				
			}
			k=k+2;
			  System.out.println();
			
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input =  sc.nextInt();
		Pattern(input);

	}

}
