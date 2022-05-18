package Lab2.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(
                    "Enter '1' to calculate a perimeter, Enter '2' to calculate the price of a pizza, or Enter '3' to do division: ");
            int userInput = sc.nextInt();

            if (userInput == 1) { // Perimeter of a rectangular field, assumes yards as a unit
                System.out.println("Enter the width: ");
                int width = sc.nextInt();
                System.out.println("Enter the length: ");
                int length = sc.nextInt();
                System.out
                        .println("The perimeter of the rectangular field with width " + width + " and length " + length
                                + " is: " + 2 * (length + width));
                System.out
                        .println("The area of the rectangular field with width " + width + " and length " + length
                                + " is: " + length * width);
            } else if (userInput == 2) { // Calculate the price of a pizza per square inch
                System.out.println("Enter the diameter of the pizza: ");
                int diameter = sc.nextInt();
                System.out.println("Enter the price of the pizza: ");
                double price = sc.nextDouble();
                final double pi = 3.14159265;
                double size = pi * (diameter * diameter) / 2;
                double pricePerInch = price / size;
                System.out.println(
                        "The size of the pizza with a diamter of " + diameter + " inches is " + size
                                + " square inches.");
                System.out.println("The price per square inch for the same pizza is $" + pricePerInch);
            } else if (userInput == 3) { // Do division with numbers given
                System.out.println("Enter the Dividend: ");
                double dividend = sc.nextDouble();
                System.out.println("Enter the Divisor: ");
                double divisor = sc.nextDouble();
                System.out.println("The resulting quotient with integer division is: " + dividend / divisor);
                System.out.println("The resulting quotient with modular division is: " + dividend % divisor);
            } else {
                System.out.println("Invalid Number, try running again.");
            }
        }
    }
}
