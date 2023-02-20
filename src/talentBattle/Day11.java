/*Day 11 coding Statement:  Write a program to find Fibonacci series up to n
Description
Fibonacci series is a special series where nth term is the sum of previous two terms in the series. The series starts with 0 and 1 as the first and second term of the series respectively.
Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.*/
package talentBattle;

import java.util.Scanner;

public class Day11 {
//public static int fib(int n)
//{
//	if(n==0||n==1)
//	{
//		return n;
//		
//	}
//	return fib(n-1)+fib(n-2);
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
	
		
		
		System.out.print(n1+","+n2);
		for(int i=2;i<a;++i)
		{
			int n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
			
			
		}
		
}
}
 