package com.company;

public class Dog extends Animal{

    private String name;
    private EnumBreeds breeds;
    private Shelter shelter;

    public Dog(int age, String color, String name, EnumBreeds breeds, Shelter shelter) {
        super(age, color);
        this.name = name;
        this.breeds = breeds;
        this.shelter = shelter;
    }

    public String getName() {
        return name;
    }

    public EnumBreeds getBreeds() {
        return breeds;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public String getInfo(){
        return "Age: " + getAge() +
                "\nColor: " + getColor() +
                "\nName: " + getName() +
                "\nBreed: " + getBreeds() +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }

    public final void Commands() {
        System.out.println("Commands: Лежать!, Сидеть!");
    }
    public void Commands(String commands){
        System.out.println("Commands: " + commands);
    }


}
