package RetailInventory;

public class RetailItem {
  // fields
  private String description;
  private int unitsOnHand;
  private double itemPrice;

  // constructor
  public RetailItem(String product, int units, double price) {
    description = product;
    unitsOnHand = units;
    itemPrice = price;
  }

  // accessors/modifiers
  public void setDescription(String product) {
    description = product;
  }

  public String getDescription() {
    return description;
  }

  public void setUnits(int units) {
    unitsOnHand = units;
  }

  public int getUnits() {
    return unitsOnHand;
  }

  public void setPrice(double price) {
    itemPrice = price;
  }

  public double getPrice() {
    return itemPrice;
  }
}
