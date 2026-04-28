package algorithm;

//hoạt động tốt với danh sách nhỏ hoặc gần như đã được sắp xếp
//Tốt nhất: O(n) (Khi mảng đã được sắp xếp sẵn)
//Trung bình và xấu nhất: O(n²) (Khi mảng ngược thứ tự hoàn toàn)
public class InsertionSort {

    public static void insertionSort (int[] a) {

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--; // j = -1
            }

            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1};

        insertionSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
