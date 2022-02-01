package com.company;

public final class FightingDog extends Dog {

    private int numberOfWins;
    private int weight;

    public FightingDog(int age, String color, String name,
                       EnumBreeds breeds, int numberOfWins,
                       int weight, Shelter shelter) {
        super(age, color, name, breeds, shelter);
        this.numberOfWins = numberOfWins;
        this.weight = weight;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public int getWeight() {
        return weight;
    }

    public String getInfo(){
        return super.getInfo() +
                "\nWins: " + getNumberOfWins() +
                "\nWeight: " + getWeight();
    }
}
