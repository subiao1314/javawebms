package com.ddb.interfaceemo;

class interfaceAB implements interfaceA //子类实现接口
{
	public void print(){
		System.out.println("print abstract methods interfaceA!");
		System.out.println(INFO);
	}
}
public class Interfacedefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interfaceAB ab =new interfaceAB(); //实例化子类对象
		ab.print();
		ab.otherprint();
		System.out.println(interfaceA.INFO);
	}

}
