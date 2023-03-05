package talentBattle;

import java.util.Scanner;

public class Day25 {

	public static float areaofcircle(int r)
	{
		float result = (float) ((3.14)* Math.pow(r, 2));
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
System.out.println(areaofcircle(r));
	}

}
