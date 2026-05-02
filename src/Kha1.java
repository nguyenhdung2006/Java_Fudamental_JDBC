import java.util.regex.*;
import java.util.Scanner;

public class Kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        input = input.trim();

        boolean isValid = input.matches("^[A-Za-z0-9._]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,6}$");

        if (isValid) {
            System.out.println("Email hợp lệ.");
        } else {
            System.out.println("Email không hợp lệ.");
        }

        sc.close();
    }
}