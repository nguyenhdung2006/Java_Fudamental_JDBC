package ss4;

import java.util.Scanner;

public class Gioi1 {

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static int binarySearch(int[] a, int x) {

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

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int num = sc.nextInt();

        int[] array = new int[num];

        System.out.println("Nhập vào các phần tử mảng:");
        for (int i = 0; i < num; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        selectionSort(array);

        System.out.print("Mảng sau khi sắp xếp giảm dần: ");
        for (int i = num - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n" + "Nhập số cần tìm: ");
        int x = sc.nextInt();

        int variable1 = linearSearch(array, x);
        int variable2 = binarySearch(array, x);
        System.out.print("Tìm kiếm số tuyến tính: Số " + x + " có tại vị trí " + variable1);
        System.out.print("\nTìm kiếm số tuyến tính: Số " + x + " có tại vị trí " + variable2);

        sc.close();
    }
}
