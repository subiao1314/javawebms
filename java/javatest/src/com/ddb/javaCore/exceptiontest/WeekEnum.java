package com.ddb.javaCore.exceptiontest;

import lombok.Getter;
import lombok.Setter;

public enum WeekEnum {
    MONDAY("星期一"),TUESDAY("星期二"),WEDESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAI("星期六"),SUNDAY("星期日");
	
	@Getter@Setter
	private String desc;
	//@Getter@Setter
    private   WeekEnum(){
   		
       }
	private WeekEnum(String desc) {
		this.desc = desc;
		
	}	
	
	
	
	
	
	
	
	
	
}