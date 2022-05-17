package LinkedStack;

public class LinkedStack {
  private Node top = null;

  private class Node {
    String value;
    Node next;

    Node(String val, Node n) {
      value = val;
      next = n;
    }
  }

  public boolean empty() {
    return top == null;
  }

  public void push(String s) {
    top = new Node(s, top);
  }

  public String pop() {
    if (empty()) {
      throw new EmptyStackException();
    } else {
      String retValue = top.value;
      top = top.next;
      return retValue;
    }
  }

  public String peek() {
    if (empty()) {
      throw new EmptyStackException();
    } else {
      return top.value;
    }
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    Node p = top;

    while (p != null) {
      builder.append(p.value);
      p = p.next;
      if (p != null)
        builder.append("\n");
    }
    return builder.toString();
  }

  class EmptyStackException extends RuntimeException {
  }
}
