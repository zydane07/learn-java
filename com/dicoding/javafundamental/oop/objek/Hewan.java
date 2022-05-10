package com.dicoding.javafundamental.oop.objek;

public class Hewan {

    String nama;
    int berat;
    int jmlKaki;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void beratHewan(int beratHewan) {
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int kaki) {
        jmlKaki = kaki;
    }

    public void cetakHewan() {
        System.out.println("Nama hewan : " + nama);
        System.out.println("Berat hewan : " + berat + " kg");
        System.out.println("Jumlah kaki: " + jmlKaki);
    }
}
