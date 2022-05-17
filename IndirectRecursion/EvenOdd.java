package IndirectRecursion;

public class EvenOdd { // can't handle negative integers
    public static void main(String[] args) {
        EvenOdd number = new EvenOdd();

        int num1 = 11;
        number.isEven(num1);
        number.isPositive(num1);
        
        int num2 = 22;
        number.isEven(num2);
        number.isPositive(num2);
    }

    public boolean isPositive(int n) {
        if (n >= 0) {
            System.out.println("Positive");
            return true;
        } else
            return isNegative(n - 1);
    }

    public boolean isNegative(int n) {
        if (n < 0) {
            System.out.println("Negative");
            return true;
        } else
            return isPositive(n - 1);
    }

    public boolean isOdd(int n) {
        if (n == 0) {
            System.out.print("Odd ");
            return false;
        } else
            return isEven(n - 1);
    }

    public boolean isEven(int n) {
        if (n == 0) {
            System.out.print("Even ");
            return true;
        } else
            return isOdd(n - 1);
    }
}
