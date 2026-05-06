import java.util.Scanner;

public class XuatSac1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "";
        int choice;

        do {

            System.out.println("************************ MENU ************************");
            System.out.println("1. Nhap chuoi");
            System.out.println("2. Dem so ky tu thuong, hoa, so, dac biet");
            System.out.println("3. Dao nguoc chuoi");
            System.out.println("4. Kiem tra Palindrome");
            System.out.println("5. Chuan hoa chuoi");
            System.out.println("6. Thoat");
            System.out.println("******************************************************");
            System.out.print("Lua chon cua ban: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Nhap chuoi: ");
                    str = sc.nextLine();

                    break;

                case 2:

                    int lower = 0;
                    int upper = 0;
                    int digit = 0;
                    int special = 0;

                    for (int i = 0; i < str.length(); i++) {

                        char c = str.charAt(i);

                        if (Character.isLowerCase(c)) {
                            lower++;
                        }
                        else if (Character.isUpperCase(c)) {
                            upper++;
                        }
                        else if (Character.isDigit(c)) {
                            digit++;
                        }
                        else {
                            special++;
                        }
                    }

                    System.out.println("Chu thuong: " + lower);
                    System.out.println("Chu hoa: " + upper);
                    System.out.println("Chu so: " + digit);
                    System.out.println("Ky tu dac biet: " + special);

                    break;

                case 3:

                    String reverse = "";

                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }

                    System.out.println("Chuoi dao nguoc: " + reverse);

                    break;

                case 4:

                    String check = str.toLowerCase().replaceAll("\\s+", "");

                    String reversed = "";

                    for (int i = check.length() - 1; i >= 0; i--) {
                        reversed += check.charAt(i);
                    }

                    if (check.equals(reversed)) {
                        System.out.println("Chuoi la Palindrome");
                    }
                    else {
                        System.out.println("Chuoi khong phai Palindrome");
                    }

                    break;

                case 5:

                    str = str.trim().replaceAll("\\s+", " ");

                    if (str.length() > 0) {

                        str = Character.toUpperCase(str.charAt(0))
                                + str.substring(1);
                    }

                    System.out.println("Chuoi sau khi chuan hoa: " + str);

                    break;

                case 6:

                    System.out.println("Ket thuc chuong trinh");

                    break;

                default:

                    System.out.println("Lua chon khong hop le");
            }

            System.out.println();

        } while (choice != 6);

        sc.close();
    }
}