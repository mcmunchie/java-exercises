package Lab9.src;

// used to simulate a scoreboard for a video game
// assumes that the same Performer can hold multiple spots on the scoreboard with different scores
// duplicate scores are placed below the prexisting score(s) if any
public class Scoreboard {
    Performer topScore; // keep track of the top score on the scoreboard which is the head of the list

    // default constructor for making an empty scoreboard
    public Scoreboard() {

    }

    // insert method
    public void insert(String newName, int newScore) {
        // scoreboard was empty, add it to scoreboard and make it the top score
        if (topScore == null) {
            topScore = new Performer(newName, newScore);
        }
        // scoreboard is NOT empty but there are less than 10 values stored in it, so
        // nothing needs kicked out
        else if (getNumScores() < 10) {
            // theres a new top score
            if (newScore > topScore.getScore()) {
                Performer newInsert = new Performer(newName, newScore);
                newInsert.setNext(topScore);
                topScore = newInsert;
            }
            // check if the score belongs anywhere else on the list, and put it there if
            // needed
            else {
                // used to iterate through scores to find where to insert
                Performer temp = topScore;
                while (temp.hasNext()) {
                    if (newScore < temp.getScore() && newScore > temp.getNext().getScore()) {
                        Performer newInsert = new Performer(newName, newScore);
                        newInsert.setNext(temp.getNext());
                        temp.setNext(newInsert);
                        break;
                    }
                    temp = temp.getNext();
                }
            }
        }
        // scoreboard is NOT empty and there are already 10 values stored in it, so
        // something potentially needs kicked out
        else {
            // used to iterate through scores to find where to insert
            Performer temp = topScore;
            boolean inserted = false;
            while (temp.hasNext()) {
                if (newScore < temp.getScore() && newScore > temp.getNext().getScore()) {
                    Performer newInsert = new Performer(newName, newScore);
                    newInsert.setNext(temp.getNext());
                    temp.setNext(newInsert);
                    inserted = true;
                    break;
                }
                if (inserted) {
                    temp = topScore;
                    for (int i = 0; i < 10; i++) {
                        temp = temp.getNext();
                        if (i == 10) {
                            temp.setNext(null);
                        }
                    }
                }
                temp = temp.getNext();
            }
        }
    }

    // method to return number of scores in the scoreboard
    public int getNumScores() {
        // scoreboard is empty
        if (topScore == null) {
            return 0;
        }
        // scoreboard has at least one score in it
        else {
            int count = 1;
            // used to iterate through all high scores to see how many there are
            Performer temp = topScore;
            while (temp.hasNext()) {
                temp = temp.getNext();
                count++;
            }
            return count;
        }
    }

    public void printScores() {
        String format = "%1$5s %2$10s %n";
        System.out.printf(format, "Name", "Score");
        Performer temp = topScore;
        for (int i = 0; i < getNumScores(); i++) {
            System.out.printf(format, temp.getName(), temp.getScore());
            temp = temp.getNext();
        }
    }
}
