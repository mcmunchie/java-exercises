package Vehicle;

public class Car {
  // class fields
  private int yearModel;
  private String carMake;
  private int carSpeed;

  // constructor
  public Car(String make, int year) {
    carMake = make;
    yearModel = year;
    carSpeed = 0;
  }

  // accessors
  public void setMake(String make) {
    carMake = make;
  }

  public void setModel(int model) {
    yearModel = model;
  }

  public void setSpeed(int speed) {
    carSpeed = speed;
  }

  public String getMake() {
    return carMake;
  }

  public int getModel() {
    return yearModel;
  }

  public int getSpeed() {
    return carSpeed;
  }

  public int accelerate() {
    carSpeed += 5;
    return carSpeed;
  }

  public int brake() {
    carSpeed -= 5;
    return carSpeed;
  }
}
