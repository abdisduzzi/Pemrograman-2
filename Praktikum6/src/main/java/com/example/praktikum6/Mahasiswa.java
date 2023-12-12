package com.example.praktikum6;

public class Mahasiswa {
    int id;
    String nama, nim;

    public Mahasiswa(int id, String nm, String NNIMM){
        this.id = id;
        nama = nm;
        nim = NNIMM;
    }
    public Mahasiswa( String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nim;
    }
    public void setNama(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nama;
    }
    public void setNim(String nama) {
        this.nama = nama;
    }
}