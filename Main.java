import java.util.*;
import java.io.*;

public class Main {
  // ================================Chapter1============================================== //

  /*
   * A program to display the message "Hello World!" on standard output screen
   */
  // public class HelloWorld {
  // public static void main(String[] args) {
  // System.out.println("Hello World!");
  // System.out.println("");
  // System.out.println("How are you today?");
  // }
  // }

  // ================================Chapter2============================================== //

  /*
   * Practice with postfix and prefix expressions and factorials
   */
  // public class PostfixPrefixExpressions {
  // public static void main(String[] args) {
  // // Postfix and prefix increments and decrements.
  // int number = 1;
  // System.out.println("Postfix: " + number++); // postfix increment, return 1
  // System.out.println("Prefix: " + ++number); // prefix increment, return 3

  // int number = 5;
  // System.out.println("Postfix: " + number--); // postfix increment, return 5
  // System.out.println("Prefix: " + --number); // prefix increment, return 3

  // int number = 1;
  // int sum = 0;
  // sum = number++ + --number; // sum = 1 + 1 = 2 (postfix/prefix)
  // System.out.println("Sum: " + sum); // returns 2

  // // Calculates and displays the factorial of a number.
  // int number;
  // int factorial = 1;
  // Scanner input = new Scanner(System.in);
  // System.out.println("Enter a number: ");
  // number = input.nextInt();
  // while (number > 1){
  // factorial *= number--;
  // }
  // System.out.println("The factorial is " + factorial);
  // }
  // }

  /*
   * Practice using decision structures
   */
  // public class DecisionStructures {
  // public static void main(String args[]) {
  // // initialize variable to hold sum
  // int sum = 0;
  // // summation of even numbers
  // for (int i = 2; i <= 10; i = i + 2) {
  // sum += i;
  // }
  // // print statement outside loop
  // System.out.print("Summation: " + sum); // returns 30

  // // initialize variable to hold sum
  // int sum = 0;
  // // use of decision structures
  // for (int i = 1; i <= 10; i++) {
  // // Find the sum of all even numbers
  // if (i % 2 == 0)
  // sum += i;
  // }
  // // Print statement outside loop
  // System.out.print("Summation: " + sum);
  // for (

  // int i = 0; i < 6; i++) {
  // System.out.println("*");
  // }

  // // Nested for loop (i.e. matrix of rows x columns).
  // for (int i = 0; i < 6; i++) {
  // for (int j = 0; j < 6; j++) {
  // if (i == j)
  // System.out.print("*");
  // else
  // System.out.print(" ");
  // }
  // System.out.println("");
  // }
  // }
  // }

  /*
   * Practice using final variables
   */
  // public class Dice {
  // public static void main(String[] args) {
  // final int MAX = 100;
  // final int MIN = 1;
  // int number;
  // Random rand = new Random();

  // // Randomly selects number within a range
  // number = rand.nextInt((MAX - MIN) + 1) + MIN;
  // System.out.print("Your throw of dice is: " + number);
  // }
  // }

  /*
   * Practice type casting and doing math in Java
   */
  // public class Math {
  // public static void main(String[] args) {
  // int a = 3;
  // int b = 2;
  // double c = 1.5;
  // double d;

  // d = (double) a / b;

  // // Assign int to a double.
  // int i = 2;
  // double m = i;
  // System.out.println("Integer to double: " + m); // returns 2.0
  // System.out.println("Answer: " + d); // returns 1.5
  // }
  // }

  /*
   * Practice using random Java library
   */
  // public class RandomNumbers {
  // public static void main(String[] args) {
  // int integer;
  // Random rand = new Random();
  // integer = rand.nextInt();
  // System.out.println(integer);
  // }
  // }

