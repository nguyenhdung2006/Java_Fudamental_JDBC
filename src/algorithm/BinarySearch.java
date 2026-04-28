package algorithm;

public class BinarySearch {

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

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int x = 9;

        int result = binarySearch(a, x);

        if (result != -1) {
            System.out.println("Tim thay tai vi tri: " + result);
        } else {
            System.out.println("Khong tim thay");
        }
    }
}