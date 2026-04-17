package ss1;

import java.util.Scanner;

public class xuatsac1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào cân nặng: ");
        double weight = sc.nextDouble();

        System.out.print("Nhập vào chiều cao: ");
        double height = sc.nextDouble();

        double bmi = weight / height;
        String result = String.format("%.2f", bmi);

        System.out.println("Chỉ số BMI = " + result);

        sc.close();
    }
}
