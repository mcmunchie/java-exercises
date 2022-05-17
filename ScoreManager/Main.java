package ScoreManager;

public class Main {
  public static void main(String[] args) {
    // create class object
    ScoreManager manager = new ScoreManager();
    // declare variable(s)
    int[] scores = new int[25];
    int[] grades = new int[25]; // copied array

    System.out.print("Original array: ");
    manager.printScores(scores);
    System.out.println();

    // call set scores
    manager.setScores();
    // call get scores
    scores = manager.getScores();
    // call get number of B grades
    System.out.println("The number of students with B is: "
        + manager.getNumOfB(scores));

    // copy array to new array
    grades = manager.copyScores(scores);
    // call print scores
    System.out.print("Grades: ");
    manager.printScores(grades);
  }
}
