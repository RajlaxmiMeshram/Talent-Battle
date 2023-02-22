/*Day 15 coding Statement : Write a program to identify if the number is Strong number or not
Description
Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.
E.g. let the number be 145
Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.*/

package talentBattle;
/*Day 16 coding Statement : Write a program to identify if the number is Perfect number or not
Description
Get the input from the user and check whether that number is a perfect number or not.*/
import java.util.Scanner;


public class Day15 {
    
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isStrongNumber(num)) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }    
    }
}

