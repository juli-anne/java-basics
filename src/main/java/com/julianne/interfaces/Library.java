package com.julianne.interfaces;

public class Library {

    public static void main(String[] args) {

        // variable book of type Product - can call methods defined in Product
        // new Book() creates a new Book object in memory of type Book - at runtime uses Book's version of methods
        // Product is the job title - Book is the employee with that job title
        // can only perform the duties of the job, if it needs to do "other duties" that are not in the job
        // description has to get assigned a role that includes that (downcast)
        Product book = new Book();
        book.setName("You Can Heal Your Life");
        System.out.println(book.getName());

        // to do the above:
        // Book book = new Book();
        // book.setAuthor("Louise Hay");
        // OR
        Product product = new Book();
        if (product instanceof Book b) {
            b.setAuthor("Louise Hay");
            System.out.println(b.getAuthor());
        }
    }
}
