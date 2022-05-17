package LinkedList;

public class LinkedList {
  private class Node {
    String value;
    Node next;

    Node(String val, Node n) {
      value = val;
      next = n;
    }

    Node(String val) {
      this(val, null);
    }
  }

  private Node first; // list head
  private Node last; // last element in list for easy addition

  // constructor for linked list
  public LinkedList() {
    first = null;
    last = null;
  }

  // checks to see if the list is empty.
  public boolean isEmpty() {
    return first == null;
  }

  // size method returns the length of the list
  public int size() {
    int count = 0;
    Node p = first;

    while (p != null) {
      count++;
      p = p.next;
    }

    return count;
  }

  // add an element to the end of the list
  public void add(String e) {
    if (isEmpty()) {
      first = new Node(e);
      last = first;
    } else {
      // add to end of existing list
      last.next = new Node(e);
      last = last.next;
    }
  }

  // add an element at a position.
  public void add(int index, String e) {
    if (index < 0 || index > size()) {
      String message = String.valueOf(index);
      throw new IndexOutOfBoundsException(message);
    }

    // index is at least 0
    if (index == 0) {
      first = new Node(e, first);
      if (last == null)
        last = first;
      return;
    }

    // set a reference pred to point to the node that
    // will be the predecessor of the new node
    Node pred = first;
    for (int k = 1; k <= index - 1; k++) {
      pred = pred.next;
    }

    // splice in a node containing the new element
    pred.next = new Node(e, pred.next);

    // check if there's a new last element 
    if (pred.next.next == null)
      last = pred.next;
  }

  // compute the string representation of the list
  public String toString() {
    StringBuilder strBuilder = new StringBuilder();

    Node p = first;
    while (p != null) {
      strBuilder.append(p.value + "\n");
      p = p.next;
    }
    return strBuilder.toString();
  }

  // remove the element at an index
  public String remove(int index) {
    if (index < 0 || index >= size()) {
      String message = String.valueOf(index);
      throw new IndexOutOfBoundsException(message);
    }

    String element; // the element to return
    if (index == 0) {
      element = first.value;
      first = first.next;

      if (first == null)
        last = null;
    } else {
      Node pred = first;

      for (int k = 1; k <= index - 1; k++)
        pred = pred.next;

      element = pred.next.value;

      pred.next = pred.next.next;

      if (pred.next == null)
        last = pred;
    }

    return element;
  }

  // remove an element
  public boolean remove(String element) {
    if (isEmpty())
      return false;

    if (element.equals(first.value)) {
      first = first.next;
      if (first == null)
        last = null;

      return true;
    }

    Node pred = first;
    while (pred.next != null && !pred.next.value.equals(element))
      pred = pred.next;

    if (pred.next == null)
      return false;

    // pred.next.value is element
    pred.next = pred.next.next;

    // check if pred is now last
    if (pred.next == null)
      last = pred;

    return true;
  }
}
