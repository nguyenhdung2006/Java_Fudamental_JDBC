package ss2;

import java.util.Scanner;

public class Gioi1 {

    public static int sumOfDigits (int N) {
        N = Math.abs(N);
        int sum = 0;

        while (N > 0) {
            int lastDigit = N % 10;
            sum += lastDigit;
            N /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên: ");
        int N = sc.nextInt();

        int sum = sumOfDigits(N);
        System.out.println("Tổng các chữ số là: " + sum);

        sc.close();
    }
}
