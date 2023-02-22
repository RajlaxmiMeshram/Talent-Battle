
/*Day 16 coding Statement : Write a program to identify if the number is Perfect number or not
Description
Get the input from the user and check whether that number is a perfect number or not.*/
package talentBattle;

import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		
		int sum =0;
		for (int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum +=i;
			}
		}
		if(sum==n)
		{
			System.out.println("Perfect number");
		}else
		{
			System.out.println("Not a Perfect number");
		}
		
		

	}

}
