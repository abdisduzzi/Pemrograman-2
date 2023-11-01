package soal2;
import java.util.HashMap;
class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private String tanggalMerdeka;
    private int bulanMerdeka;
    private int tahunMerdeka;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalMerdeka = "";
        this.bulanMerdeka = 0;
        this.tahunMerdeka = 0;
    }

    public void setTanggalKemerdekaan(int tanggal, int bulan, int tahun) {
        this.tanggalMerdeka = tanggal + " " + getBulanKemerdekaan(bulan) + " " + tahun;
        this.bulanMerdeka = bulan;
        this.tahunMerdeka = tahun;
    }

    private String getBulanKemerdekaan(int bulan) {
        HashMap<Integer, String> month = new HashMap<>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        return month.get(bulan);
    }

    public String toString() {
        if (jenisKepemimpinan.equals("monarki")) {
            return "Negara " + nama + " mempunyai Raja bernama " + namaPemimpin + "\n";
        } else {
            return "Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin + "\nDeklarasi Kemerdekaan pada Tanggal " + tanggalMerdeka + "\n";
        }
    }
}