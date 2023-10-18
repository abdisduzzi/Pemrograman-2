import java.util.Scanner;
public class PRAK105_2210817110005_MIZZUDDINABDISSALAM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Makanan Favorit: ");
        String mam_fav = input.nextLine();
        System.out.print("Masukan Hobi: ");
        String hobie = input.nextLine();
        System.out.println("Aku Suka Makan " + mam_fav + ", dan Hobiku " + hobie);
    }
}