package com.datatype;
import java.util.Scanner;
public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner scanner = new Scanner(System.in);
	
System.out.println("what is your name? ");
String name = scanner.nextLine();
System.out.println("Enter ur rating");
byte rating = scanner.nextByte();
System.out.println("Hii "+ name + " Welcome!");
System.out.println("You rated us "+ rating);
System.out.println("Thank you");
	}

}
