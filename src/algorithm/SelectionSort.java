package algorithm;

//không hiệu quả cho dữ liệu lớn hoặc gần như đã được sắp xếp
//Tốt nhất, trung bình, và xấu nhất: O(n²)
public class SelectionSort {

    public static void selectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);

    }
}
