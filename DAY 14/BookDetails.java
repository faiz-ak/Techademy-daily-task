// Do this activity : Create a class Book with attributes title, author, price. Ask students to create 3 objects with different values and print details.

import java.util.Scanner;

class Book {
    String title;
    String author;
    String price;

    void displaydetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println("");
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3]; 

        for (int i = 0; i < 3; i++) {
            books[i] = new Book();
            System.out.println("Enter the details for Book " + (i + 1) + ":");
            System.out.print("Title: ");
            books[i].title = sc.nextLine();
            System.out.print("Author: ");
            books[i].author = sc.nextLine();
            System.out.print("Price: ");
            books[i].price = sc.nextLine();
        }

        System.out.println("Book Details:");
        for (int i = 0; i < 3; i++) {
            books[i].displaydetails();
        }
    }
}
