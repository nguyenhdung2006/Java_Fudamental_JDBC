package lt56;

import java.util.Scanner;

public class lt2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fullName = "";
        String email = "";
        String phone = "";
        String password = "";

        int choice;

        do {

            System.out.println("**************** QUAN LY NGUOI DUNG ****************");
            System.out.println("1. Nhap thong tin nguoi dung");
            System.out.println("2. Chuan hoa ho ten");
            System.out.println("3. Kiem tra email hop le");
            System.out.println("4. Kiem tra so dien thoai hop le");
            System.out.println("5. Kiem tra mat khau hop le");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Nhap ho ten: ");
                    fullName = sc.nextLine();

                    System.out.print("Nhap email: ");
                    email = sc.nextLine();

                    System.out.print("Nhap so dien thoai: ");
                    phone = sc.nextLine();

                    System.out.print("Nhap mat khau: ");
                    password = sc.nextLine();

                    break;

                case 2:

                    fullName = fullName.trim().replaceAll("\\s+", " ");

                    String[] words = fullName.split(" ");

                    String result = "";

                    for (int i = 0; i < words.length; i++) {

                        String word = words[i];

                        result += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();

                        if (i != words.length - 1) {
                            result += " ";
                        }
                    }

                    fullName = result;

                    System.out.println("Ho ten sau chuan hoa: " + fullName);

                    break;

                case 3:

                    if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

                        System.out.println("Email hop le");
                    } else {

                        System.out.println("Email khong hop le");
                    }

                    break;

                case 4:

                    if (phone.matches("^0\\d{9}$")) {

                        System.out.println("So dien thoai hop le");
                    } else {

                        System.out.println("So dien thoai khong hop le");
                    }

                    break;

                case 5:

                    boolean hasUpper = password.matches(".*[A-Z].*");
                    boolean hasLower = password.matches(".*[a-z].*");
                    boolean hasDigit = password.matches(".*\\d.*");
                    boolean hasSpecial = password.matches(".*[@#$%^&+=!].*");

                    if (password.length() >= 8 && hasUpper && hasLower && hasDigit && hasSpecial) {

                        System.out.println("Mat khau hop le");
                    } else {
                        System.out.println("Mat khau khong hop le");
                    }

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