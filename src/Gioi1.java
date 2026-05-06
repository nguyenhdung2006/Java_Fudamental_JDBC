import java.util.Scanner;

public class Gioi1 {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập password: ");
        String password = sc.nextLine();

        boolean isValid = password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,}$");

        if (isValid) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }

        sc.close();
    }
}
