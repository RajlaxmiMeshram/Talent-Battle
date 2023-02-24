/*Day 18 coding Statement : Write a program to Add two fractions
Description
Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format
x3/y3 = (x1/y1) + (x2/y2)
here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2) */


package talentBattle;

import java.util.Scanner;

public class Day18 {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		 
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		
		int x3 = ((x1*y2) + (x2*y1));
		int y3 = (y1*y2);
		int n ;
		
		if(x3>y3)
		{
			n = y3;
		}else
		{
			n=x3;
		}
		for(int i = n;i>0;i--)
		{
			if(x3%i==0 && y3%i==0)
			{
				x3 = x3/i;
				y3 = y3/i;
				
			}
			
		}
		System.out.println(x3+ "/" +y3);			

	}

}
