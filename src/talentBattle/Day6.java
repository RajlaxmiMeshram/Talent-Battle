package talentBattle;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	if(x>0&&y>0)
	{
		System.out.println("This point lies in first quadrant.");
	}else if(y>0&&x<0)
	{
		System.out.println("This point lies in second quadrant.");
	}else if(y<0&&x<0)
	{
		System.out.println("This point lies in third quadrant.");
	}else if(x>0&&y<0)
	{
		System.out.println("This point lies in fourth quadrant.");
	}

	}

}
