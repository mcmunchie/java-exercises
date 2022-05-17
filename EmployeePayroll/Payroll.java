package EmployeePayroll;

public class Payroll {
  // class fields
  private static String employeeName;
  private String employeeID;
  private double employeePayRate;
  private double employeeWorkHours;

  // constructor
  public Payroll(String name, String id, double rate, double hours) {
    employeeName = name;
    employeeID = id;
    employeePayRate = rate;
    employeeWorkHours = hours;
  }

  // mutators
  public static void setName(String name) {
    employeeName = name;
  }

  public void setID(String id) {
    employeeID = id;
  }

  public void setRate(double rate) {
    employeePayRate = rate;
  }

  public void setWorkHours(double hours) {
    employeeWorkHours = hours;
  }

  public String getName() {
    return employeeName;
  }

  public String getID() {
    return employeeID;
  }

  public double getRate() {
    return employeePayRate;
  }

  public double getHours() {
    return employeeWorkHours;
  }

  public double calcGrossPay(double rate, double hours) {
    double grossPay = rate * hours;
    return grossPay;
  }

  // overloaded grosspay method
  public double calcGrossPayMax(double grossPay) {
    // hours * rate (hours - 40) * 200
    return grossPay;
  }
}
