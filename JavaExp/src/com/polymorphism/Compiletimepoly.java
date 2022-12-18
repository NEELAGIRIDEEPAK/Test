package com.polymorphism;

public class Compiletimepoly {

	public String sum(String a, String b) {
		return (a + b);
	}

	public String sum(String a, String b, String c) {
		return (a + b + c);
	}

	public static void main(String args[]) {
		Compiletimepoly s = new Compiletimepoly();
		System.out.println(s.sum("i am", " student"));
		System.out.println(s.sum("i am", " student", " with B.tech qualification"));

	}

}
