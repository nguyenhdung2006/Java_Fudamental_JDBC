package ss2;

import java.util.Scanner;

public class kha1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên: ");
        int N = sc.nextInt();

        int sum = 0;

        if ( N <= 0 ) {
            System.out.println("Số nhập vào không hợp lệ!");
            sc.close();
            return;
        }

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Tổng các số từ 1 đến " + N + " là: " + sum);

        sc.close();
    }
}
