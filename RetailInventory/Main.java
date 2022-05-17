package RetailInventory;

public class Main {
  public static void main(String[] args) {
    // create three retail items
    RetailItem itemOne = new RetailItem("Jacket", 12, 59.95);
    RetailItem itemTwo = new RetailItem("Designer Jeans", 40, 34.95);
    RetailItem itemThree = new RetailItem("Shirt", 20, 24.95);

    // display retail items
    System.out.println("Retail Item Inventory");
    System.out.println("\tItem #: " + itemOne.getDescription() + '\t' + itemOne.getUnits()
        + '\t' + itemOne.getPrice());
    System.out.println("\tItem #: " + itemTwo.getDescription() + '\t' + itemTwo.getUnits()
        + '\t' + itemTwo.getPrice());
    System.out.println("\tItem #: " + itemThree.getDescription() + '\t' + itemThree.getUnits()
        + '\t' + itemThree.getPrice());
  }
}
