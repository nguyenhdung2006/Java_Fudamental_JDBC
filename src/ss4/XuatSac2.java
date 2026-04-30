package ss4;

import java.util.Scanner;

public class XuatSac2 {

    static void insertionSort (double[] a) {

        for (int i = 1; i < a.length; i++) {
            double key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
    }

    static int linearSearch (double[] a, double x) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }

        return -1;
    }

    static double sumSalaries (double[] a) {

        double sum = 0;

        for (double v : a) {
            sum += v;
        }

        return sum;
    }

    static String averageSalaries (double[] a) {

        double sum = sumSalaries(a);

        double avg = sum / a.length;

        return String.format("%.2f", avg);
    }

    static double minSalaries (double[] a) {

        double minValue = Double.MAX_VALUE;

        for (double x : a) {
            if (x < minValue) {
                minValue = x;
            }
        }

        return minValue;
    }

    static double maxSalaries (double[] a) {

        double maxValue = Double.MIN_VALUE;

        for (double x : a) {
            if (x > maxValue) {
                maxValue = x;
            }
        }

        return maxValue;
    }

    static int countAboveAverage (double[] a) {

        String res = averageSalaries(a);
        double avg = Double.parseDouble(res);
        int count = 0;

        for (double x : a) {
            if (x > avg) {
                count++;
            }
        }

        return count;
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();

        double[] salaries = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập lương nhân viên thứ " + (i + 1) + ": ");
            salaries[i] = sc.nextDouble();
        }

        System.out.println("--- QUẢN LÝ LƯƠNG NHÂN VIÊN ---");
        System.out.println("1. Xem danh sách lương");
        System.out.println("2. Sắp xếp lương");
        System.out.println("3. Tìm kiếm lương cụ thể");
        System.out.println("4. Thống kê lương");
        System.out.println("5. Thoát");

        System.out.print("Lựa chọn của bạn: ");
        int choose = sc.nextInt();

        if (choose == 1) {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhân viên " + (i + 1) + " nhận lương: " + salaries[i]);
            }
        }

        if (choose == 2) {
            insertionSort(salaries);

            System.out.print("Hiển thị mảng sắp xếp tăng dần: ");
            for (int i = 0; i < n; i++) {
                System.out.print(salaries[i] + " ");
            }
        }

        if (choose == 3) {
            System.out.print("Nhập vào giá trị cần tìm: ");
            double x = sc.nextDouble();

            int index = linearSearch(salaries, x);
            if (index == -1) {
                System.out.println("Không tìm thấy");
            } else {
                System.out.println("Tìm thấy tại vị trí " + index);
            }
        }

        if (choose == 4) {
            System.out.println("Tổng lương: " + sumSalaries(salaries));
            System.out.println("Lương trung bình: " + averageSalaries(salaries));
            System.out.println("Lương cao nhất: " + maxSalaries(salaries));
            System.out.println("Lương thấp nhất: " + minSalaries(salaries));
            System.out.println("Số nhân viên có lương trung bình: " + countAboveAverage(salaries));
        }

        if (choose == 5) {
            System.out.println("Kết thúc chương trình.");
            return;
        }

        if (choose < 1 || choose > 5) {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }

        sc.close();
    }
}
