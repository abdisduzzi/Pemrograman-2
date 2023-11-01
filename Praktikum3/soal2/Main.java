package soal2;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner duzz = new Scanner(System.in);
        int jumlahNegara = duzz.nextInt();
        duzz.nextLine();

        LinkedList<Negara> negaraList = new LinkedList<>();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = duzz.nextLine();
            String jenisKepemimpinan = duzz.nextLine();
            String namaPemimpin = duzz.nextLine();

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin);

            if (!jenisKepemimpinan.equals("monarki")) {
                int tanggalMerdeka = duzz.nextInt();
                int bulanMerdeka = duzz.nextInt();
                int tahunMerdeka = duzz.nextInt();
                duzz.nextLine();
                negara.setTanggalKemerdekaan(tanggalMerdeka, bulanMerdeka, tahunMerdeka);
            }

            negaraList.add(negara);
        }

        for (Negara negara : negaraList) {
            System.out.println(negara.toString());
        }
    }
}