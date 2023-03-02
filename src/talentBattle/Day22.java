/* Write a program to express a number as sum of two prime number*/

package talentBattle;

import java.util.Scanner;

public class Day22 {
	
	public static void Prime(int n) {
		boolean f = false;
		for(int i=2;i <=n/2;i++)
		{
			if(isPrime(i))
			{
				if(isPrime(n-i))
				{
					
						System.out.print(n);
						System.out.print(" can be expressed as sum of ");
						System.out.print(i);
						System.out.print(" and ");
						System.out.print(n-i);
						f = true;
					
				}
			}
		}
		if(!f)
		{
			System.out.println(" not a sum of two prime no");
		}
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i =2;i<=Math.sqrt(n);++i)
		{
			if(n%i ==0 )
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Prime(n);
	}

}
