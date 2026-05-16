package lt78;

class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public void printInfo() {

        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

public class lt1 {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 4);

        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();

        System.out.println("Dien tich: " + area);
        System.out.println("Chu vi: " + perimeter);

        rectangle.printInfo();
    }
}