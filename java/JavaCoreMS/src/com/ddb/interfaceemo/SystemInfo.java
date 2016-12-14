package com.ddb.interfaceemo;

import java.util.Enumeration;
import java.util.Properties;

public class SystemInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties sp=System.getProperties();//获得当前虚拟机的环境属性
		Enumeration e=sp.propertyNames();//获取环境属性中所有变量
		//循环打印出当前虚拟机的所有环境属性的变量和值
		while (e.hasMoreElements()) {
			String key=(String)e.nextElement();
			System.out.println(key+"="+sp.getProperty(key));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
