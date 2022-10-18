package com.selfstudy;

public class MultilevelInheritance extends father {

	public static void main(String[] args) {
		MultilevelInheritance mli=new MultilevelInheritance();
		mli.main();
		
		
		// TODO Auto-generated method stub

	}
}

class Grandfather {
	
	int watchingTv() {
		int score=250;
		return score;
	}
}

class father extends Grandfather{
	 void main() {
		int a =250;
		
		father f = new father();
		int c=f.watchingTv();
		System.out.println(c+a);
	}
		

		
			
		
		
	}
	
