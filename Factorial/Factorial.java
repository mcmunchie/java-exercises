package Factorial;

/*
 * Example recursive method using factorials.
 * 5! = 5 x 4! would be fact(5) = 5 x fact(4)
 * 4! = 4 x 3! would be fact(4) = 4 x fact(3)
 * 3! = 3 x 2! would be fact(3) = 3 x fact(2)
 * 2! = 2 x 1! would be fact(2) = 2 x fact(1)
 */

public class Factorial {
  public int fact(int n) {
    if (n == 1) // base case
      return 1;
    else
      return n * fact(n - 1); // recursive case
  }
}