  /*
   * Walks user through the process of purchasing gum from a convenience store
   */
  // public class Gum {
  // public static void main(String[] args) {
  // String customerName; // to hold customer's name
  // int gumNumber; // to hold the number of gum
  // double gumPrice; // to hold the price of gum
  // // final keyword = constant
  // final double SALES_TAX_RATE = 0.0625; // to hold sales tax rate
  // double totalPay; // to hold the total amount of payment

  // try ( // create a Scanner object to read input
  // Scanner input = new Scanner(System.in)) {
  // // get customer's name
  // System.out.println("Your name: ");
  // customerName = input.nextLine();

  // // get the number of gums
  // System.out.println("The number of gums: ");
  // gumNumber = input.nextInt();

  // // get the price of gum
  // System.out.println("The price of gum: ");
  // gumPrice = input.nextDouble();
  // }

  // // calculate the total pay for customer
  // totalPay = (gumNumber * gumPrice) * (1 + SALES_TAX_RATE);

  // // display the total pay for customer
  // System.out.println("Hello " + customerName);
  // System.out.println("Your total payment is $" + totalPay);
  // }
  // }

  /*
   * This is a simple Java program that adds two integers together
   */
  // public class Simple {
  // public static void main(String[] args) {
  // try (Scanner input = new Scanner(System.in)) {
  // // Declare variables
  // int firstInteger;
  // int secondInteger;
  // int sum;

  // System.out.println("Enter the first integer: ");
  // firstInteger = input.nextInt();
  // System.out.println("Enter the second integer: ");
  // secondInteger = input.nextInt();

  // // Process
  // sum = firstInteger + secondInteger;

  // // Print
  // System.out.println("The summation of " + firstInteger + " and "
  // + secondInteger + " is " + sum);
  // }
  // }
  // }

  // ================================Chapter3============================================== //

  /*
   * Practice using switch statements
   */
  // public class GasStation {
  // public static void main(String[] args) {
  // // variables
  // double dieselPrice = 3.683;
  // double regularPrice = 3.342;
  // double midPrice = 3.698;
  // double premiumPrice = 3.973;
  // boolean isDiesel = false;
  // double amountGallons = 0.0;
  // double finalPayment = 0.0;
  // int gasGrade = 87;
  // int type;

  // try (Scanner input = new Scanner(System.in)) {
  // // ask customer for gas choice
  // System.out.println("Choose between diesel and gas "
  // + "(1 for diesel and 0 for gasoline): ");
  // type = input.nextInt();

  // if (type == 1)
  // isDiesel = true;

  // if (isDiesel) {
  // System.out.println("Enter the amount of gallons: ");
  // amountGallons = input.nextDouble();

  // finalPayment = amountGallons * dieselPrice;
  // System.out.println("Your total payment is: " + finalPayment);
  // } else {
  // System.out.println("Enter the grade of gasoline: ");
  // gasGrade = input.nextInt();

  // System.out.println("Enter the amount of gallons: ");
  // amountGallons = input.nextDouble();

  // // example switch statements
  // switch (gasGrade) {
  // case 87:
  // finalPayment = amountGallons * regularPrice;
  // System.out.println("Your total payment is: " + finalPayment);
  // break;
  // case 89:
  // finalPayment = amountGallons * midPrice;
  // System.out.println("Your total payment is: " + finalPayment);
  // break;
  // default:
  // finalPayment = amountGallons * premiumPrice;
  // System.out.println("Your total payment is: " + finalPayment);
  // }
  // }
  // }
  // }
  // }

  /*
   * Practice using switch cases, conditional statements and formatting output
   */
  // public class VendingMachine {
  // public static void main(String[] args) {
  // char selection;
  // try (Scanner input = new Scanner(System.in)) {
  // System.out.println("Selection: ");
  // selection = input.next().charAt(0);
  // }

  // switch (selection) {
  // case 'a':
  // System.out.println("Price is $.85");
  // break;
  // case 'b':
  // System.out.println("Price is $1.75");
  // break;
  // case 'c':
  // System.out.println("Price is $2.00");
  // break;
  // case 'd':
  // System.out.println("Price is $2.75");
  // break;
  // case 'e':
  // System.out.println("Price is $3.00");
  // break;
  // default:
  // System.out.println("Price is $3.75");

