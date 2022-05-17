package Vehicle;

public class Drive {
  public static void main(String[] args) {
    // create car object
    Car myCar = new Car("Hyundai", 2020);

    // print car info
    System.out.println("Car make is: " + myCar.getMake());
    System.out.println("Car model: " + myCar.getModel());
    System.out.println("Car current speed: " + myCar.getSpeed());

    // call accelerate and brake methods five times
    System.out.println("Speed after accelerating: " + myCar.accelerate());
    System.out.println("Speed after accelerating: " + myCar.accelerate());
    System.out.println("Speed after accelerating: " + myCar.accelerate());
    System.out.println("Speed after braking: " + myCar.brake());
    System.out.println("Speed after braking: " + myCar.brake());
    System.out.println("Speed after braking: " + myCar.brake());
  }
}
