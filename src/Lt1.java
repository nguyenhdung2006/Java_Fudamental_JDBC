import java.util.Scanner;

public class Lt1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tên khách hàng: ");
        String name = sc.nextLine();

        System.out.print("Sản phẩm: ");
        String productName = sc.nextLine();

        System.out.print("Giá: ");
        double price = sc.nextDouble();

        System.out.print("Số lượng: ");
        int quantity = sc.nextInt();

        System.out.print("Thẻ thành viên: ");
        boolean isMember = sc.nextBoolean();

        System.out.println("Khách hàng: " + name);
        System.out.println("Sản phẩm: " + productName);
        System.out.println("Giá: " + price + " VNĐ");
        System.out.println("Số lượng " + quantity);

        double totalPrice = price * quantity;
        System.out.println("Thành tiền: " + totalPrice + " VNĐ");

        double discount = totalPrice * 0.1;
        if (isMember) {
            System.out.println("Giảm giá: " + discount + " VNĐ");
        } else {
            System.out.println("Giảm giá: 0 VNĐ");
            discount = 0;
        }

        double VAT = totalPrice * 0.08;
        System.out.println("Tiền VAT: " + VAT);

        double totalPayment = totalPrice - discount + VAT;
        System.out.println("Tổng tiền thanh toán: " + totalPayment + " VNĐ");

        sc.close()
    }
}
