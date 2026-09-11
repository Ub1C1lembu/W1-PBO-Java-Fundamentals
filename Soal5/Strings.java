
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String A = sc.next();
            String B = sc.next();

            // 1. Jumlah panjang string A dan B
            System.out.println(A.length() + B.length());

            // 2. Bandingkan A dan B secara leksikografis
            if (A.compareTo(B) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            // 3. Kapitalisasi huruf pertama string A dan B
            String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(capA + " " + capB);
        }
    }
}
