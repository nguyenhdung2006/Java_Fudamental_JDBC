package ss1;

import java.util.Scanner;

public class gioi2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chiều rộng: ");
        double width = sc.nextDouble();

        System.out.print("Nhập vào chiều dài: ");
        double height = sc.nextDouble();

        double area = width * height;
        double perimeter = (width + height) * 2;

        System.out.println("Diện tích: " + area);
        System.out.println("Chu vi: " + perimeter);

        sc.close();
    }
}
