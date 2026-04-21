import java.util.Scanner;

public class Lt3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] salary = new double[100];
        int count = 0;

        while (true) {
            System.out.println("\n1. Nhập lương");
            System.out.println("2. Thống kê");
            System.out.println("3. Tính thưởng");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                while (true) {
                    System.out.print("Nhập lương (-1 để dừng): ");
                    double s = sc.nextDouble();

                    if (s == -1) break;

                    if (s < 0 || s > 500000000) {
                        System.out.println("Lương không hợp lệ");
                        continue;
                    }

                    salary[count] = s;
                    count++;

                    if (s < 5000000) {
                        System.out.println("Thu nhập thấp");
                    } else if (s <= 15000000) {
                        System.out.println("Thu nhập trung bình");
                    } else if (s <= 50000000) {
                        System.out.println("Thu nhập khá");
                    } else {
                        System.out.println("Thu nhập cao");
                    }
                }
            }

            else if (choice == 2) {
                if (count == 0) {
                    System.out.println("Chưa có dữ liệu");
                } else {
                    double sum = 0;
                    double max = salary[0];
                    double min = salary[0];

                    for (int i = 0; i < count; i++) {
                        sum += salary[i];
                        if (salary[i] > max) max = salary[i];
                        if (salary[i] < min) min = salary[i];
                    }

                    System.out.println("Số nhân viên: " + count);
                    System.out.println("Tổng lương: " + sum);
                    System.out.println("Lương trung bình: " + (sum / count));
                    System.out.println("Lương cao nhất: " + max);
                    System.out.println("Lương thấp nhất: " + min);
                }
            }

            else if (choice == 3) {
                if (count == 0) {
                    System.out.println("Chưa có dữ liệu");
                } else {
                    double totalBonus = 0;

                    for (int i = 0; i < count; i++) {
                        double s = salary[i];
                        double rate;

                        if (s <= 5000000) {
                            rate = 0.05;
                        } else if (s <= 15000000) {
                            rate = 0.10;
                        } else if (s <= 50000000) {
                            rate = 0.15;
                        } else if (s <= 100000000) {
                            rate = 0.20;
                        } else {
                            rate = 0.25;
                        }

                        totalBonus += s * rate;
                    }

                    System.out.println("Tổng tiền thưởng: " + totalBonus);
                }
            }

            else if (choice == 4) {
                System.out.println("Kết thúc");
                System.exit(0);
            }

            else {
                System.out.println("Chọn sai");
            }
        }
    }
}