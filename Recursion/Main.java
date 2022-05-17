package Recursion;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    // uses RecursiveSum class
    int number;
    int numSum = 0;

    RecursiveSum answer = new RecursiveSum();

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number: ");
    number = scan.nextInt();

    numSum = answer.sum(number);

    System.out.println("The sum of numbers between 1 and " + number + " is " + numSum);
    System.out.println();

    // calls EndlessRecursion
    EndlessRecursion.message(5);
  }
}
