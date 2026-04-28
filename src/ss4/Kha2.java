package ss4;

import java.util.Scanner;

public class Kha2 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hàng của mảng: ");
        int row = sc.nextInt();

        System.out.print("Nhập số cột của mảng: ");
        int column = sc.nextInt();

        int[][] array = new int[row][column];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print("Phần tử [" + r + "][" + c + "]: ");
                array[r][c] = sc.nextInt();
            }
        }

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] % 2 == 0) {
                    sumEven += array[i][j];
                } else {
                    sumOdd += array[i][j];
                }
            }
        }

        System.out.println("Tổng các số chẵn: " + sumEven);
        System.out.println("Tổng các số lẻ: " + sumOdd);

        sc.close();
    }
}
