package Question1;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Library library = new Library();
     Scanner scanner = new Scanner(System.in);
     boolean exit = false;

     while (!exit) {
         System.out.println("Library System Menu:");
         System.out.println("1. Add Book");
         System.out.println("2. Remove Book");
         System.out.println("3. Search Book");
         System.out.println("4. Display Books");
         System.out.println("5. Exit");
         System.out.print("Choose an option: ");

         int option = scanner.nextInt();
         scanner.nextLine();  // Consume newline

         switch (option) {
             case 1:
                 System.out.print("Enter Book ID: ");
                 int bookID = scanner.nextInt();
                 scanner.nextLine();  // Consume newline
                 System.out.print("Enter Title: ");
                 String title = scanner.nextLine();
                 System.out.print("Enter Author: ");
                 String author = scanner.nextLine();
                 library.addBook(new Book(bookID, title, author));
                 break;
             case 2:
                 System.out.print("Enter Book ID to remove: ");
                 int removeID = scanner.nextInt();
                 library.removeBook(removeID);
                 break;
             case 3:
                 System.out.print("Enter Book ID to search: ");
                 int searchID = scanner.nextInt();
                 Book foundBook = library.searchBook(searchID);
                 if (foundBook != null) {
                     System.out.println("Book found: " + foundBook);
                 } else {
                     System.out.println("Book not found.");
                 }
                 break;
             case 4:
                 library.displayBooks();
                 break;
             case 5:
                 exit = true;
                 break;
             default:
                 System.out.println("Invalid option. Please try again.");
                 break;
         }
     }

     scanner.close();
 }
}
