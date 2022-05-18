package Lab4.src;

/* 
Use nested for loops to draw boxes of "*"s with a diagonal of "0"s.
The number of rows and columns are equal and they should be input by the user
(valid range: 5 to 21).
*/

import java.util.*;

public class Drawing {
    public static void main(String[] args) {
        // declare variables
        Scanner scan = new Scanner(System.in);
        int numRows;
        int row, column;
        char input;

        System.out.println("Drawing Program");
        System.out.println("Do you want to start (Y/N)?: "); // get user input
        input = scan.next().charAt(0);

        while (input == 'Y' || input == 'y') { // ask user for number of rows/columns
            System.out.println("How many rows/columns (5-21): ");
            numRows = scan.nextInt();

            while (numRows < 5 || numRows > 21) { // validate user input is within range
                System.out.println("ERROR! OUT OF RANGE (5-21). RENTER: ");
                numRows = scan.nextInt();
            }
            for (row = 1; row <= numRows; row++) { // loop for rows
                for (column = 1; column <= numRows; column++) { // loop for columns
                    if (row == column) { // prints "0" when row equals column
                        System.out.print("0");
                    } else
                        System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Do you want to continue (Y/N)? "); // ask user for more input
            input = scan.next().charAt(0);

        }
    }
}
