package Lab4.src;

/* 
Ask the user to input several positive and negative integers.
Sum the digits in any positive integer.
*/

import java.util.*;
import java.io.*;

public class SumDigits {
    public static void main(String[] args) throws FileNotFoundException {
        try (// declare variables
                Scanner scan = new Scanner(System.in)) {
            int userChoice = -1;

            while (userChoice != 1 && userChoice != 2) { // data validation
                System.out.println(
                        "Enter '1' to enter in integers manually, or enter '2' to read integers from a file: ");
                userChoice = scan.nextInt();
                if (userChoice != 1 && userChoice != 2) {
                    System.out.println("Invalid Input");
                }
            }
            if (userChoice == 1) { // user wishes to enter integers manually
                int input = 0;
                while (input < 1) { // ask user how many numbers
                    System.out.println("How many numbers in input?: ");
                    input = scan.nextInt();

                    if (input < 1) { // validate user input
                        System.out.println("Invalid input. Try again!");
                    }

                    for (int i = 0; i < input; i++) { // loop for pairs of integers to sum
                        int number = -1;
                        while (number <= 0) {
                            System.out.println("Enter a number: ");
                            number = scan.nextInt();

                            if (number <= 0) { // state when number is not positive
                                System.out.println(number + " is a negative integer or is zero.");
                                i++; // increment loop after each fail
                            }
                        }
                        sumOfDigits(number); // use method to add digits of a number
                    }
                }
            } else { // userChoice == 2 and user wishes to read integers in from a file
                System.out.println("Enter the name/path to the file you wish to read from: ");
                String fileName = scan.next();
                File file = new File(fileName);
                Scanner fileIterator = new Scanner(file);

                while (fileIterator.hasNextLine()) { // assumes file is delimited by newline characters, reads each line
                                                     // as
                                                     // a new integer
                    int fileNum = Integer.parseInt(fileIterator.nextLine()); // read number from line in file
                    System.out.println("Read " + fileNum + " from file.");
                    if (fileNum <= 0) { // state when number is not positive
                        System.out.println(fileNum + " is a negative integer or is zero.");
                    } else { // read in a positive integer
                        sumOfDigits(fileNum);
                    }
                }

                fileIterator.close(); // close file when done
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void sumOfDigits(int number) { // sums digits of number and prints sum total
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("The sum of digits is " + sum + ".");
    }
}
