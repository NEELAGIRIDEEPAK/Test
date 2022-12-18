package com.innerclass;

public class Methodlocal {
	// instance method of the outer class
	void Method() {
		int num = 23;
		// method-local inner class
		class MethodInner {
			public void print() {
				System.out.println("This is method inner class " + num);
			}
		}// end of inner class
			// Accessing the inner class
		MethodInner inner = new MethodInner();
		inner.print();
	}

	public static void main(String args[]) {
		Methodlocal outer = new Methodlocal();
		outer.Method();
	}
}
