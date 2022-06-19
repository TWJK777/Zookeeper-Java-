package com.john.zookeeper1;

public class Gorilla extends Mammal {

	public Gorilla(int energyLevel){
		super(energyLevel);
	}

	public void throwSomething() {
		System.out.println("This is my poo");
		setEnergyLevel(getEnergyLevel() - 5);
	}
	public void eatBananas() {
		System.out.println("This is my banana");
		setEnergyLevel(getEnergyLevel() + 10);
	}
	public void climb() {
		System.out.println("Working out");
		setEnergyLevel(getEnergyLevel() - 10);
	}
	

}

