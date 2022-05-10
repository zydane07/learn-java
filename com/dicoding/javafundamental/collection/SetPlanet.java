package com.dicoding.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();

        // set tidak memungkinkan adanya duplikasi objek
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Mars");

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("Venus");

        System.out.println("Set planets akhir: (size = " + planets.size() + ")");

        for (Iterator iterator = planets.iterator(); iterator.hasNext();) {
            // looping menggunakan Iterator

            System.out.println("\t" + iterator.next());
        }

    }
}