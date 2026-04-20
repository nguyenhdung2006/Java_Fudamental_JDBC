package ss2;

import java.util.Scanner;

public class XuatSac2 {

    public static int countDigit (int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static long calculateArmstrong (int n) {

        int exponents = countDigit(n);
        long sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += (long) Math.pow(lastDigit, exponents);
            n = n / 10;
        }

        return sum;
    }

    public static boolean checkArmstrong(int n) {

        long N = calculateArmstrong(n);

        if (N == n) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 số nguyên: ");
        long n = sc.nextLong();

        n = Math.abs(n);

        for (int i = 0; i <= n; i++) {
            if (checkArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
