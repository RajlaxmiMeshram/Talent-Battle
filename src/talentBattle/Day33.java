/*Day 33 coding Statement : Write a Program to check if String is a palindrome or not
Description
Get an input string from the user and then check whether it is a palindrome string or not.*/

package talentBattle;
import java.util.Scanner;

public class Day33 {
	
	public static boolean PalindromeCheck(String s){
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString();
		if(s.equals(rev))
		{
		return true;
		}else{  
	        return false;  
	    }  
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(PalindromeCheck(s)== true)
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		

	}

}
