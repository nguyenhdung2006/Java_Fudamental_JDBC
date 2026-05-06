import java.util.Arrays;
import java.util.Scanner;

public class XuatSac2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = new String[100];

        int size = 0;

        int choice;

        do {

            System.out.println("************************ MENU ************************");
            System.out.println("1. Them ten sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim ten sinh vien chua tu khoa");
            System.out.println("4. Dem so sinh vien co ten bat dau bang chu cai");
            System.out.println("5. Sap xep danh sach ten theo thu tu A-Z");
            System.out.println("6. Thoat");
            System.out.println("******************************************************");
            System.out.print("Lua chon cua ban: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Nhap ten sinh vien: ");
                    students[size] = sc.nextLine();

                    size++;

                    System.out.println("Da them sinh vien");

                    break;

                case 2:

                    if (size == 0) {

                        System.out.println("Danh sach rong");
                    }
                    else {

                        System.out.println("Danh sach sinh vien:");

                        for (int i = 0; i < size; i++) {
                            System.out.println(students[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Nhap tu khoa: ");
                    String keyword = sc.nextLine().toLowerCase();

                    boolean found = false;

                    System.out.println("Ket qua tim kiem:");

                    for (int i = 0; i < size; i++) {

                        if (students[i].toLowerCase().contains(keyword)) {

                            System.out.println(students[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Khong tim thay");
                    }

                    break;

                case 4:

                    System.out.print("Nhap chu cai: ");
                    char ch = Character.toLowerCase(sc.nextLine().charAt(0));

                    int count = 0;

                    for (int i = 0; i < size; i++) {

                        if (!students[i].isEmpty() &&
                                Character.toLowerCase(students[i].charAt(0)) == ch) {

                            count++;
                        }
                    }

                    System.out.println("So sinh vien: " + count);

                    break;

                case 5:

                    Arrays.sort(students, 0, size);

                    System.out.println("Da sap xep danh sach");

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