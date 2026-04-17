package ss1;

import java.util.Scanner;

public class kha2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất (firstNumber): ");
        int firstNumber = sc.nextInt();

        System.out.print("Nhập số thứ hai (secondNumber): ");
        int secondNumber = sc.nextInt();

        System.out.println("\n" + "--- Kết quả ---");
        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;

        System.out.println("Tổng = " + sum);
        System.out.println("Hiệu = " + difference);
        System.out.println("Tích = " + product);

        if (secondNumber != 0) {
            int quotient = firstNumber / secondNumber;
            int modulo = firstNumber % secondNumber;

            System.out.println("Thương = " + quotient);
            System.out.println("Phần dư = " + modulo);
        } else {
            System.out.println("Không thể chia hết cho 0!");
        }

        sc.close();
    }
}
