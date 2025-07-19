package org.example;

public class WorldApp {

    public static void main(String[] args) {

        City istanbul = new City("Istanbul", "TR2234", 10, 70.3);

        Country turkiye = new Country("Turkiye", 85, "Ankara", "Lire", istanbul );
    }
}
