package Question2;

import java.util.Scanner;

public class Drivermenu{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter Employee Information:");
     System.out.print("Enter Employee ID: ");
     int empId = scanner.nextInt();
     scanner.nextLine();  // Consume newline
     System.out.print("Enter Employee Name: ");
     String name = scanner.nextLine();
     System.out.print("Enter Employee Salary: ");
     double salary = scanner.nextDouble();
     Employee employee = new Employee(empId, name, salary);

     System.out.println("\nEnter Product Information:");
     System.out.print("Enter Product ID: ");
     int pid = scanner.nextInt();
     System.out.print("Enter Product Price: ");
     double price = scanner.nextDouble();
     System.out.print("Enter Product Quantity: ");
     int quantity = scanner.nextInt();
     Product product = new Product(pid, price, quantity);

     System.out.println("\nEmployee Information:");
     System.out.println(employee);
     System.out.println("Income Tax: " + employee.calcTax());

     System.out.println("\nProduct Information:");
     System.out.println(product);
     System.out.println("Sales Tax: " + product.calcTax());

     scanner.close();
 }
}
