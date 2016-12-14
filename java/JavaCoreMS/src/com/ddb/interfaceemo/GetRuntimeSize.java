package com.ddb.interfaceemo;

import java.io.PrintStream;

public class GetRuntimeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStream out=System.out;
		Runtime run=Runtime.getRuntime();//单例设计
		String str="";//定义一个字符串
		for (int x = 0; x < 5000; x++) {
			str=str+x; //垃圾产生
			
		}
		out.println("1。最大可用内存："+run.maxMemory());
		out.println("1。总共可用内存："+run.totalMemory());
		out.println("1.最大可用内存"+run.freeMemory());
		run.gc();  //清理垃圾
		out.println("--------------------------");
		out.println("2。最大可用内存："+run.maxMemory());
		out.println("2。总共可用内存："+run.totalMemory());
		out.println("2.最大可用内存"+run.freeMemory());

		
		
	}

}
