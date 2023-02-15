package talentBattle;

import java.util.Scanner;

public class Day8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = (b*b)-(4*a*c);
		float root1,root2;
		if(d>0)
		{
			System.out.println("Two Real Roots");
			root1=((-b)+(d*d)/(2*a));
			root2=((-b)-(d*d)/(2*a));
			System.out.println("root 1 = "+root1);
			System.out.println("root 2 = "+root2);
		}else if(d==0)
		{
			System.out.println("Roots Are Equal");
			root1=root2= (-b)/(2*a);
			System.out.println("root 1 = root 2 = "+root1);
		}else
		{
			System.out.println("No Real Roots");
			int r =(-b)/2*a;
			int i = (d*d)/(2*a);
			root1=(r+i);
			root2=(r-i);
			System.out.println("root 1 = "+root1);
			System.out.println("root 2 = "+root2);
		}
	}

}
