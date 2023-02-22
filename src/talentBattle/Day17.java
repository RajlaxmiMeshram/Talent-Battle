/*Day 17 coding Statement : Write a program to find the Factors of a number
Description
Get an input from the user and find the factors of the number.*/

package talentBattle;

import java.util.Scanner;

public class Day17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i  =1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
