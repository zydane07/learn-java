package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        String[] heroes = new String[2];
        heroes[0] = "Zydane";
        heroes[1] = "Farhan";

        List<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");

        System.out.println("List planet Awal: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        planets.remove(1);

        System.out.println("List planet sekarang: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

    }
}
