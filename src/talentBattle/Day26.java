
/*Day 26 coding Statement : Write a program to calculate Maximum number of handshakes
Description
Get the number of people in the room as input from the user. Then calculate the maximum number of handshakes possible among that people.
For e.g. If there are N people in the room then the first person has to shake hand with N-1 people and second person has to shake hand with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.
So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0 
*/

package talentBattle;

import java.util.Scanner;

public class Day26 {
	
	public static void People(int n )
	{
		int t =0;
		int a=0;
		for(int i=1;i<=n;i++)
		{
			a=n-i;
			t=a+t;
		}
		System.out.println(t);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		People(n);

	}

}
