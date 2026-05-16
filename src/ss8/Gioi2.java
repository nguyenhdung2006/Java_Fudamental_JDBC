package ss8;

class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void showInfo() {
        System.out.println(
                "Chiều dài: " + height +
                        ", chiều rộng: " + width +
                        ", chu vi: " + getPerimeter() +
                        ", diện tích: " + getArea()
        );
    }
}

public class Gioi2 {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 4);

        rectangle.showInfo();

    }
}