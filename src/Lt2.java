import java.util.Scanner;

public class Lt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        int count = 0;
        double sum = 0;
        double max = -1;
        double min = 11;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập điểm (-1 để kết thúc): ");
                        double score = sc.nextDouble();

                        if (score == -1) {
                            break;
                        }

                        if (score < 0 || score > 10) {
                            System.out.println("Điểm không hợp lệ! Nhập lại (0-10)");
                            continue;
                        }

                        if (score < 5) {
                            System.out.println("Yếu");
                        } else if (score < 7) {
                            System.out.println("Trung Bình");
                        } else if (score < 8) {
                            System.out.println("Khá");
                        } else if (score < 9) {
                            System.out.println("Giỏi");
                        } else {
                            System.out.println("Xuất sắc");
                        }

                        count++;
                        sum += score;

                        if (score > max) {
                            max = score;
                        }
                        if (score < min) {
                            min = score;
                        }
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("Số học viên: " + count);
                        System.out.println("Điểm trung bình: " + (sum / count));
                        System.out.println("Điểm cao nhất: " + max);
                        System.out.println("Điểm thấp nhất: " + min);
                    }
                    break;

                case 3:
                    System.out.println("Kết thúc chương trình!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}