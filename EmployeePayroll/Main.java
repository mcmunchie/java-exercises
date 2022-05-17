package EmployeePayroll;

public class Main {
  public static void main(String[] args) {
    Payroll employee = new Payroll("Magnus Applebaum", "123", 123.45, 40.4);

    System.out.println("The name of the employee is: " + employee.getName());
    System.out.println("The employee ID is: " + employee.getID());
    System.out.println("The employee payrate is: " + employee.getRate());
    System.out.println("The employee work hours is: " + employee.getHours());
    System.out.println("The employee gross pay is: " + employee.calcGrossPay(12.18, 20.5));
  }
}
