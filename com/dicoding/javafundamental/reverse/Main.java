package com.dicoding.javafundamental.reverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input: ");
        String text = in.nextLine();

        StringBuilder sb = new StringBuilder(text);

        System.out.println("anda memasukkan: " + text);
        System.out.println("Reversenya: " + sb.reverse());

        in.close();
    }
}
