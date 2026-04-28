package ss4;

import java.util.Scanner;

public class Kha1 {

    public static void bubbleSort (int[] a) {
        if (a == null || a.length < 2) return;

        for (int i = 0; i < a.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        bubbleSort(array);

        System.out.print("Mảng sau khi được sắp xếp giảm dần: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
