import java.util.Scanner;
public class PRAK102_2210817110005_MIZZUDDINABDISSALAM {
    public static void main(String[] args) {
        Scanner duzz = new Scanner(System.in);
        int angka_awal, deret, jumlah_deret = 10;
        angka_awal = duzz.nextInt();

        int i = 0;
        while (i <= jumlah_deret) {
            if (angka_awal % 5 == 0) {
                deret = angka_awal / 5 - 1;
                System.out.print(deret);
                if(i < 10) System.out.print(", ");
            } else {
                deret = angka_awal;
                System.out.print(deret);
                if(i < 10) System.out.print(", ");
            }
            angka_awal++;
            i++;
        }
    }
}




