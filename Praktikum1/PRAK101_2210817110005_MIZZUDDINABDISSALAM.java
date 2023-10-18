import java.util.Scanner;
public class PRAK101_2210817110005_MIZZUDDINABDISSALAM {
    public static void main(String[] args) {
        String nama, tempat_lahir;
        String bulan = "";
        int tanggal_lahir, bulan_lahir, tahun_lahir, tinggi_badan ;
        float berat_badan;
        Scanner duzz = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        nama = duzz.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        tempat_lahir = duzz.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        tanggal_lahir = duzz.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        bulan_lahir = duzz.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        tahun_lahir = duzz.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        tinggi_badan = duzz.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        berat_badan = duzz.nextFloat();

        switch (bulan_lahir){
            case 1:
                bulan = "Januari";
                break;
            case 2:
                bulan = "Febuari";
                break;
            case 3:
                bulan = "Maret" ;
                break;
            case 4:
                bulan = "April";
                break;
            case 5:
                bulan = "Mei";
                break;
            case 6:
                bulan = "Juni";
                break;
            case 7:
                bulan = "Juli";
                break;
            case 8:
                bulan = "Agustus";
                break;
            case 9:
                bulan = "September";
                break;
            case 10:
                bulan = "Oktober";
                break;
            case 11:
                bulan = "November";
                break;
            case 12:
                bulan = "Desember";
                break;
        }

        System.out.print("Nama Lengkap " + nama + ",");
        System.out.print(" Lahir di " + tempat_lahir);
        System.out.print(" pada Tanggal " + tanggal_lahir);
        System.out.print(" " + bulan + " ");
        System.out.println(tahun_lahir + " ");
        System.out.print("Tinggi Badan " + tinggi_badan + " cm ");
        System.out.print("dan berat badan " + berat_badan + " kilogram");

    }

}