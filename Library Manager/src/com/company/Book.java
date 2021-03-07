

package com.company;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed = false;
//KHởi tạo đối tượng . Construction
    public Book(String id, String title, String author, Boolean isBorrowed) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }
//Tạo các setter , getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString(){

        return String.format("%-10s%-20s%-20s%-20s",id,title,author,isBorrowed);
    }

}


