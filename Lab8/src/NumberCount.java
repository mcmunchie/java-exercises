package Lab8.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NumberCount {

    public int numbers[]; // array to read numbers from file

    // constructor
    public NumberCount(String fileName, int[] input) throws FileNotFoundException { // takes string fileName and looks
                                                                                    // for file with that name
        File file = new File(fileName);
        try (Scanner sc = new Scanner(file)) {
            numbers = input;

            int i = 0;
            while (sc.hasNextInt()) {
                numbers[i] = sc.nextInt();
                i++;
            }
        }
    }

    public void printArray() { // prints contents of numbers array used for debugging
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public void sortArray() { // sorts integer[] so that numbers can be tabulated easily
        for (int last = numbers.length - 1; last >= 1; last--) {
            int maxIndex = 0;

            for (int index = 1; index <= last; index++) {
                if (numbers[index] > numbers[maxIndex])
                    maxIndex = index;
            }
            int temp = numbers[maxIndex];
            numbers[maxIndex] = numbers[last];
            numbers[last] = temp;
        }
    }

    public void tabulateResults() { // calculates and prints results

        // create two arraylists such that an index in frequency is the number of times
        // that same index in uniqueNums appears in the numbers array
        ArrayList<Integer> uniqueNums = new ArrayList<Integer>();
        ArrayList<Integer> frequency = new ArrayList<Integer>();

        int current = numbers[0]; // current keeps track of number being tabulated, array is already sorted when
                                  // this runs
        uniqueNums.add(current);
        frequency.add(1);
        for (int i = 1; i < numbers.length; i++) {
            if (current == numbers[i]) {
                frequency.set(frequency.size() - 1, frequency.get(frequency.size() - 1) + 1);
            } else {
                current = numbers[i];
                uniqueNums.add(current);
                frequency.add(1);
            }
        }

        // sort ArrayLists together so that results can print largest to smallest
        for (int last = frequency.size() - 1; last >= 1; last--) {
            int minIndex = 0;

            for (int index = 1; index <= last; index++) {
                if (frequency.get(index) < frequency.get(minIndex))
                    minIndex = index;
            }
            int tempNum = uniqueNums.get(minIndex);
            int tempFreq = frequency.get(minIndex);

            uniqueNums.set(minIndex, uniqueNums.get(last));
            frequency.set(minIndex, frequency.get(last));

            uniqueNums.set(last, tempNum);
            frequency.set(last, tempFreq);
        }

        // print results
        String format = "%1$4s %2$10s%n";
        System.out.printf(format, "Number", "Frequency");
        for (int i = 0; i < uniqueNums.size(); i++) {
            System.out.printf(format, uniqueNums.get(i), frequency.get(i));
        }
    }
}
