package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@SuppressWarnings("ALL")
public class BookList {

    Scanner sc = new Scanner(System.in);
    //Khai báo một ArrayList có tên là myBooks
    List<Book> myBooks = new ArrayList<>();

    //Tạo một phương thức dùng để thêm sách vào thư viện
    public void add () {
        System.out.println("Enter information fo the new book:");
        //Người dùng nhập ID
        System.out.print("ID: ");
        String id = sc.next();
        //Người dùng nhập title
        System.out.print("Title: ");
        String title = sc.next();
        //Người dùng nhập Author
        System.out.print("Author: ");
        String author = sc.next();
        //Người dùng nhập sách đã được mươn hay chưa
        System.out.print("Is borrowed (1 = yes , 0 = no): ");
        int choice = sc.nextInt();
        Boolean isBorrowed = false;
        switch (choice) {
            //Nhập 1 là có
            case 1:
                isBorrowed = true;
                break;
            //Nhập 0 là chưa cho mươn
            case 0:
                isBorrowed = false;
                break;
        }
        //Gọi phương thức thêm sách
        addToList(id.toUpperCase(), title, author, isBorrowed);
        System.out.println("A new book has been added");
    }

    //Tạo phương thức dùng để thêm sách vào mảng
    public void addToList (String id, String title, String author, Boolean isBorrowed) {
        Book book = new Book(id.toUpperCase(), title, author, isBorrowed);
        //mảng tên myBooks thêm sách
        myBooks.add(book);
    }

    // Tạo phương thức tìm kiếm
    public void search () {

        System.out.println("Enter book title to search.");
        //Nhập tên sách
        System.out.print("Book title: ");
        String searchKey = sc.next();
        //Tạo mảng ArrayList dùng để lưu chữ sách mà mình tìm kiếm
        List<Book> booksFound = new ArrayList<>();
        //dùng vòng lập for-each để lặp các sách mà mình thêm
        for ( Book book : myBooks ) {
            //Nhận tên sách nếu có tên sách trong myBooks thì thêm sách vào mảng booksFound
            if (book.getTitle().contains(searchKey)) {
                booksFound.add(book);
            }
        }
        //Nếu ở trong BooksFound không có sách thì hiển thị
        if (booksFound.isEmpty()) {
            System.out.println("No book is found");

        } else {
            System.out.println(String.format("%-10s%-20s%-20s%-20s", "ID", "Title", "Author", "Is borrowed"));
            //dùng vòng lặp để hiển thị ra sách mà mình tìm kiếm nếu có
            for ( Book book : booksFound ) {
                System.out.println(book.toString());
            }
        }

    }

    //Tạo phương thức dùng để hiển thị số sách mà thư viện đang có
    public void display () {
        System.out.println(String.format("%-10s%-20s%-20s%-20s", "ID", "Title", "Author", "Is borrowed"));
        for ( Book book : myBooks ) {
            System.out.println(book.toString());
        }
    }

    //Tạo phương thức dùng để mượn sách
    public void borrow () {
        System.out.println("Enter book ID to borrow: ");
        //Nhập Id của sách
        System.out.print("Book ID: ");
        String searchKey = sc.next();

        for ( Book aBook : myBooks ) {
            if (aBook.getId().equalsIgnoreCase(searchKey)) {
                if (aBook.getBorrowed()) {
                    System.out.println("You can not borrow this book. The book has been borrowed");
                    return;
                }
                aBook.setBorrowed(true);
                System.out.println("You have successfully borrow the book: " + aBook.getTitle());
                return;

            }

        }
        System.out.println("The library has no books");
    }

    public void exit () {
    }
}



