package com.ddb.javaCore.exceptiontest;

import java.io.PrintStream;
import java.time.MonthDay;

public class TestEnum {

 	public static void print(WeekEnum me) {
		PrintStream out = System.out;
		switch (me) {
		case MONDAY:
			out.println("星期一： ");
			break;
		case THURSDAY:
			out.println("星期二： ");
			break;
		case WEDESDAY:
			out.println("星期三： ");
			break;
		case TUESDAY:
			out.println("星期四： ");
			break;
		case FRIDAY:
			out.println("星期五： ");
			break;
		case SATURDAI:
			out.println("星期六： ");
			break;
		case SUNDAY:
			out.println("星期日： ");
			break;
		}

	}

 		
 		public static void print2(WeekEnum me) {
 			PrintStream out = System.out;
 			switch (me) {
 			case MONDAY:
 				out.println("星期一： ");
 				break;
 			case THURSDAY:
 				out.println("星期二： ");
 				break;
 			case WEDESDAY:
 				out.println("星期三： ");
 				break;
 			case TUESDAY:
 				out.println("星期四： ");
 				break;
 			case FRIDAY:
 				out.println("星期五： ");
 				break;
 			case SATURDAI:
 				out.println("星期六： ");
 				break;
 			case SUNDAY:
 				out.println("星期日： ");
 				break;
 				default:
 					break;
 			}
 		}		
 		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
     /*  out.println("*************");
		print(WeekEnum.MONDAY);
		print(WeekEnum.THURSDAY);
		print(WeekEnum.WEDESDAY);
		print(WeekEnum.TUESDAY);
		print(WeekEnum.FRIDAY);
		print(WeekEnum.SATURDAI);
		print(WeekEnum.SUNDAY);
		
		*/
		 out.println("*************");
		print2(WeekEnum.MONDAY);
		
		
	}

}
