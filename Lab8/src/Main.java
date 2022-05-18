package Lab8.src;

import java.util.*;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner sc = new Scanner(System.in)) {
            int userChoice = 0;

            // test RandomArray
            /*
             * RandomArray array = new RandomArray();
             * array.fillArray();
             */

            // test NumberCount
            System.out.println("Enter the file path of the file with integers: ");
            String numberInput = sc.nextLine();

            System.out.println("How many integers are in the file? "); // needed because arrays are dumb and can't be
                                                                       // resized and we had to use arrays
            int numInts = sc.nextInt();
            int temp[] = new int[numInts];
            NumberCount testNumbers = new NumberCount(numberInput, temp);

            System.out.println("Unsorted Array: ");
            testNumbers.printArray();
            System.out.println();
            System.out.println("Sorted Array: ");
            testNumbers.sortArray();
            System.out.println();
            testNumbers.printArray();
            System.out.println();
            testNumbers.tabulateResults();
        }
    }
}
