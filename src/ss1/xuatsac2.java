package ss1;

import java.util.Scanner;

public class xuatsac2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào vận tốc: ");
        double speed = sc.nextDouble();

        System.out.print("Nhập vào thời gian: ");
        double time = sc.nextDouble();

        double distance = speed * time;
        String result = String.format("%.2f", distance);

        System.out.println("Quãng đường = " + result + " (km)");

        sc.close();
    }
}
