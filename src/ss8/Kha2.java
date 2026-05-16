package ss8;

class Book {

    String title;
    String author;
    double price;

    public Book (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Kha2 {

    public static void main(String[] args) {

        Book b1 = new Book("Tôi ngắm hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", 140000);

        b1.showInfo();
    }
}
