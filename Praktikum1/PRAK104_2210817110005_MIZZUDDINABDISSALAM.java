import java.util.Scanner;
public class PRAK104_2210817110005_MIZZUDDINABDISSALAM {
    public static void main(String[] args) {
        Scanner duzz = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String tanganabu1 = duzz.next();
        String tanganabu2 = duzz.next();
        String tanganabu3 = duzz.next();

        System.out.print("Tangan Bagas: ");
        String tanganbagas1 = duzz.next();
        String tanganbagas2 = duzz.next();
        String tanganbagas3 = duzz.next();

        int skor_Abu = 0;
        int skor_Bagas = 0;

        if (tanganabu1.equals(tanganbagas1)) {
        } else if ((tanganabu1.equals("B") && tanganbagas1.equals("G")) ||
                (tanganabu1.equals("G") && tanganbagas1.equals("K")) ||
                (tanganabu1.equals("K") && tanganbagas1.equals("B"))) {
            skor_Abu++;
        } else {
            skor_Bagas++;
        }
        if (tanganabu2.equals(tanganbagas2)) {
        } else if ((tanganabu2.equals("B") && tanganbagas2.equals("G")) ||
                (tanganabu2.equals("G") && tanganbagas2.equals("K")) ||
                (tanganabu2.equals("K") && tanganbagas2.equals("B"))) {
            skor_Abu++;
        } else {
            skor_Bagas++;
        }
        if (tanganabu3.equals(tanganbagas3)) {
        } else if ((tanganabu3.equals("B") && tanganbagas3.equals("G")) ||
                (tanganabu3.equals("G") && tanganbagas3.equals("K")) ||
                (tanganabu3.equals("K") && tanganbagas3.equals("B"))) {
            skor_Abu++;
        } else {
            skor_Bagas++;
        }

        if (skor_Abu > skor_Bagas) {
            System.out.println("Abu");
        } else if (skor_Bagas > skor_Abu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}