package talentBattle;

import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<0)
		{
		 System.out.println("Negatine no");
		}else if(a==0)
		{
			System.out.println("Nither positive nor negative");
		}else
		{
			System.out.println("Positive no");
		}

	}

}
