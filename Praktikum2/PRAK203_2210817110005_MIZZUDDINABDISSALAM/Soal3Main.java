package PRAK203_2210817110005_MIZZUDDINABDISSALAM;

public class Soal3Main {
    public static void main(String[] args){
        Pegawai p1 = new Pegawai();
        //Pada baris ini terdapat error dikarenakan kurangnya titik koma(;)
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan ("Assasin");
        //Pada baris ini ditambahkan p1.umur = 17; sehingga dapat sesuai dan dapat menampilkan output pada "System.out.println("Umur: " + p1.umur + " tahun");"
        p1.umur = 17;

        //Pada baris ini tidak diperlukan kata 'Pegawai' pada outputnya, jadi karakter tersebut dihapuskan
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Pada baris ini diperlukan kata 'tahun' pada outputnya, jadi ditambahkan " tahun" di akhir
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}