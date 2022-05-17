package LinkedStack;

public class Main {
  public static void main(String[] args) {
    LinkedStack stack = new LinkedStack();

    System.out.println("Pushing: Amy Bob Chuck");
    System.out.println("Contents of Stack:");
    stack.push("Amy");
    stack.push("Bob");
    stack.push("Chuck");

    System.out.println(stack);

    String name = stack.pop();
    System.out.println("Popped: " + name);

    System.out.println("Contents of Stack:");
    System.out.println(stack);
  }
}
