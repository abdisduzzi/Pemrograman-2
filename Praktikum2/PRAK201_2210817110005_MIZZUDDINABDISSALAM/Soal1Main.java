package PRAK201_2210817110005_MIZZUDDINABDISSALAM;

public class Soal1Main {
    public static void main(String[] args) {
        Buah Apel = new Buah("Apel", 0.4, 7000.0, 40.0, 700000);
        Buah Mangga = new Buah("Mangga", 0.2, 3500.0, 15.0, 262500);
        Buah Alpukat = new Buah("Alpukat", 0.25, 10000.0, 12.0, 480000);

        Apel.HasilBuah();
        Mangga.HasilBuah();
        Alpukat.HasilBuah();
    }
}