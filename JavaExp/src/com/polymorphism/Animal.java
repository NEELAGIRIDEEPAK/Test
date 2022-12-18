package com.polymorphism;

public class Animal {
	private String hunger;

	public String getHunger() {
		return hunger;
	}

	public void setHunger(String hunger) {
		this.hunger = hunger;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getJump() {
		return jump;
	}

	public void setJump(String jump) {
		this.jump = jump;
	}

	public String sound;

	public String jump;

	Animal(String hunger, String sound, String jump) {
		this.hunger = hunger;
		this.sound = sound;
		this.jump = jump;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal("less hunger", "bow bow", "medium");
		Animal cat = new Animal("medium", "meow", "high and long ");
		Animal monkey = new Animal("more hunger", "keach keach", "high");
		System.out.println("Dog have" + dog.hunger + ",sounds like " + dog.sound + " and it jumps " + dog.jump);
		System.out.println("cat have" + cat.hunger + ",sounds like " + cat.sound + " and it jumps " + cat.jump);
		System.out.println(
				"Moneky have" + monkey.hunger + ",sounds like " + monkey.sound + " and it jumps " + monkey.jump);

	}

}