  // }
  // System.out.println("Please make your payment.");
  // System.out.println();

  // // conditional statement example
  // int a = 8;
  // int b = 2;

  // a = a < b ? a - b : a;
  // System.out.println("The value of a is: " + a);
  // System.out.println();

  // // formatting examples
  // System.out.printf("Hello World\n");
  // int hours = 20;
  // System.out.printf("I worked %d hours.\n", hours);
  // int dogs = 2, cats = 3;
  // System.out.printf("We have %d dogs and %d cats.\n", dogs, cats);
  // double grossEarnings = 874.12;
  // System.out.printf("Your pay is %f.\n", grossEarnings);
  // double grossPay = 12.75;
  // System.out.printf("Jim makes %.2f a year.\n", grossPay);
  // double salary = 5874.127;
  // System.out.printf("Your pay is %,.2f \n", salary);
  // String name = "Ringo";
  // System.out.printf("Your name is %s.\n", name);
  // int number = 9;
  // System.out.printf("The value is %6d\n", number);
  // }
  // }

  /*
   * Practice comparing strings
   */
  // public class Password {
  // public static void main(String[] args) {
  // // Comparing strings/characters
  // if ('A' < 'a')
  // System.out.println("We can compare characters in Java!");

  // // Password validator
  // String userName = "helloWorld";
  // String userPassword = "123_456";
  // try (Scanner input = new Scanner(System.in)) {
  // System.out.println("Please enter your username: ");
  // String user = input.nextLine();

  // System.out.println("Please enter your password: ");
  // String password = input.nextLine();

  // if (user.equals(userName) && password.equals(userPassword)) {
  // System.out.println("You're logged in.");
  // }
  // else {
  // System.out.println("Invalid username or password!");
  // }
  // }
  // }
  // }

  /*
   * Practice using boolean variables and if-else statements
   */
  // public class Weather {
  // public static void main(String[] args) {
  // boolean weather = true;

  // if (weather != true) {
  // System.out.println("It is cold outside.");
  // System.out.println("I'm going to stay in and watch tv.");
  // } else
  // System.out.println("It is not cold.");
  // System.out.println("I will go play outside.");
  // }
  // }

  /*
   * Takes user input and displays final grade
   */
  // public class FinalGrade {
  // public static void main(String[] args) {
  // try (Scanner input = new Scanner(System.in)) {
  // System.out.println("Please enter your score: ");
  // int finalGrade = input.nextInt();

  // if (finalGrade > 90) {
  // System.out.println("You get an A!");
  // } else if (finalGrade >= 80 && finalGrade < 90) {
  // System.out.println("You get a B");
  // } else if (finalGrade >= 70 && finalGrade < 80) {
  // System.out.println("You get a B-");
  // } else if (finalGrade >= 60 && finalGrade < 70) {
  // System.out.println("You get a C");
  // } else
  // System.out.println("You get a D");
  // }
  // }
  // }

  // ================================Chapter4============================================== //

  /*
   * This program reads data from a file.
   * Use friends.txt file for example.
   */
  // public class FileReadDemo {
  // public static void main(String[] args) throws IOException {
  // try ( // Create a Scanner object for keyboard input.
  // Scanner keyboard = new Scanner(System.in)) {
  // // Get the filename.
  // System.out.println("Enter the filename: ");
  // String filename = keyboard.nextLine();

  // // Open the file.
  // File file = new File(filename);
  // Scanner inputFile = new Scanner(file);

  // // Read lines from the file until no more are left.
  // while (inputFile.hasNext()) {
  // // Read the next name.
  // String friendName = inputFile.nextLine();

  // // Display the last name read.
  // System.out.println(friendName);
  // }

