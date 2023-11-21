package soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner duzz = new Scanner(System.in);

        System.out.println("Pilih jenis hewan peliharaan:");
        System.out.println("1. Kucing");
        System.out.println("2. Anjing");
        System.out.print("Masukkan pilihan: ");

        int pilihan = duzz.nextInt();
        if (pilihan == 1) {
            duzz.nextLine();
            System.out.print("Nama hewan peliharaan: ");
            String nama = duzz.nextLine();
            System.out.print("Ras: ");
            String ras = duzz.nextLine();
            System.out.print("Warna bulu: ");
            String warnaBulu = duzz.nextLine();
            Kucing k = new Kucing(nama, ras, warnaBulu);
            k.displayDetailKucing();
        } else if (pilihan == 2) {
            duzz.nextLine();
            System.out.print("Nama hewan peliharaan: ");
            String nama = duzz.nextLine();
            System.out.print("Ras: ");
            String ras = duzz.nextLine();
            System.out.print("Warna bulu: ");
            String warnaBulu = duzz.nextLine();
            System.out.print("Kemampuan: ");
            String[] kemampuan = new String[]{duzz.nextLine()};
            Anjing a = new Anjing(nama, ras, warnaBulu, kemampuan);
            a.displayDetailAnjing();
        }
    }
}