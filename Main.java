import java.util.*;

public class Main {
  // Chapter1
  // Displays value-returning methods
  public class Sum {
    public static void main(String[] args) {
      int number1, number2;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number one: ");
      number1 = input.nextInt();
      System.out.println("Enter number two: "); // optional line, could condense
      number2 = input.nextInt();

      System.out.println("Sum of " + number1 + " and " + number2 + " is: "
          + integerSum(number1, number2));
    }

    public static int integerSum(int num1, int num2) {
      int sum = num1 + num2;
      return sum;
    }
  }

  public class Stars {
    public static void main(String[] args) {
      int row;

      // User input
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of rows: ");
      row = scan.nextInt();

      displayRows(row);

      System.out.println("The value of row in Main method is: " + row);

    }

    public static void displayRows(int row) {
      row = row - 1;
      for (int i = 0; i < row; i++) {
        for (int j = 0; j <= 1; j++) {
          System.out.println("*");
        }
        System.out.println(" ");
      }
      System.out.println("The value of row in displayRows method is: " + row);
    }
  }

}
