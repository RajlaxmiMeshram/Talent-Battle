/*
Day 7 coding Statement:  Write a program to find Number of days in a given month of a given year
Description
Get the number of month and year as input from the user and check the number of days present in that month.*/

package talentBattle;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month:");
		int month= sc.nextInt();
		System.out.println("enter year:");
		int year = sc.nextInt();
		
		if(month == 2)
		{
		 if(year % 4 == 0)
		 {
			 if(year% 100 == 0)
			 {
				 if(year % 400 ==0) {
					 System.out.println("29");
				 }else 
				 {
					 System.out.println("28");
				 }
			 }else 
			 {
				 System.out.println("29"); 
			 }
		 }else 
		 {
			 System.out.println("28");
		 }
		}else if(month == 1|| month == 3 || month == 5 || month == 7 || month==8|| month==10||month == 12)
		{
			System.out.println("31");
		}else if(month == 4 || month == 6 || month == 9 ||month ==11)
		{
			System.out.println("30");
		}
	}

}
