package Question1;

import java.util.ArrayList;

public class Library {
 private ArrayList<Book> books;

 public Library() {
     books = new ArrayList<>();
 }

 public void addBook(Book book) {
     books.add(book);
 }

 public void removeBook(int bookID) {
     books.removeIf(book -> book.getBookID() == bookID);
 }

 public Book searchBook(int bookID) {
     for (Book book : books) {
         if (book.getBookID() == bookID) {
             return book;
         }
     }
     return null;
 }

 public void displayBooks() {
     if (books.isEmpty()) {
         System.out.println("No books in the library.");
     } else {
         for (Book book : books) {
             System.out.println(book);
         }
     }
 }
}
