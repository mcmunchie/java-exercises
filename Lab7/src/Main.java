package Lab7.src;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int userChoice = -1;
            while (userChoice != 1 && userChoice != 2 && userChoice != 3) { // validate user answer
                System.out.println(
                        "Enter '1' to check for palindrome, Enter '2' to change the base of a number, or Enter '3' to use Ackermann's function: ");
                userChoice = sc.nextInt();
                if (userChoice != 1 && userChoice != 2 && userChoice != 3) {
                    System.out.println("Invalid input.  Please try again.");
                }
            }

            if (userChoice == 1) { // check for palindrome option
                System.out.println("Enter a string to check to see if it is a palindrome: ");
                String userInput = sc.next();
                boolean check = Palindrome.isPalindrome(false, userInput);
                if (check) {
                    System.out.println(userInput + " is a palindrome.");
                } else {
                    System.out.println(userInput + " is NOT a palindrome.");
                }
            }

            if (userChoice == 2) { // change base option
                System.out.println("Enter a number to convert to base 2, base 4, and base 8: ");
                int userInput = sc.nextInt();
                System.out.println(userInput + " in base 2 is " + ChangeBase.toBaseTwo(userInput));
                System.out.println(userInput + " in base 4 is " + ChangeBase.toBaseFour(userInput));
                System.out.println(userInput + " in base 8 is " + ChangeBase.toBaseEight(userInput));
            }

            if (userChoice == 3) { // Ackermann's function option
                System.out.println("Enter a number for m for Ackermann's function: ");
                int m = sc.nextInt();
                System.out.println("Enter a number for n for Ackermann's function: ");
                int n = sc.nextInt();
                System.out.println("The result of " + m + " for m and " + n + " for n is " + Ackermann.ackermann(m, n));
            }
        }
    }
}
