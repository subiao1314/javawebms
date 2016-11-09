package com.ddb.javaCore.exceptiontest;

import java.io.PrintStream;

   public class TestEnum2 {

	  public static void print(WeekEnum we) {
		  PrintStream out = System.out;
		switch (we) {
		case MONDAY:
			out.println("星期一");
			break;
		case TUESDAY:
			out.println("星期二");
			break;
		case WEDESDAY:
			out.println("星期三");
			break;
		case THURSDAY:
			out.println("星期四");
			break;
		case FRIDAY:
			out.println("星期五");
			break;
		case SATURDAI:
			out.println("星期六");
			break;
		case SUNDAY:
			out.println("星期天");
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
