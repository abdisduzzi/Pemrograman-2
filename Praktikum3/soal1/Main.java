package soal1;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner duzz = new Scanner(System.in);
        int jumlahdadu = duzz.nextInt();

        LinkedList<Dadu> daduList = new LinkedList<>();

        for (int i = 1; i <= jumlahdadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
        }

        int totalNilaiDadu = 0;
        for (Dadu dadu : daduList) {
            totalNilaiDadu += dadu.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilaiDadu);
    }
}