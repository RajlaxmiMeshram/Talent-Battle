package talentBattle;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String letter = scanner.nextLine();
		int letter1 = (int)letter.length();
		
		if(letter1>=65&&letter1<=90||letter1>=95&&letter1<=122)
		{
			System.out.println("Alphabet");
		}else
		{
			System.out.println("Not an alphabet");
		}

	}

}
