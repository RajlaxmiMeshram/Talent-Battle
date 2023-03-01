/*Day 21 coding Statement : Write a program to identify if the number is Palindrome or not
Description
Get a number as input from the user and check whether that number is a Palindrome or not.*/

package talentBattle;

import java.util.Scanner;

public class Day21 {
public static void checknumber(int n)
{ int temp = n;
	int sum = 0;
	while(n>0)
	{
		int r= n%10;
		sum =(sum*10)+r;
		n=n/10;
	}
	if (sum == temp)
	{
		System.out.println("palindrome number ");    
	} else    
		   System.out.println("not palindrome");    
}
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
checknumber(n);


	}

}
