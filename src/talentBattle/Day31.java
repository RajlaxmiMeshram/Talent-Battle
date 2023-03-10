
/*Day 31 coding Statement : Write a Program to Toggle each character in a string
Description
Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.
*/


package talentBattle;

import java.util.Scanner;

public class Day31 {
	
	public static String CheckCase(String s)
	{
		String s1 ="";
		for(int i = 0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				s1= s1+Character.toLowerCase(s.charAt(i));
			}else
			{
				s1=s1+Character.toUpperCase(s.charAt(i));
			}
		}
		
		return s1;

	}

	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);
String s = sc.nextLine();
System.out.println(CheckCase(s));
	}

}
