package org.example;

public class Country {
    private String name;
    private int population;
    private String capital;
    private String currency;
    private City city;

    public Country(String name, int population, String capital, String currency,  City city) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.currency = currency;
        this.city = city;
    }
}
