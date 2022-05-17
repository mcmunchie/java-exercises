package LinkedList;

public class Node {
  public String value; // node value
  public Node next; // node reference

  public Node(String val, Node n) { // constructor for nodes with both a value and reference
    value = val;
    next = n;
  }

  public Node(String val) { // constructor for nodes with a value and null reference
    value = val;
    next = null;
  }
}
