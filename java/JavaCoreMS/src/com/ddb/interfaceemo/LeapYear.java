package com.ddb.interfaceemo;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ָ�������ȡһ��year
		Year year1=Year.of(2012);
		//��year�л�ȡyearmonth
		YearMonth yearMonth=year1.atMonth(2);
		LocalDate localDate2=yearMonth.atDay(29);
		System.out.println("shijian "+localDate2);
		System.out.println("�Ƿ�Ϊ���꣺"+localDate2.isLeapYear());
		MonthDay monthDay =MonthDay.of(2, 29);
		LocalDate leapYear=monthDay.atYear(2012);
		System.out.println("runnian"+leapYear);
		
		//ͬһ��monthday��������һ�����
		LocalDate nonleapyear=monthDay.atYear(2014);
	//	System.out.println("������ "+nonleapyea);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
