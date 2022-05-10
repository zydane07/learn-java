package com.dicoding.javafundamental.inputouput;

import java.util.Scanner;

public class InputOuput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Program Penjumlahan Sederhana 1");
        System.out.print("Masukkan Angka pertama: ");
        int value = in.nextInt();
        System.out.print("Masukkan Angka kedua: ");
        int anotherValue = in.nextInt();

        int result = value + anotherValue;

        System.out.println("hasil dari " + value + " + " + anotherValue + " = " + result);

        in.close();
    }

}
