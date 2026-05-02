public class Kha2 {

    public static void main(String[] args) {
        int n = 1_000_000;

        long start1 = System.currentTimeMillis();

        String s = "Hello";
        for (int i = 0; i < n; i++) {
            s += " World";
        }

        long end1 = System.currentTimeMillis();
        System.out.println("Thời gian với String: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < n; i++) {
            sb.append(" World");
        }

        long end2 = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuilder: " + (end2 - start2) + " ms");

        // ===== StringBuffer =====
        long start3 = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < n; i++) {
            sbf.append(" World");
        }

        long end3 = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuffer: " + (end3 - start3) + " ms");
    }
}