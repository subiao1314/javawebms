package com.ddb.interfaceemo;

import org.omg.CORBA.PUBLIC_MEMBER;

class InnerClassTest{
   int score=95;
   void inst(){
	   class Inner{
		   void display(){
			   System.out.println("chengji: score="+score);
		   }
	   }
	   Inner in=new Inner();
	   in.display();
   }


}
public class ObjectInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClassTest outer=new InnerClassTest();
		outer.inst();
		 
		String str="123";
		boolean flag=Boolean.parseBoolean(str);
		if (flag) {
			System.out.println("tiaojianmanzhu");
		} else {
             System.out.println("tiaojianbumanzhu");
		}
		
		int  x=100;
		String str1 =String.valueOf(x);
		System.out.println(str1);
	}

}










