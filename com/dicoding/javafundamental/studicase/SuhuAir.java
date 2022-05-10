package com.dicoding.javafundamental.studicase;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan suhu air: ");
        int suhu = in.nextInt();

        if (suhu < 0) {
            System.out.println("Beku dengan suhu " + suhu);
        } else if (suhu <= 100) {
            System.out.println("Cair dengan suhu " + suhu);
        } else if (suhu > 100) {
            System.out.println("Gas dengan suhu " + suhu);
        } else {
            System.out.println("input salah");
        }

    }
}
