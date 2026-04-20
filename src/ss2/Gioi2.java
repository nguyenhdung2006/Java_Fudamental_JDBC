package ss2;

import java.util.Scanner;

public class Gioi2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh thứ nhất: ");
        double a = sc.nextDouble();

        System.out.print("Nhập cạnh thứ hai: ");
        double b = sc.nextDouble();

        System.out.print("Nhập cạnh thứ ba: ");
        double c = sc.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Đây không phải là tam giác.");
        } else {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a * a + b * b == c * c ||
                    a * a + c * c == b * b ||
                    b * b + c * c == a * a) {

                if (a == b || b == c || a == c) {
                    System.out.println("Đây là tam giác vuông cân.");
                } else {
                    System.out.println("Đây là tam giác vuông.");
                }

            } else if (a == b || b == c || a == c) {
                System.out.println("Đây là tam giác cân.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
        }

        sc.close();
    }
}