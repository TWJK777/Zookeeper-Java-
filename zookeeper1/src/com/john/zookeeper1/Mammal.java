package com.john.zookeeper1;

public class Mammal {
	private int energyLevel;

	public Mammal(int energyLevel){
		this.energyLevel = energyLevel;
	}

	public int displayEnergy() {
		System.out.println(getEnergyLevel());
		return getEnergyLevel();
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
