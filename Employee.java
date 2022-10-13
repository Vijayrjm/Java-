package com.datatype;

 public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition emp = new Addition();
		int result = emp.add();
		
		System.out.println(result);
	}
	}
	 class Addition {          
 int add() {
	 
	int a = 5;
	int b = 5;
	int c = a+b;
	 return c;
 }
	}

