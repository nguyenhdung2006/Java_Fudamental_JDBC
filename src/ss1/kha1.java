package ss1;

import java.util.Scanner;

public class kha1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Diện tích: " + area);

        sc.close();
    }
}