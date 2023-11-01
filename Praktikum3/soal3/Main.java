package soal3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner duzz = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = duzz.nextInt();
            duzz.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = duzz.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = duzz.nextLine();
                boolean isiNim = true;

                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNim().equals(nim)) {
                        isiNim = false;
                        break;
                    }
                }

                if (isiNim) {
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                    daftarMahasiswa.add(mahasiswa);
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                } else {
                    System.out.println("NIM sudah digunakan. Masukkan NIM yang unik.");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nimHapus = duzz.nextLine();
                boolean mahasiswaDitemukan = false;

                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNim().equals(nimHapus)) {
                        daftarMahasiswa.remove(mahasiswa);
                        mahasiswaDitemukan = true;
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                        break;
                    }
                }

                if (!mahasiswaDitemukan) {
                    System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                String nimCari = duzz.nextLine();
                boolean mahasiswaDitemukan = false;

                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNim().equals(nimCari)) {
                        System.out.println("Mahasiswa ditemukan:");
                        System.out.println("NIM: " + mahasiswa.getNim());
                        System.out.println("Nama: " + mahasiswa.getNama());
                        mahasiswaDitemukan = true;
                        break;
                    }
                }

                if (!mahasiswaDitemukan) {
                    System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                }
            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                }
            } else if (pilihan == 0) {
                daftarMahasiswa.clear();
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}