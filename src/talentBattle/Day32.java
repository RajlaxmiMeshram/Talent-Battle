/*Day 32 coding Statement : Write a Program to Remove vowels from a string
Description
Get a string as the input from the user and then remove all the vowel letters from the string and give the output.
*/

package talentBattle;

import java.util.Scanner;

public class Day32 {
	
	public static  String Vowels(String str)
	{
		String str2="";
		str2= str.replaceAll("[aeiou]", "");
		return str2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
System.out.println(Vowels(str));
	}

}
