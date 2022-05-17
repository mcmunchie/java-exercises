package Recursion;

public class RecursiveSum {
  public int sum(int n) {
    if (n == 1) // base case
      return 1;
    else
      return n + sum(n - 1); // recursive case
  }
}
