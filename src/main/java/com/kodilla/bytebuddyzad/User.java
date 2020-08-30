package com.kodilla.bytebuddyzad;

public class User {
    private String imie;
    private String nazwisko;

    public User(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void doSomething() {
        System.out.println("robie sobie do something");
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
