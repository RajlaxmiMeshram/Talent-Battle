/* 
 Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant.
Description of the program: 
Take an input character from the user and check whether the given input is a vowel or consonant.
 */

package talentBattle;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		int c1 = (int)c;
		//System.out.println(c1);
			if(c1>=65&& c1<=90 || c1>=97&&c1<=122)
			{
			if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'||c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U')
			{
				System.out.println("vowel");
			}else
			{
				System.out.println("consonent");

			}
			}else {
                System.out.println("Invalid input");
				
	}

}
}
