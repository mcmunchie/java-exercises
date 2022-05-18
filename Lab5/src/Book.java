package Lab5.src;

import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<String> authors = new ArrayList<String>(); // num of authors can be pulled from authors.size() when needed
    String publisher;
    long isbn;
    double price;
    int copies;

    public Book() { // default constructor

    }

    public Book(String titleOf, String authorOf, String publisherOf, long isbnOf, double priceOf, int copiesOf) { // constructor
        title = titleOf;
        authors.add(authorOf);
        publisher = publisherOf;
        isbn = isbnOf;
        price = priceOf;
        copies = copiesOf;
    }

    public String getTitle() { // accessor method
        return this.title;
    }

    public ArrayList<String> getAuthor() { // accessor method
        return this.authors;
    }

    public int getNumAuthors() { // returns number of authors
        return this.authors.size();
    }

    public String getPublisher() { // accessor method
        return this.publisher;
    }

    public long getisbn() { // accessor method
        return this.isbn;
    }

    public double getPrice() { // accessor method
        return this.price;
    }

    public void setTitle(String titleOf) { // mutator method
        this.title = titleOf;
    }

    public void addAuthor(String authorOf) { // mutator method
        this.authors.add(authorOf);
    }

    public void setPublisher(String publisherOf) { // mutator method
        this.publisher = publisherOf;
    }

    public void setisbn(long isbnOf) { // mutator method
        this.isbn = isbnOf;
    }

    public void setPrice(double priceOf) { // mutator method
        this.price = priceOf;
    }

    public boolean checkTitle(String otherTitle) { // returns true if book shares title with parameter
        return (this.title.equals(otherTitle));
    }

    public boolean checkAuthor(Book other) { // returns true if a book shares any author with other book
        for (int i = 0; i < authors.size(); i++) {
            if (this.authors.contains(other.authors.get(i))) {
                return true;
            }
        }
        return false; // only returns if for loop finishes execution without returning
    }

    public boolean checkisbn(long otherisbn) { // returns true if given isbn is that of the book
        if (this.isbn == otherisbn) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPrice(double otherPrice) { // returns true if given price matches that of the book
        if (this.price == otherPrice) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPublisher(String otherPublisher) { // returns true if given publisher matches that of the book
        if (this.publisher.equals(otherPublisher)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Book twoTowers = new Book("The Two Towers", "J.R.R. Tolkien", "George Allen & Unwin", 978000720, 2.50, 20000);
        Book fellowshipOfTheRing = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", "George Allen & Unwin",
                123451337, 10.09, 30580);
        twoTowers.setPrice(4.20);
        System.out.println(twoTowers.getPrice());
        System.out.println(twoTowers.checkAuthor(fellowshipOfTheRing));
        System.out.println(twoTowers.checkPublisher("George Allen & Unwin"));
        System.out.println(fellowshipOfTheRing.checkPrice(10.09));
    }
}
