package lt56;

import java.util.Arrays;
import java.util.Scanner;

public class lt1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] scores = new double[100];

        int size = 0;

        int choice;

        do {
            System.out.println("***************QUAN LY DIEM SV****************");
            System.out.println("1. Nhap danh sach diem sinh vien");
            System.out.println("2. In danh sach diem");
            System.out.println("3. Tinh diem trung binh cua cac sinh vien");
            System.out.println("4. Tim diem cao nhat va thap nhat");
            System.out.println("5. Dem so luong sinh vien dat va truot");
            System.out.println("6. Sap xep diem tang dan");
            System.out.println("7. Thong ke so luong sinh vien gioi va xuat sac");
            System.out.println("8. Thoat");
            System.out.print("Lua chon cua ban: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Nhap so luong sinh vien: ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhap diem sinh vien thu " + (i + 1) + ": ");
                        scores[size] = sc.nextDouble();

                        size++;
                    }

                    break;

                case 2:

                    if (size == 0) {
                        System.out.println("Danh sach rong");
                    } else {
                        System.out.println("Danh sach diem:");

                        for (int i = 0; i < size; i++) {
                            System.out.println(scores[i]);
                        }
                    }

                    break;

                case 3:

                    if (size == 0) {
                        System.out.println("Chua co du lieu");
                    } else {
                        double sum = 0;

                        for (int i = 0; i < size; i++) {
                            sum += scores[i];
                        }

                        double avg = sum / size;

                        System.out.println("Diem trung binh: " + avg);
                    }

                    break;
                case 4:

                    if (size == 0) {
                        System.out.println("Chua co du lieu");
                    } else {
                        double max = scores[0];
                        double min = scores[0];

                        for (int i = 1; i < size; i++) {
                            if (scores[i] > max) {
                                max = scores[i];
                            }

                            if (scores[i] < min) {
                                min = scores[i];
                            }
                        }

                        System.out.println("Diem cao nhat: " + max);
                        System.out.println("Diem thap nhat: " + min);
                    }

                    break;

                case 5:
                    int pass = 0;
                    int fail = 0;

                    for (int i = 0; i < size; i++) {
                        if (scores[i] >= 5) {
                            pass++;
                        } else {
                            fail++;
                        }
                    }

                    System.out.println("So sinh vien dat: " + pass);
                    System.out.println("So sinh vien truot: " + fail);

                    break;

                case 6:

                    Arrays.sort(scores, 0, size);

                    System.out.println("Da sap xep diem tang dan");

                    break;

                case 7:

                    int gioi = 0;
                    int xuatSac = 0;

                    for (int i = 0; i < size; i++) {
                        if (scores[i] >= 8 && scores[i] < 9) {
                            gioi++;
                        }

                        if (scores[i] >= 9) {
                            xuatSac++;
                        }
                    }

                    System.out.println("So sinh vien gioi: " + gioi);
                    System.out.println("So sinh vien xuat sac: " + xuatSac);

                    break;

                case 8:
                    System.out.println("Ket thuc chuong trinh");

                    break;

                default:

                    System.out.println("Lua chon khong hop le");
            }

            System.out.println();
        } while (choice != 8);

        sc.close();
    }
}
