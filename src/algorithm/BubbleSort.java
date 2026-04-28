package algorithm;

import java.util.Arrays;

public class BubbleSort {

    // mỗi vòng duyệt số lớn nhất đều ở cuối
    public static void bubbleSort(int[] a) {
        if (a == null || a.length < 2) return;

        for (int i = 0; i < a.length - 1; i++) {

            boolean swapped = false; // tối ưu

            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }

            // nếu không có swap → mảng đã sorted
            if (!swapped) break;
        }
    }

    // tách riêng hàm swap (clean hơn)
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 2, 5, 1};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}

// cách thông thường
//public static void bubbleSort(int[] a) {
//
//    for (int i = 0; i < a.length - 1; i++) {
//        for (int j = 0; j < a.length - i - 1; j++) {
//
//            if (a[j] > a[j + 1]) {
//                int temp = a[j];
//                a[j] = a[j + 1];
//                a[j + 1] = temp;
//            }
//
//        }
//    }
//}