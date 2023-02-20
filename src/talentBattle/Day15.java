/*Day 15 coding Statement : Write a program to identify if the number is Strong number or not
Description
Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.
E.g. let the number be 145
Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.*/

package talentBattle;

import java.util.Scanner;

public class Day15 {

   public static int numfact(int a)
   {
	   if(a==0)
	   {
		   return 1;
	   }else
	   {
		   return a * numfact(a-1);
	   }
   }
   public static boolean strongnum(int n)
   {
	   int sum=0;
	   int temp = n;
	   while(temp>0)
	   {
		   int digit = temp % 10;
		   sum = sum+ numfact(digit);
	   }
	   return sum == n;
   }
   
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   if (strongnum(n)) {
           System.out.println(n+ " is a strong number");
       } else {
           System.out.println(n + " is not a strong number");
       }
   }
}

