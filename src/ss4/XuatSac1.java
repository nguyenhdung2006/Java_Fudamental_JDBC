package ss4;

import java.util.Scanner;

public class XuatSac1 {

    static int linearSearch (double[] a, double x) {

        int n = a.length;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                return i;
            }
        }

        return -1;
    }

    static int binarySearch(double[] a, double x) {

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    static void bubbleSort (double[] a) {

        int n = a.length;

        if (n < 2) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    static void bubbleSortDesc (double[] a) {

        int n = a.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    static void swap (double[] a, int i, int j) {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static String averageScore (double[] a) {

        int n = a.length;
        double sum = 0;

        for (double v : a) {
            sum += v;
        }

        double average = sum / n;

        return String.format("%.2f", average);
    }

    static String maxScore (double[] a) {

        double maxValue = Double.MIN_VALUE;

        for (double v : a) {
            if (v > maxValue) {
                maxValue = v;
            }
        }

        return String.format("%.2f", maxValue);
    }

    static String minScore (double[] a) {

        double minValue = Double.MAX_VALUE;

        for (double v : a) {
            if (v < minValue) {
                minValue = v;
            }
        }

        return String.format("%.2f", minValue);
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số sinh viên: ");
        int n = sc.nextInt();

        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Điểm của sinh viên thứ " + (i + 1) + ": ");
            array[i] = sc.nextDouble();
        }

        System.out.println("--- Quản lý điểm sinh viên ---");
        System.out.println("1. Xem tất cả điểm ");
        System.out.println("2. Sắp xếp điểm");
        System.out.println("3. Tìm kiếm điểm");
        System.out.println("4. Thống kê điểm");
        System.out.println("5. Thoát");

        System.out.print("Lựa chọn của bạn: ");
        int choose = sc.nextInt();

        if (choose == 1) {
            System.out.println("Danh sách điểm:");

            for (int i = 0; i < n; i++) {
                System.out.println("Sinh viên " + (i + 1) + ": " + array[i]);
            }
        }

        if (choose == 2) {
            System.out.println("Chọn cách sắp xếp:");
            System.out.println("1. Tăng dần");
            System.out.println("2. Giảm dần");

            int chooseASortingMethod = sc.nextInt();

            if (chooseASortingMethod == 1) {
                bubbleSort(array);
                System.out.println("Đã sắp xếp tăng dần.");
            }

            if (chooseASortingMethod == 2) {
                bubbleSortDesc(array);
                System.out.println("Đã sắp xếp giảm dần.");
            }
        }

        if (choose == 3) {
            System.out.print("Nhập điểm cần tìm: ");
            double x = sc.nextDouble();

            int index1 = linearSearch(array, x);
            System.out.println("Tìm kiếm tuyến tính: Tìm thấy tại vị trí " + index1);

            bubbleSort(array);
            int index2 = binarySearch(array, x);
            System.out.println("Tìm kiếm nhị phân (mảng tăng dần): Tìm thấy tại vị trí " + index2);
        }

        if (choose == 4) {
            String average = averageScore(array);
            System.out.println("Điểm trung bình: " + average);

            String highestScore = maxScore(array);
            System.out.println("Điểm cao nhất: " + highestScore);

            String lowestScore = minScore(array);
            System.out.println("Điểm thấp nhất: " + lowestScore);

            int count = 0;
            double avg = Double.parseDouble(average);
            for (int i = 0; i < n; i++) {
                if (array[i] > avg) {
                    count++;
                }
            }
            System.out.println("Số sinh viên có điểm trên trung bình: " + count);
        }

        if (choose == 5) {
            System.out.println("Thoát chương trình.");
            return;
        }

        if (choose < 1 || choose > 5) {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }

        sc.close();
    }
}
