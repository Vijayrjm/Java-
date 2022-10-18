package com.selfstudy;

//public class Hierarchical {

	//public static void main(String[]  {
		// TODO Auto-generated method stub

	


class dad{
	void character() {
		int hight=150;
		String color="fair";
		System.out.println(hight+color);
	}
}
class son1 extends dad{
	public static void main(String [] args) {
		son1 s1=new son1();
		s1.character();
	}
	
}
class son2 extends dad{
	public static void main(String[] args) {
		son2 s2=new son2();
		s2.character();
	}
	
}