package com.dicoding.javafundamental.studicase;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = "";
        int jmlVokal = 0;
        int jmlKonsonan = 0;

        System.out.print("Input Kata: ");
        word = in.nextLine();

        jmlVokal = vokal(word);
        jmlKonsonan = konsonan(word);

        System.out.println("Jumlah huruf vokal: " + jmlVokal);
        System.out.println("Jumlah huruf konsonan: " + jmlKonsonan);

        in.close();
    }

    public static int vokal(String Word) {
        int jumVokal = 0;

        for (int i = 0; i < Word.length(); i++) {
            if (Word.charAt(i) == 'a' || Word.charAt(i) == 'i' || Word.charAt(i) == 'u' || Word.charAt(i) == 'e'
                    || Word.charAt(i) == 'o') {
                jumVokal++;
            }
        }

        return jumVokal;
    }

    public static int konsonan(String Word) {
        int jumkonsonan = 0;

        for (int i = 0; i < Word.length(); i++) {
            if (Word.charAt(i) != 'a' && Word.charAt(i) != 'i' && Word.charAt(i) != 'u' && Word.charAt(i) != 'e'
                    && Word.charAt(i) != 'o') {
                jumkonsonan++;
            }
        }

        return jumkonsonan;
    }
}
