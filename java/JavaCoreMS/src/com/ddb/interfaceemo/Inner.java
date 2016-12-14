package com.ddb.interfaceemo;

class Outer{
	int score =95;
	void inst(){
		Inner in=new Inner();
		in.display();
	}
	public class Inner{
		String name ="zhangsan";
		void display(){
			System.out.println("chengji:score="+score);
		}
	}
}

public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer outer=new Outer();
		outer.inst();
	}

}
