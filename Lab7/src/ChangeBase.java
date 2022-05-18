package Lab7.src;

public class ChangeBase {

    public static String toBaseTwo(int runningQuotient) {
        int newQuotient = runningQuotient / 2;
        int remainder = runningQuotient % 2;

        if (newQuotient == 0) { // finished dividing, base case
            return Integer.toString(remainder);
        } else { // quotient != 0
            return toBaseTwo(newQuotient) + Integer.toString(remainder); // concatenate digits together into a string
        }
    }

    public static String toBaseFour(int runningQuotient) {
        int newQuotient = runningQuotient / 4;
        int remainder = runningQuotient % 4;

        if (newQuotient == 0) { // finished dividing, base case
            return Integer.toString(remainder);
        } else { // quotient != 0
            return toBaseFour(newQuotient) + Integer.toString(remainder); // concatenate digits together into a string
        }
    }

    public static String toBaseEight(int runningQuotient) {
        int newQuotient = runningQuotient / 8;
        int remainder = runningQuotient % 8;

        if (newQuotient == 0) { // finished dividing, base case
            return Integer.toString(remainder);
        } else { // quotient != 0
            return toBaseEight(newQuotient) + Integer.toString(remainder); // concatenate digits together into a string
        }
    }
}
