import java.util.Random;
import java.util.Scanner;

public class Gioi2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";

        Random random = new Random();

        StringBuilder result = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(chars.length());
            result.append(chars.charAt(index));
        }

        System.out.println(result.toString());

        sc.close();
    }
}