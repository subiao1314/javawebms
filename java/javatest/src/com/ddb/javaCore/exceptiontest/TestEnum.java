package com.ddb.javaCore.exceptiontest;

import java.io.PrintStream;
import java.time.MonthDay;

public class TestEnum {

 	public static void print(WeekEnum me) {
		PrintStream out = System.out;
		switch (me) {
		case MONDAY:
			out.println("����һ�� ");
			break;
		case THURSDAY:
			out.println("���ڶ��� ");
			break;
		case WEDESDAY:
			out.println("�������� ");
			break;
		case TUESDAY:
			out.println("�����ģ� ");
			break;
		case FRIDAY:
			out.println("�����壺 ");
			break;
		case SATURDAI:
			out.println("�������� ");
			break;
		case SUNDAY:
			out.println("�����գ� ");
			break;
		}

	}

 		
 		public static void print2(WeekEnum me) {
 			PrintStream out = System.out;
 			switch (me) {
 			case MONDAY:
 				out.println("����һ�� ");
 				break;
 			case THURSDAY:
 				out.println("���ڶ��� ");
 				break;
 			case WEDESDAY:
 				out.println("�������� ");
 				break;
 			case TUESDAY:
 				out.println("�����ģ� ");
 				break;
 			case FRIDAY:
 				out.println("�����壺 ");
 				break;
 			case SATURDAI:
 				out.println("�������� ");
 				break;
 			case SUNDAY:
 				out.println("�����գ� ");
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
