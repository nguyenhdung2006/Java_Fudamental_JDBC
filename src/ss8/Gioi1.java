package ss8;

import java.text.DecimalFormat;

class CurrencyConverter {

    private static double rate = 26000;

    private CurrencyConverter() {
    }

    public static void setRate(double r) {

        if (r <= 0) {
            System.out.println("Ty gia khong hop le!");
            return;
        }

        rate = r;
    }

    public static double getRate() {
        return rate;
    }

    public static double toUSD(int vnd) {

        if (vnd < 0) {
            System.out.println("So tien khong hop le!");
            return 0;
        }

        return vnd / rate;
    }

    public static String formatUSD(double usd) {

        DecimalFormat df = new DecimalFormat("#,##0.00");

        return df.format(usd) + " USD";
    }
}

public class Gioi1 {

    public static void main(String[] args) {

        CurrencyConverter.setRate(26000);

        double usd = CurrencyConverter.toUSD(520000);

        System.out.println("Ty gia: " + CurrencyConverter.getRate());

        System.out.println("USD: " +
                CurrencyConverter.formatUSD(usd));
    }
}
