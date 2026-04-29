package ss4;

import java.util.Scanner;

public class Gioi2 {

    static void stablePartition (int[] a) {

        int n = a.length;

        for (int i = 0; i < n; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1; j++) { // Nếu dùng a[j + 1] thì vòng lặp phải j < n - 1, vì khi j = n - 1 thì j + 1 = n sẽ vượt mảng.
                if (a[j] % 2 != 0 && a[j + 1] % 2 == 0) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) { // !swapped == true
                break;
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        stablePartition(array);

        for (int x : array) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
