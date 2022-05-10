package com.dicoding.javafundamental.oop.objek;

public class Main {

    public static void main(String[] args) {
        Hewan Serigala = new Hewan("Serigala");
        Hewan Elang = new Hewan("Elang");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();

        Serigala.beratHewan(2);
        Serigala.jumlahKakiHewan(4);
        Serigala.cetakHewan();
    }
}
