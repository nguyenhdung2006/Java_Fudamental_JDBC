package ss2;

import java.util.Scanner;

public class kha2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào tháng: ");
        int month = sc.nextInt();

        System.out.print("Nhập vào năm: ");
        int year = sc.nextInt();

        String result = switch (month) {

            case 1, 3, 5, 7, 8, 10, 12 -> "Tháng " + month + " có 31 ngày.";

            case 4, 6, 9, 11 -> "Tháng " + month + " có 30 ngày.";

            case 2 -> {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    yield "Tháng 2 có 29 ngày (năm nhuận).";
                } else {
                    yield "Tháng 2 có 28 ngày.";
                }
            }

            default -> "Tháng không hợp lệ.";
        };

        System.out.println(result);

        sc.close();
    }
}
