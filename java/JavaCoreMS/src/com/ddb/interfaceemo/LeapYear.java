package com.ddb.interfaceemo;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//用指定的年获取一个year
		Year year1=Year.of(2012);
		//从year中获取yearmonth
		YearMonth yearMonth=year1.atMonth(2);
		LocalDate localDate2=yearMonth.atDay(29);
		System.out.println("shijian "+localDate2);
		System.out.println("是否为闰年："+localDate2.isLeapYear());
		MonthDay monthDay =MonthDay.of(2, 29);
		LocalDate leapYear=monthDay.atYear(2012);
		System.out.println("runnian"+leapYear);
		
		//同一个monthday关联到另一个年份
		LocalDate nonleapyear=monthDay.atYear(2014);
	//	System.out.println("非闰年 "+nonleapyea);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
