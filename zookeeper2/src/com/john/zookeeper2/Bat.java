package com.john.zookeeper2;

public class Bat extends Mammal {

    public Bat(){
        super(300);
    }

    public void fly() {
        System.out.println("Meow Bow Wow");
        setEnergyLevel(getEnergyLevel() - 50);
    }

    public void eatHumans() {
        setEnergyLevel(getEnergyLevel() + 25);
    }

    public void attackTown() {
        System.out.println("Fire!");
        setEnergyLevel(getEnergyLevel() - 100);
    }
}
