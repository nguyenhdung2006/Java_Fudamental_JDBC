package lt56;

import java.util.Arrays;
import java.util.Scanner;

public class lt3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] plates = new String[100];

        int size = 0;

        int choice;

        do {

            System.out.println("**************** QUẢN LÝ BIỂN SỐ XE ****************");
            System.out.println("1. Thêm các biển số xe");
            System.out.println("2. Hiển thị danh sách biển số xe");
            System.out.println("3. Tìm kiếm biển số xe");
            System.out.println("4. Tìm biển số xe theo mã tỉnh");
            System.out.println("5. Sắp xếp biển số xe tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Nhập số lượng biển số xe: ");
                    int n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {

                        System.out.print("Nhập biển số xe thứ " + (i + 1) + ": ");

                        String plate = sc.nextLine();

                        if (plate.matches("^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$")) {

                            plates[size] = plate;
                            size++;

                            System.out.println("Đã thêm");
                        }
                        else {

                            System.out.println("Biển số không hợp lệ");
                            i--;
                        }
                    }

                    break;

                case 2:

                    if (size == 0) {

                        System.out.println("Danh sách rỗng");
                    }
                    else {

                        System.out.println("Danh sách biển số xe:");

                        for (int i = 0; i < size; i++) {

                            System.out.println(plates[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Nhập biển số cần tìm: ");
                    String searchPlate = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < size; i++) {

                        if (plates[i].equalsIgnoreCase(searchPlate)) {

                            System.out.println("Tìm thấy: " + plates[i]);

                            found = true;
                        }
                    }

                    if (!found) {

                        System.out.println("Không tìm thấy");
                    }

                    break;

                case 4:

                    System.out.print("Nhập mã tỉnh: ");
                    String code = sc.nextLine();

                    boolean check = false;

                    System.out.println("Danh sách biển số xe:");

                    for (int i = 0; i < size; i++) {

                        if (plates[i].startsWith(code)) {

                            System.out.println(plates[i]);

                            check = true;
                        }
                    }

                    if (!check) {

                        System.out.println("Không có biển số xe nào");
                    }

                    break;

                case 5:

                    Arrays.sort(plates, 0, size);

                    System.out.println("Đã sắp xếp tăng dần");

                    break;

                case 6:

                    System.out.println("Kết thúc chương trình");

                    break;

                default:

                    System.out.println("Lựa chọn không hợp lệ");
            }

            System.out.println();

        } while (choice != 6);

        sc.close();
    }
}