package com.ddb.javaCore.exceptiontest;

import java.io.PrintStream;

   public class TestEnum2 {

	  public static void print(WeekEnum we) {
		  PrintStream out = System.out;
		switch (we) {
		case MONDAY:
			out.println("����һ");
			break;
		case TUESDAY:
			out.println("���ڶ�");
			break;
		case WEDESDAY:
			out.println("������");
			break;
		case THURSDAY:
			out.println("������");
			break;
		case FRIDAY:
			out.println("������");
			break;
		case SATURDAI:
			out.println("������");
			break;
		case SUNDAY:
			out.println("������");
			break;

		}

	}

	public static void main(String[] args, WeekEnum MONDAY) {
		// TODO Auto-generated method stub
         PrintStream out=System.out;
         out.println("------");
		print(WeekEnum.MONDAY);
		print(WeekEnum.TUESDAY);
		print(WeekEnum.WEDESDAY);
		print(WeekEnum.THURSDAY);
		print(WeekEnum.FRIDAY);
		print(WeekEnum.SATURDAI);
		print(WeekEnum.SUNDAY);
			
			
			
		
		
		
		
	}

}
