package com.ddb.interfaceemo;

class StaticInnerClassTest{
  private int propl=5;
  private  static int propl2=9;
  void display(){
	  StaticInnerClass in=new StaticInnerClass();
	  in.display();
  }
  static class StaticInnerClass{
    private static int age;
    public void display(){
    	//System.out.println(propl);
    	System.out.println(propl2);
    }
	  
  }
}
public class ObjectStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticInnerClassTest outer=new StaticInnerClassTest();
		outer.display();
	}

}
