package ss2;

import java.util.Scanner;

public class XuatSac1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên (100-999): ");
        int n = sc.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Số nhập vào không hợp lệ");
            return;
        }

        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;

        String result = "";

        switch (hundreds) {
            case 1: result += "Một trăm "; break;
            case 2: result += "Hai trăm "; break;
            case 3: result += "Ba trăm "; break;
            case 4: result += "Bốn trăm "; break;
            case 5: result += "Năm trăm "; break;
            case 6: result += "Sáu trăm "; break;
            case 7: result += "Bảy trăm "; break;
            case 8: result += "Tám trăm "; break;
            case 9: result += "Chín trăm "; break;
        }

        switch (tens) {
            case 0:
                if (units != 0) result += "lẻ ";
                break;
            case 1:
                result += "mười ";
                break;
            case 2: result += "hai mươi "; break;
            case 3: result += "ba mươi "; break;
            case 4: result += "bốn mươi "; break;
            case 5: result += "năm mươi "; break;
            case 6: result += "sáu mươi "; break;
            case 7: result += "bảy mươi "; break;
            case 8: result += "tám mươi "; break;
            case 9: result += "chín mươi "; break;
        }

        switch (units) {
            case 1:
                if (tens > 1) result += "mốt";
                else result += "một";
                break;
            case 2: result += "hai"; break;
            case 3: result += "ba"; break;
            case 4: result += "bốn"; break;
            case 5:
                if (tens >= 1) result += "lăm";
                else result += "năm";
                break;
            case 6: result += "sáu"; break;
            case 7: result += "bảy"; break;
            case 8: result += "tám"; break;
            case 9: result += "chín"; break;
        }

        System.out.println(result.trim());
    }
}