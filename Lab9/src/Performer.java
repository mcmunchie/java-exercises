package Lab9.src;

// used to represent a single score on a scoreboard
public class Performer {
    private String name;
    private int score;
    private Performer next;

    // default constructor, used for making an empty scoreboard
    public Performer() {

    }

    // constructor v2, used for creating nodes with data
    public Performer(String n, int s) {
        name = n;
        score = s;
    }

    // get methods
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Performer getNext() {
        return next;
    }

    // mutator methods
    public void setNext(Performer n) {
        next = n;
    }

    // checks if Performer has another score below it
    public boolean hasNext() {
        if (next != null) {
            return true;
        } else {
            return false;
        }
    }
}
