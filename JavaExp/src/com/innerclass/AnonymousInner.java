package com.innerclass;

public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//referring from constructor of abstract class
		TestAbstract t= new TestAbstract() {
			
			@Override
			void m1() {
				// TODO Auto-generated method stub
				System.out.println("I am here");
			}
		};
		t.m1();
	}

}
