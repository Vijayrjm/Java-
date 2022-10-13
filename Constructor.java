package com.datatype;

public class Constructor {
	String movie;
	int time;
	boolean hit;
	
	 Constructor(String mn,int t,boolean h) {
		movie = mn;
		time = t;
		hit = h;
		

		 System.out.println("movie name");
		 System.out.println(movie+time+hit);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c1 = new Constructor("ponniyinselvan",5,true);
		
		

	}

}
