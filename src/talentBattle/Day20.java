
/*Day 20 coding Statement : Write a program to identify if the number is Prime number or not
Description
Get a number as input from the user and check whether that number is prime or not.
A prime number is a number with factors as 1 and that number itself.*/

package talentBattle;

import java.util.Scanner;

public class Day20{
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
   

    if (isPrime(num)) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }
  }
  
  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    
    return isPrime(num, 2);
  }
  
  private static boolean isPrime(int num, int div) {
    if (div > num / 2) {
      return true;
    }
    
    if (num % div == 0) {
      return false;
    }
    
    return isPrime(num, div + 1);
  }
  
}

	
