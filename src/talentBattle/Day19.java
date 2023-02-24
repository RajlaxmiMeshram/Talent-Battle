
/*Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not
Description
Get an input number from user and check whether the given number is an Armstrong number or not.
E.g. Let the number be 1634,
Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634
Therefore, this is an Armstrong number
*/
package talentBattle;
import java.lang.Math;
import java.util.Scanner;

public class Day19 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int d=0;
		
		double result = 0;
		double rem = 0;
		
		for(num = n;num !=0;++d)
		{
			num/=10;
		}
		for(num = n; num!= 0; num /=10)
		{
			rem = num%10;
		
		result += Math.pow(rem,d);
	}
	if((int)result == n)
	{
		System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("Not a Armstrong number");
	}
}

}
