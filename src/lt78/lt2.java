package lt78;

class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class lt2 {

    public static void main(String[] args) {

        Book b1 = new Book("Java Core", "Dung", 120000);
        Book b2 = new Book("OOP Basic", "An", 95000);
        Book b3 = new Book("Data Structure", "Minh", 150000);

        Book[] books = {b1, b2, b3};

        for (Book book : books) {
            book.printInfo();
        }
    }
}