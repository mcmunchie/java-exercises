package LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.add("Bob");
    list.add("Carol");
    list.add(0, "Allan");
    list.add(2, "Brad");
    list.add(4, "Debby");
    list.remove("Carol");

    System.out.println("The members of the list are:");
    System.out.print(list);
    System.out.println();

    Node friendsList = new Node("Bob"); // head reference
    friendsList.next = new Node("Carol"); // adds new node
    friendsList.next.next = new Node("Debby"); // adds another node

    // insert "Allen" at the beginning of the list
    friendsList = new Node("Allen", friendsList);

    // insert "Brad" between "Bob" and "Carol"
    friendsList.next.next = new Node("Brad", friendsList.next.next);

    // delete "Carol" from the linked list
    // Java's garbage collector collects nodes with no pointers after a certain
    // period of time
    friendsList.next.next.next = friendsList.next.next.next.next;

    Node i = friendsList; // create iterable reference
    System.out.println("My friends list is: ");
    while (i != null) {
      System.out.println(i.value); // print linked list values
      i = i.next; // traverse to next node
    }
    // System.out.println(friendsList.value); // prints node value
    // System.out.println(friendsList.next); // prints node reference
  }
}
