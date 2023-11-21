package soal2;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing(String n, String r, String warnaBulu) {
        super.nama = n;
        super.ras = r;
        this.warnaBulu = warnaBulu;
    }

    public void displayDetailKucing() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}