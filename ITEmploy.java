package com.datatype;

public class ITEmploy {
	String name;
	int id;
	String DOB;
	public ITEmploy(String n,int i,String db) {
		name=n;
		id=i;
		DOB=db;
		System.out.println("Employ Name "+":- "+ n);
		System.out.println("Employ ID   "+ ":- "+i);
		System.out.println("Employ DOB  "+":-  "+db);
	}

	public static void main(String[] args) {
		ITEmploy n1=new ITEmploy("VIJAY",420,"28/04/1998");
		System.out.println("                                                                                                                                                        ");
		ITEmploy n2=new ITEmploy("Suresh",421,"12/08/1999");
		System.out.println("                          ");
		ITEmploy n3=new ITEmploy("Rajesh",425,"17/05/1997");
		
		// TODO Auto-generated method stub

	}

}