  // // Close the file.
  // inputFile.close();
  // }
  // }
  // }

  /*
   * This program writes data to a file.
   * For example, friends.txt (would replace current contents of friends.txt
   * file).
   */
  // public class FileWriteDemo {
  // public static void main(String[] args) throws IOException {
  // String filename; // File name
  // String friendName; // Friend's name
  // int numFriends; // Number of friends

  // try ( // Create a Scanner object for keyboard input.
  // Scanner keyboard = new Scanner(System.in)) {
  // // Get the number of friends.
  // System.out.println("How many friends do you have? ");
  // numFriends = keyboard.nextInt();

  // // Consume the remaining newline character.
  // keyboard.nextLine();

  // // Get the filename.
  // System.out.println("Enter the filename: ");
  // filename = keyboard.nextLine();

  // // Open the file.
  // PrintWriter outputFile = new PrintWriter(filename);

  // // Get data and write it to the file.
  // for (int i = 1; i <= numFriends; i++) {
  // // Get the name of a friend.
  // System.out.println("Enter the name of friend " +
  // "number " + i + ": ");
  // friendName = keyboard.nextLine();

  // // Write the name to the file.
  // outputFile.println(friendName);
  // }

  // // Close the file.
  // outputFile.close();
  // }

  // System.out.println("Data written to the file.");
  // }
  // }

  // ================================Chapter5============================================== //

  /*
   * Displays value-returning methods
   */
  // public class Sum {
  // public static void main(String[] args) {
  // int number1, number2;
  // try (Scanner input = new Scanner(System.in)) {
  // System.out.println("Enter number one: ");
  // number1 = input.nextInt();
  // System.out.println("Enter number two: ");
  // number2 = input.nextInt();
  // }
  // System.out.println("Sum of " + number1 + " and " + number2 + " is: "
  // + integerSum(number1, number2));
  // }

  // public static int integerSum(int num1, int num2) {
  // int sum = num1 + num2;
  // return sum;
  // }
  // }

  /*
   * Displays the values returned by each method (main and displayRows methods)
   */
  // public class Stars {
  // public static void main(String[] args) {
  // int row;

  // try ( // User input
  // Scanner scan = new Scanner(System.in)) {
  // System.out.println("Enter the number of rows: ");
  // row = scan.nextInt();
  // }
  // displayRows(row);

  // System.out.println("The value of row in Main method is: " + row);

  // }

  // public static void displayRows(int row) {
  // row = row - 1;
  // for (int i = 0; i < row; i++) {
  // for (int j = 0; j <= 1; j++) {
  // System.out.println("*");
  // }
  // System.out.println(" ");
  // }
  // System.out.println("The value of row in displayRows method is: " + row);
  // }
  // }

  /*
   * Counts the number of vowels that appears in a word
   */
  // public class CountingVowels {
  // public static void main(String[] args) {
  // String str1 = "LEXICON";
  // String str2 = "Aphrodite";

  // // calling function
  // countingVowels(str1);
  // System.out.println();
  // countingVowels(str2);
  // }

  // public static String countingVowels(String S) {
  // // allocate space for 5 vowels
  // int[] counter = new int[5];

  // /*
  // * iterate through string and count
  // * the frequency of each vowel
  // * and store the frequency
  // * in the corresponding index (i.e. index[0] = 'a', index[1] = 'e' and so on
  // */
  // for (int i = 0; i < S.length(); i++) {
  // char ch = S.charAt(i);
  // if (ch == 'a' || ch == 'A') {
  // counter[0]++;
  // } else if (ch == 'e' || ch == 'E') {
  // counter[1]++;
  // } else if (ch == 'i' || ch == 'I') {
  // counter[2]++;
  // } else if (ch == 'o' || ch == 'O') {
  // counter[3]++;
  // } else if (ch == 'u' || ch == 'U') {
  // counter[4]++;
  // }
  // }

