package PRAK203_2210817110005_MIZZUDDINABDISSALAM;
//Pada baris ini terdapat error dikarenakan nama classnya tidak sesuai dengan nama filenya, maka disesuaikan dengan nama file yang benar yaitu 'Pegawai'
//public class Employee {
public class Pegawai {
    public String nama;
    //Pada baris ini terdapat error dikarenakan menggunakan tipe data yang salah, seharusnya menggunakan tipe data 'String'
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //Pada baris ini terdapat error dikarenakan tidak terdapat parameter pada method, maka dideklarasikan lah variable 'String j'
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}