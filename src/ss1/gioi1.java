package ss1;

import java.util.Scanner;

public class gioi1 {

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tử số số thứ nhất: ");
        int firstNumerator = sc.nextInt();
        System.out.print("Nhập mẫu số số thứ nhất: ");
        int firstDenominator = sc.nextInt();

        System.out.print("Nhập tử số số thứ 2: ");
        int secondNumerator = sc.nextInt();
        System.out.print("Nhập mẫu số số thứ 2: ");
        int secondDenominator = sc.nextInt();

        if (firstDenominator == 0 || secondDenominator == 0) {
            System.out.println("Mẫu số không thể bằng 0!");
            sc.close();
            return;
        }

        int resultNumerator = firstNumerator * secondDenominator + secondNumerator * firstDenominator;
        int resultDenominator = firstDenominator * secondDenominator;

        if (resultDenominator < 0) {
            resultNumerator = -resultNumerator;
            resultDenominator = -resultDenominator;
        }

        int gcdValue = gcd(resultNumerator, resultDenominator);

        int simplifiedNumerator = resultNumerator / gcdValue;
        int simplifiedDenominator = resultDenominator / gcdValue;

        System.out.println("\n" + "--- Result ---");
        System.out.println("Fraction: " + resultNumerator + "/" + resultDenominator);
        System.out.println("Simplified fraction: " + simplifiedNumerator + "/" + simplifiedDenominator);

        sc.close();
    }
}
