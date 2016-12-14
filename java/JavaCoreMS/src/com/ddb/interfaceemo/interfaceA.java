package com.ddb.interfaceemo;

public interface interfaceA {

	public static String INFO="static final.";//全局变量
	public void print();
	default public void otherprint(){
		System.out.println("print default1 methods interfaceA!");
	}
}
