package com.ddb.interfaceemo;

public interface interfaceA {

	public static String INFO="static final.";//ȫ�ֱ���
	public void print();
	default public void otherprint(){
		System.out.println("print default1 methods interfaceA!");
	}
}
