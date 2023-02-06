package Homework;

import java.util.Random;

public class Person {
    public String firstName;
    public String lastName;
    public String email;
    public String password;

    public String address;
    public String zipCode;
    public String city;

    public int emailNo = 0;

    public String[] firstNames = { "Adam", "Grzegorz", "Jerzy", "Tomasz", "Jan", "Krzysztof", "Karol", "Piotr", "Wojciech", "Jakub"};
    public String[] lastNames = { "Nowak", "Kowalski", "Mickiewicz", "Pudzianowski", "Kopernik"};
    public String[] passwords = {"12345", "54321", "234567", "765432", "11111"};
    public String[] adresses = {"Testowa 1A", "Testowa 35B", "Testowa 11F", "Testowa 22A", "Testowa 33C"};
    public String[] zipCodes = {"11-111", "22-222", "33-333", "44-444", "55-555"};
    public String[] cities = {"Warszawa", "Krakow", "Wroclaw", "Gdansk", "Lodz"};

    public Person() {

        Random r = new Random();

        int a = r.nextInt(this.firstNames.length);
        this.firstName = this.firstNames[a];

        int b = r.nextInt(this.lastNames.length);
        this.lastName = this.lastNames[b];

        int c = r.nextInt(this.passwords.length);
        this.password = this.passwords[c];

        int d = r.nextInt(this.adresses.length);
        this.address = this.adresses[d];

        int e = r.nextInt(this.zipCodes.length);
        this.zipCode = this.zipCodes[e];

        int f = r.nextInt(this.cities.length);
        this.city = this.cities[f];

        this.email = Zadanie6.generateEmail();
    }


    }

