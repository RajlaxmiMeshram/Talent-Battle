/*Write a program to Replace all 0's with 1 in a given integer*/

package talentBattle;

import java.util.Scanner;

public class Day23 {
	
	public static int numbers(int  n)
	{
		int remainder = 0;
		int m = 0;
		int place=1;
		while(n>0)
		{
			remainder = n%10;
			if(remainder == 0)
			{
				remainder=1;
			}
			m += remainder * place;
			place *=10;
			n /=10;
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(numbers(n));
		

	}

}
