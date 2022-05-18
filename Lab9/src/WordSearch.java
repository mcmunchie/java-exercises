package Lab9.src;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

// used to read in a word search and word list from a file, and print out the found words in an array of their corresponding location within the wordsearch
// assumes that a single word on the word list can be found multiple times in the word search
public class WordSearch {

    private char[][] board; // keep track of puzzle
    private char[][] found; // keep track of found words
    private ArrayList<String> wordList = new ArrayList<String>(); // keep track of words to search for
    private int rowCount = 0; // keep track of array dimensions for easy traversal
    private int colCount = 0; // keep track of array dimensions for easy traversal

    // default constructor
    public WordSearch(String grid, String words) throws FileNotFoundException {
        adjustBoardSize(grid);
        createBoard(grid);
        createWordList(words);
        findWords();
        testPrint();
    }

    // adjust arrays to proper size to hold all information from file
    public void adjustBoardSize(String grid) throws FileNotFoundException {
        File file = new File(grid);
        Scanner sc = new Scanner(file);
        String temp = "";

        // get row and column sizes
        while (sc.hasNextLine()) {
            temp = sc.nextLine();
            rowCount++;
        }
        colCount = temp.length();

        // adjust array sizes
        board = new char[rowCount][colCount];
        found = new char[rowCount][colCount];
        // initialize found as an array of whitespaces so output looks cleaner
        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                found[i][j] = ' ';
            }
        }
        sc.close();
    }

    // populate board from file
    public void createBoard(String grid) throws FileNotFoundException {
        File file = new File(grid);
        Scanner sc = new Scanner(file);

        String temp; // keep track of contents of current line in file
        int currentRow = 0; // keep track of row # for inserting into array

        // assign to array
        while (sc.hasNextLine()) {
            temp = sc.nextLine();
            for (int i = 0; i < colCount; i++) {
                board[currentRow][i] = temp.charAt(i);
            }
            currentRow++;
        }
        sc.close();
    }

    // populate list of words to search for, assumes words are delimited by \n
    public void createWordList(String words) throws FileNotFoundException {
        File file = new File(words);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            wordList.add(sc.nextLine().toUpperCase());
        }
        sc.close();
    }

    // compares value of coordinates with word from word list and searches in all
    // eight directions
    public void findWordsHelper(String toFind, int colCoord, int rowCoord) {

        // search up for each character in the word we're looking for
        boolean isFound = true;
        for (int i = 0; i < toFind.length(); i++) {
            // out of bounds
            if (colCoord - i < 0) {
                isFound = false;
                break;
            }
            // compare char index w/ coords on board
            else if (!(board[colCoord - i][rowCoord] == toFind.charAt(i))) {
                isFound = false;
                break;
            }
        }

        // word was there, so go back and mark it on found[][]
        if (isFound) {
            for (int i = 0; i < toFind.length(); i++) {
                found[colCoord - i][rowCoord] = board[colCoord - i][rowCoord];
            }
        }

        // search down for each character in the word we're looking for
        isFound = true;
        for (int i = 0; i < toFind.length(); i++) {
            // out of bounds
            if (colCoord + i >= colCount) {
                isFound = false;
                break;
            }
            // compare char index w/ coords on board
            else if (!(board[colCoord + i][rowCoord] == toFind.charAt(i))) {
                isFound = false;
                break;
            }
        }

        // word was there, so go back and mark it on found[][]
        if (isFound) {
            for (int i = 0; i < toFind.length(); i++) {
                found[colCoord + i][rowCoord] = board[colCoord + i][rowCoord];
            }
        }

        // search right for each character in the word we're looking for
        isFound = true;
        for (int i = 0; i < toFind.length(); i++) {
            // out of bounds
            if (rowCoord + i >= rowCount) {
                isFound = false;
                break;
            }
            // compare char index w/ coords on board
            else if (!(board[colCoord][rowCoord + i] == toFind.charAt(i))) {
                isFound = false;
                break;
            }
        }

        // word was there, so go back and mark it on found[][]
        if (isFound) {
            for (int i = 0; i < toFind.length(); i++) {
                found[colCoord][rowCoord + i] = board[colCoord][rowCoord + i];
            }
        }

        // search left for each character in the word we're looking for
        isFound = true;
        for (int i = 0; i < toFind.length(); i++) {
            // out of bounds
            if (rowCoord - i < 0) {
                isFound = false;
                break;
            }
            // compare char index w/ coords on board
            else if (!(board[colCoord][rowCoord - i] == toFind.charAt(i))) {
                isFound = false;
                break;
            }
        }

        // word was there, so go back and mark it on found[][]
        if (isFound) {
            for (int i = 0; i < toFind.length(); i++) {
                found[colCoord][rowCoord - i] = board[colCoord][rowCoord - i];
            }
        }

        // search northwest for each character in the word we're looking for
        isFound = true;
        for (int i = 0; i < toFind.length(); i++) {
            // out of bounds
            if (rowCoord - i < 0 || colCoord - i < 0) {
                isFound = false;
                break;
            }
            // compare char index w/ coords on board
            else if (!(board[colCoord - i][rowCoord - i] == toFind.charAt(i))) {
                isFound = false;
                break;
            }
        }

        // word was there, so go back and mark it on found[][]
        if (isFound) {
            for (int i = 0; i < toFind.length(); i++) {
                found[colCoord - i][rowCoord - i] = board[colCoord - i][rowCoord - i];
            }
        }

        // search southeast for each character in the word we're looking for
        isFound = true;
        for (int i = 0; i < toFind.length(); i++) {
            // out of bounds
            if (rowCoord + i >= rowCount || colCoord + i >= colCount) {
                isFound = false;
                break;
            }
            // compare char index w/ coords on board
            else if (!(board[colCoord + i][rowCoord + i] == toFind.charAt(i))) {
                isFound = false;
                break;
            }
        }

        // word was there, so go back and mark it on found[][]
        if (isFound) {
            for (int i = 0; i < toFind.length(); i++) {
                found[colCoord + i][rowCoord + i] = board[colCoord + i][rowCoord + i];
            }
        }

        // search northeast for each character in the word we're looking for
        isFound = true;
        for (int i = 0; i < toFind.length(); i++) {
            // out of bounds
            if (rowCoord + i >= rowCount || colCoord - i < 0) {
                isFound = false;
                break;
            }
            // compare char index w/ coords on board
            else if (!(board[colCoord - i][rowCoord + i] == toFind.charAt(i))) {
                isFound = false;
                break;
            }
        }

        // word was there, so go back and mark it on found[][]
        if (isFound) {
            for (int i = 0; i < toFind.length(); i++) {
                found[colCoord - i][rowCoord + i] = board[colCoord - i][rowCoord + i];
            }
        }

        // search southwest for each character in the word we're looking for
        isFound = true;
        for (int i = 0; i < toFind.length(); i++) {
            // out of bounds
            if (colCoord + i >= colCount || rowCoord - i < 0) {
                isFound = false;
                break;
            }
            // compare char index w/ coords on board
            else if (!(board[colCoord + i][rowCoord - i] == toFind.charAt(i))) {
                isFound = false;
                break;
            }
        }

        // word was there, so go back and mark it on found[][]
        if (isFound) {
            for (int i = 0; i < toFind.length(); i++) {
                found[colCoord + i][rowCoord - i] = board[colCoord + i][rowCoord - i];
            }
        }
    }

    // look for the words in wordList in board, and change the same coordinates from
    // found to be true if a word is found
    public void findWords() {
        // for each word in word list
        for (int i = 0; i < wordList.size(); i++) {
            // for each pair of coordinates
            for (int j = 0; j < colCount; j++) {
                for (int k = 0; k < rowCount; k++) {
                    // if found add to list of found words to mark afterwards
                    findWordsHelper(wordList.get(i), j, k);
                }
            }
        }
    }

    // print board, wordList, and found, used for debugging and testing
    public void testPrint() {

        System.out.println(Arrays.deepToString(board).replace("], ", "]\n"));

        for (int i = 0; i < wordList.size(); i++) {
            System.out.println(wordList.get(i));
        }

        System.out.println("Here are the words that were found: ");
        System.out.println(Arrays.deepToString(found).replace("], ", "]\n"));
    }
}
