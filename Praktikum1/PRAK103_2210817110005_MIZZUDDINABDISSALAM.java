import java.util.Scanner;
public class PRAK103_2210817110005_MIZZUDDINABDISSALAM {
    public static void main(String[] args) {
        Scanner duzz = new Scanner(System.in);
        System.out.print(" ");
        int jumlah_deret = duzz.nextInt();
        System.out.print("");
        int angka_awal = duzz.nextInt();
        int i = 0;
        do {
            if (angka_awal % 2 == 1) {
                System.out.print(angka_awal);
                if (i < jumlah_deret - 1) {
                    System.out.print(", ");
                }
                i++;
            }
            angka_awal++;
        } while (i < jumlah_deret);

    }
}