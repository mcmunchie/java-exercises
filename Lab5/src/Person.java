package Lab5.src;

public class Person {
    private String firstName; // store the first name
    private String middleName; // store the middle name
    private String lastName; // store the last name

    // Default constructor
    // Initialize firstName and lastName to an empty string.
    // Postcondition: firstName = ""; lastName = "";
    public Person() {
        firstName = "";
        middleName = "";
        lastName = "";

    }

    // Constructor with parameters
    // Set firstName and lastName according to the parameters.
    // Postcondition: firstName = first; lastName = last;
    public Person(String first, String last, String middle) {
        setName(first, last);
        setMiddleName(middle);
    }

    // Method to output the first name and last name
    // in the form firstName lastName.
    public String toString() {
        return (firstName + " " + lastName);
    }

    // Method to set firstName and lastName according to
    // the parameters.
    // Postcondition: firstName = first; lastName = last;
    public void setName(String first, String last) {
        firstName = first;
        lastName = last;
    }

    // Method to return firstName.
    // Postcondition: The value of firstName is returned.
    public String getFirstName() {
        return firstName;
    }

    // Method to return lastName.
    // Postcondition: The value of lastName is returned.
    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() { // return middle name of person
        return middleName;
    }

    public void setLastName(String name) { // set last name only
        lastName = name;
    }

    public void setFirstName(String name) { // set first name only
        firstName = name;
    }

    public void setMiddleName(String name) { // set middle name only
        middleName = name;
    }

    public boolean checkLastName(Person bio) { // return true if last name matches parameter given
        if (this.lastName.equals(bio.getLastName())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkFirstName(Person bio) { // return true if first name matches parameter given
        if (this.firstName.equals(bio.getFirstName())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMiddleName(Person bio) { // return true if first name matches parameter given
        if (this.middleName.equals(bio.getMiddleName())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Person bio) { // returns true if two Persons have the same first and last names
        if (this.checkFirstName(bio) && this.checkLastName(bio)) {
            return true;
        } else {
            return false;
        }
    }

    public void makeCopy(Person bio) { // takes the values of bio1 and makes the values of bio2 match
        bio.setFirstName(this.getFirstName());
        bio.setMiddleName(this.getMiddleName());
        bio.setLastName(this.getLastName());
    }

    public Person getCopy() { // return a Person object that is a copy of the parameter
        Person copy = new Person(this.getFirstName(), this.getLastName(), this.getMiddleName());
        return copy;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFirstName("Anthony");
        p1.setMiddleName("Christopher");
        p1.setLastName("Falche");

        Person p2 = new Person("Patience", "Sullivan", "Mary-Ann");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Person p3 = new Person();
        p1.makeCopy(p3);

        System.out.println(p3.toString());

        Person p4 = p2.getCopy();

        System.out.println(p4.toString());

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p4));

    }
}
