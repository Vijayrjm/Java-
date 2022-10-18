package com.selfstudy;

public class SingleInheritance {

	public static void main(String[] args) {
		
	}
		
		void add() {
			int a=10,b=20,c;
			c=a+b;
			System.out.println(c);
		}

	}


class Child extends SingleInheritance {
	public static void main(String[] args) {
		Child c=new Child();
		c.add();
		c.sub();
}
	void sub() {
		int a=5,b=7,c;
		c=b-a;
		System.out.println(c);
}
}