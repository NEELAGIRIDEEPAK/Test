package com.innerclass;

public class Innerclass {

	private int numberOfFruits=20;
	
	class SweetFruit{
		void taste() {
			System.out.println("I am sweet and my count is"+(numberOfFruits-10));
		}
	}
	
	class SourFruit{
		void taste() {
			System.out.println("I am sour and my count is"+(numberOfFruits-5));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Innerclass f= new Innerclass();
		
		
	Innerclass.SourFruit sf=  f.new SourFruit();//will not know about sweet fruit
	Innerclass.SweetFruit swf=  f.new SweetFruit();//will not know about sour fruit
	
	System.out.println("sourfruit"+sf);
	System.out.println("sweetfruit"+swf);
	}

}