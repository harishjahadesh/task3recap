package Question2;

public class Employee implements Taxable {
 private int empId;
 private String name;
 private double salary;

 public Employee(int empId, String name, double salary) {
     this.empId = empId;
     this.name = name;
     this.salary = salary;
 }

 @Override
 public double calcTax() {
     return salary * INCOME_TAX;
 }

 @Override
 public String toString() {
     return "Employee [ID=" + empId + ", Name=" + name + ", Salary=" + salary + "]";
 }
}

