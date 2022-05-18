package Lab3.src;

import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      int userInput = -1;
      while (userInput != 1 && userInput != 2 && userInput != 3) { // see which lab prompt user wants to test
        System.out.println(
            "Enter '1' to user check if a number is a multiple of another, Enter '2' to print the number that corresponds to a letter on a flip phone, or Enter '3' to calculate a Student's total score: ");
        userInput = sc.nextInt();
        if (userInput != 1 && userInput != 2 && userInput != 3) { // data validation for userInput
          System.out.println("Invalid Input. Try Again.");
        }
      }
      if (userInput == 1) { // numberOfPairs call
        int numPairs = 0;
        while (numPairs < 1) { // asks how many pairs user wants to compare
          System.out.println("How many pairs would you like to enter? ");
          numPairs = sc.nextInt();
          if (numPairs < 1) { // data validation for numPairs
            System.out.println("Invalid Input. Try Again.");
          }
        }
        for (int i = 0; i < numPairs; i++) { // loops for numPairs
          int num1 = -1;
          int num2 = -1;
          while (num1 <= 0 || num2 <= 0) { // prompt user for pairs
            System.out.println("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            num2 = sc.nextInt();

            if (num1 <= 0 || num2 <= 0) { // data validation for entered pair
              System.out.println("Invalid Input. Try Again");
              i--; // decrement loop because it was a failed attempt
            }
          }
          numberOfPair(num1, num2);
        }
      }

      if (userInput == 2) { // number from telephone
        char letter = 'x'; // temp to enter while loop
        int result = -1;
        while (!Character.isUpperCase(letter)) {
          System.out.println("Enter which letter you would like the corresponding number for: ");
          String input = sc.next();
          letter = input.charAt(0);
          result = telephoneDigit(letter);
          if (!Character.isUpperCase(letter)) {
            System.out.println("Input must be an uppercase letter!  Try Again. \n");
          }
        }

        if (result == -1) { // q or z
          System.out.println("There is no number that corresponds to " + letter + " on a telephone.");
        } else { // any other letter
          System.out.println("The number that corresponds to " + letter + " on a telephone is " + result + ".");
        }
      }

      if (userInput == 3) { // calculate student score
        int test1, test2, finalScore, assignments;
        System.out.println("Enter the score for the first test: ");
        test1 = sc.nextInt();
        System.out.println("Enter the score for the second test: ");
        test2 = sc.nextInt();
        System.out.println("Enter the score for the final: ");
        finalScore = sc.nextInt();
        System.out.println("Enter the score for the assignments: ");
        assignments = sc.nextInt();
        calculateScore(test1, test2, finalScore, assignments);
      }
    }
  }

  private static void numberOfPair(int num1, int num2) { // checks to see if num1 is a multiple of num2, prints to
                                                         // console
    if (num1 % num2 != 0) {
      System.out.println(num1 + " is NOT a multiple of " + num2 + "\n");
    } else {
      System.out.println(num1 + " is a multiple of " + num2 + "\n");
    }
  }

  private static int telephoneDigit(char letter) { // returns digit that corresponds to a letter on a telephone, or -1
                                                   // if the letter was Q or Z
    int result = -1;
    switch (letter) {
      case 'A':
        result = 2;
        break;
      case 'B':
        result = 2;
        break;
      case 'C':
        result = 2;
        break;
      case 'D':
        result = 3;
        break;
      case 'E':
        result = 3;
        break;
      case 'F':
        result = 3;
        break;
      case 'G':
        result = 4;
        break;
      case 'H':
        result = 4;
        break;
      case 'I':
        result = 4;
        break;
      case 'J':
        result = 5;
        break;
      case 'K':
        result = 5;
        break;
      case 'L':
        result = 5;
        break;
      case 'M':
        result = 6;
        break;
      case 'N':
        result = 6;
        break;
      case 'O':
        result = 6;
        break;
      case 'P':
        result = 7;
        break;
      case 'R':
        result = 7;
        break;
      case 'S':
        result = 7;
        break;
      case 'T':
        result = 8;
        break;
      case 'U':
        result = 8;
        break;
      case 'V':
        result = 8;
        break;
      case 'W':
        result = 9;
        break;
      case 'X':
        result = 9;
        break;
      case 'Y':
        result = 9;
        break;
    }
    return result;
  }

  private static void calculateScore(int test1, int test2, int finalScore, int assignments) { // calculates and prints a
                                                                                              // students score in a
                                                                                              // class given parameters
    double totalScore = (0.15 * test1) + (0.15 * test2) + (0.4 * finalScore) + (0.3 * assignments); // find total
                                                                                                    // decimal
                                                                                                    // percentage score
    char letterGrade = 'F';
    if (totalScore >= 90) {
      letterGrade = 'A';
    } else if (totalScore >= 80) {
      letterGrade = 'B';
    } else if (totalScore >= 70) {
      letterGrade = 'C';
    } else if (totalScore >= 60) {
      letterGrade = 'D';
    }

    System.out.println("\n");
    System.out.printf("Final Score: %.2f", totalScore);
    System.out.println("\n");
    System.out.println("Letter Grade: " + letterGrade);
  }
}
