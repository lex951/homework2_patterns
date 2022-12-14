package org.example.prototype;

public class Book implements Prototype{
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public Prototype getPrototype() {
        Book book=new Book(title,author,price);
        return book;
    }
}
