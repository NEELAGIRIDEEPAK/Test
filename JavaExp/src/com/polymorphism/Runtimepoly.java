package com.polymorphism;

class Animal1 {
	void sounds() {
		System.out.println("Animal makes sounds");
	}
}

class Dog extends Animal1 {
	void sounds() {
		System.out.println("Dog sounds bow bow");
	}
}

class Cow extends Animal1 {
	void sounds() {
		System.out.println("cow sounds amba amba");
	}
}

class Sheep extends Animal1 {
	void sounds() {
		System.out.println("sheep sounds mey mey");
	}
}

public class Runtimepoly {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Animal1 d=new Dog();
			Animal1 c=new Cow();
			Animal1 s=new Sheep();
			d.sounds();
			c.sounds();
			s.sounds();
	}
}
