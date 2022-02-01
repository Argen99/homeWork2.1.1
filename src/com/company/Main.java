package com.company;

public class Main {

    public static void main(String[] args) {

        Shelter shelter = new Shelter("Shelter","ул. Манаса 34");
        Shelter romashka = new Shelter("Romashka","ул. Горького 11");


        Dog tuzik = new Dog(12,"White","Tuzik",EnumBreeds.BOXER,shelter);
        System.out.println(tuzik.getInfo());
        tuzik.Commands();
        System.out.println("______________________");

        FightingDog spike = new FightingDog(5,"Black","Spike",
                EnumBreeds.DOBERMAN,12,100, romashka);
        System.out.println(spike.getInfo());
        spike.Commands("Фас!, Место!");
        System.out.println("______________________");

        FightingDog baron = new FightingDog(8,"Grey","Baron",
                EnumBreeds.BULLDOG,3,80, romashka);
        System.out.println(baron.getInfo());
        baron.Commands("Фас!, Фу!");
    }
}
