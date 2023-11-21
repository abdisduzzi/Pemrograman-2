package soal1;
import java.util.Scanner;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String n, String r) {
        this.nama = n;
        this.ras = r;
    }

    public static HewanPeliharaan scanHewan() {
        Scanner duzz = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String nama = duzz.nextLine();
        System.out.print("Ras: ");
        String ras = duzz.nextLine();

        return new HewanPeliharaan(nama, ras);
    }

    void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama Hewan Peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}