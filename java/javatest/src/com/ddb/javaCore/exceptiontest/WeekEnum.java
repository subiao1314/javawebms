package com.ddb.javaCore.exceptiontest;

import lombok.Getter;
import lombok.Setter;

public enum WeekEnum {
    MONDAY("����һ"),TUESDAY("���ڶ�"),WEDESDAY("������"),
    THURSDAY("������"),FRIDAY("������"),SATURDAI("������"),SUNDAY("������");
	
	@Getter@Setter
	private String desc;
	//@Getter@Setter
    private   WeekEnum(){
   		
       }
	private WeekEnum(String desc) {
		this.desc = desc;
		
	}	
	
	
	
	
	
	
	
	
	
}