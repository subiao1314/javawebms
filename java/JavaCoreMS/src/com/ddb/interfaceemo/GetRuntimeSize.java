package com.ddb.interfaceemo;

import java.io.PrintStream;

public class GetRuntimeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStream out=System.out;
		Runtime run=Runtime.getRuntime();//�������
		String str="";//����һ���ַ���
		for (int x = 0; x < 5000; x++) {
			str=str+x; //��������
			
		}
		out.println("1���������ڴ棺"+run.maxMemory());
		out.println("1���ܹ������ڴ棺"+run.totalMemory());
		out.println("1.�������ڴ�"+run.freeMemory());
		run.gc();  //��������
		out.println("--------------------------");
		out.println("2���������ڴ棺"+run.maxMemory());
		out.println("2���ܹ������ڴ棺"+run.totalMemory());
		out.println("2.�������ڴ�"+run.freeMemory());

		
		
	}

}