  // // display the number frequency of each vowel
  // System.out.println("a appears " + counter[0] + " time(s) in " + S);
  // System.out.println("e appears " + counter[1] + " time(s) in " + S);
  // System.out.println("i appears " + counter[2] + " time(s) in " + S);
  // System.out.println("o appears " + counter[3] + " time(s) in " + S);
  // System.out.println("u appears " + counter[4] + " time(s) in " + S);

  // return S; // return the string
  // }
  // }

  // ================================Chapter6============================================== //

  // ================================Chapter7============================================== //

  /*
   * Practice using Arrays
   */
  // public class Array {
  // public static void main(String[] args) {
  // // primative data type - store one value
  // int a = 1;
  // // array data structure - store a collection of same data types
  // // format: class object object name = new class object
  // // int[] numbers = new int[10];
  // // System.out.println(numbers[6]);
  // System.out.println("Array contents: ");
  // int[] numbers = { 7, 10, 12, 9, 1 };
  // for (int i = 0; i <= 4; i++) { // prints every array element
  // System.out.println(numbers[i]);
  // }
  // System.out.println("\nArray size: " + numbers.length); // prints length of
  // array
  // }
  // }

  // ================================Chapter15============================================== //

  // ================================Chapter16============================================== //

  /*
   * Implementation of insertion sorting algorithm
   */
  // public class IntInsertionSorter {
  // public static void main(String[] args) {
  // // Create an int array with test values.
  // int[] values = { 9, 7, 12, 10, 8, 11 };

  // // Display the array's contents.
  // System.out.println("Original order: ");
  // for (int element : values)
  // System.out.print(element + " ");

  // // Sort the array.
  // IntInsertionSorter.insertionSort(values);

  // // Display the array's contents.
  // System.out.println("\nSorted order: ");
  // for (int element : values)
  // System.out.print(element + " ");

  // System.out.println();
  // }

  // public static void insertionSort(int[] array) {
  // int unsortedValue; // The first unsorted value
  // int scan; // Used to scan the array

  // for (int index = 1; index < array.length; index++) {
  // unsortedValue = array[index];
  // scan = index;

  // while (scan > 0 && array[scan - 1] > unsortedValue) {
  // array[scan] = array[scan - 1];
  // scan--;
  // }
  // array[scan] = unsortedValue;
  // }
  // }
  // }

  /*
   * Implementation of selection sorting algorithm
   */
  // public class IntSelectionSort {
  // public static void main(String[] args) {
  // // Create an int array with test values.
  // int[] values = { 5, 1, 3, 6, 4, 2 };

  // // Display the array's contents.
  // System.out.println("Original order: ");
  // for (int element : values)
  // System.out.print(element + " ");

  // // Sort the array.
  // IntSelectionSort.selectionSort(values);

  // // Display the array's contents.
  // System.out.println("\nSorted order: ");
  // for (int element : values)
  // System.out.print(element + " ");

  // System.out.println();
  // }

  // public static void selectionSort(int[] array) {
  // for (int last = array.length - 1; last >= 1; last--) {
  // int maxIndex = 0;

  // for (int index = 1; index <= last; index++)
  // if (array[index] > array[maxIndex])
  // maxIndex = index;

  // int temp = array[maxIndex];
  // array[maxIndex] = array[last];
  // array[last] = temp;
  // }
  // }
  // }

  // ================================Chapter19============================================== //

  // ================================Chapter20============================================== //

  /*
   * Practice using the Stack Class
   */
  public class NameStack {
    public static void main(String[] args) {
      Stack<String> friendsList = new Stack<String>();
      String[] names = { "Al", "Bob", "Carol" };

      System.out.println("Pushing the names onto the stack");
      for (int i = 0; i < names.length; i++)
        friendsList.push(names[i]);

      for (int i = 0; i < names.length; i++)
        System.out.println(friendsList.pop());
    }
  }
}
