package com.ddb.interfaceemo;

class interfaceAB implements interfaceA //����ʵ�ֽӿ�
{
	public void print(){
		System.out.println("print abstract methods interfaceA!");
		System.out.println(INFO);
	}
}
public class Interfacedefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interfaceAB ab =new interfaceAB(); //ʵ�����������
		ab.print();
		ab.otherprint();
		System.out.println(interfaceA.INFO);
	}

}
