package Lab7.src;

public class Palindrome {

    public static boolean isPalindrome(boolean isParsed, String toCheck) {

        if (!isParsed) { // removes character whitespace, and any punctuation from the string
            toCheck = toCheck.replaceAll("[^A-Za-z]+", ""); // converts all non letter characters to null space and
                                                            // condenses string
            toCheck.toUpperCase(); // convert string to all uppercase
        }

        if (toCheck.length() == 0 || toCheck.length() == 1) { // if length is 0 or 1, method has recurred enough
            return true;
        }

        if (toCheck.charAt(0) == toCheck.charAt(toCheck.length() - 1)) { // if first and last index are the same
                                                                         // character
            return isPalindrome(isParsed, toCheck.substring(1, toCheck.length() - 1)); // recur with string that has
                                                                                       // first and last index removed
        }

        return false; // only returns if string is not a palindrome
    }
}
