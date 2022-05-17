package LinkedQueue;

// queues use FIFO (first in, first out) 
public class LinkedQueue {
  private Node front = null;
  private Node rear = null;

  private class Node {
    String value;
    Node next;

    // constructor to create a new linked list node
    Node(String val, Node n) {
      value = val;
      next = n;
    }
  }

  // checks if queue is empty
  public boolean empty() {
    return front == null;
  }

  // adds a value to the queue
  // enqueue through the back of the queue
  public void enqueue(String s) {
    // add new value at end of queue
    if (rear != null) {
      rear.next = new Node(s, null);
      rear = rear.next;
    }
    // queue is empty, add new value
    else {
      rear = new Node(s, null);
      front = rear;
    }
  }

  // removes and returns value at the front of the queue
  // dequeue from the front of the queue
  public String dequeue() {
    if (empty())
      throw new EmptyQueueException();
    else {
      String value = front.value;
      front = front.next;
      if (front == null) {
        rear = null;
      }
      return value;
    }
  }

  // returns value at the front of the queue
  public String peek() {
    if (empty())
      throw new EmptyQueueException();
    else
      return front.value;
  }

  // returns the size of the queue
  public int size() {
    int count = 0; // set a counter

    while (front != null) {
      count++;
      front = front.next;
    }
    return count;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    // walk down the list and append all values
    Node p = front;

    while (p != null) {
      builder.append(p.value);
      p = p.next;
      if (p != null) {
        builder.append(" <-- ");
      }
    }
    return builder.toString();
  }

  class EmptyQueueException extends RuntimeException {
  }
}
