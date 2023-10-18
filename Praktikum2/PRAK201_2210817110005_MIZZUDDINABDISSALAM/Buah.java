package PRAK201_2210817110005_MIZZUDDINABDISSALAM;

public class Buah {
    String Nama;
    double Berat;
    double Harga;
    double Jumlah_Beli;
    double Harga_Sebelum_Diskon;
    double Diskon;
    double Harga_Setelah_Diskon;
    public Buah(String Nama, double Berat, double Harga,double Jumlah_Beli, double Harga_Before){
        this.Nama=Nama;
        this.Berat=Berat;
        this.Harga=Harga;
        this.Harga_Sebelum_Diskon=Harga_Before;
        this.Jumlah_Beli=Jumlah_Beli;
        this.Diskon = (Math.floor(Jumlah_Beli/4) *0.02* Harga*4);
        this.Harga_Setelah_Diskon=Harga_Sebelum_Diskon-Diskon;

    }
    void HasilBuah(){
        System.out.println("Nama buah : "+ Nama);
        System.out.println("Berat : "+ Berat);
        System.out.println("Harga : "+ Harga);
        System.out.println("Jumlah Beli  : " + Jumlah_Beli + "Kg");
        System.out.printf("Harga sebelum diskon  :Rp%.2f\n",Harga_Sebelum_Diskon);
        System.out.println("Total Diskon: Rp." + Diskon);
        System.out.printf("Harga setelah diskon  :Rp%.2f\n",Harga_Setelah_Diskon);
        System.out.println(" ");

    }
}