package com.ddb.interfaceemo;

import java.util.Enumeration;
import java.util.Properties;

public class SystemInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties sp=System.getProperties();//��õ�ǰ������Ļ�������
		Enumeration e=sp.propertyNames();//��ȡ�������������б���
		//ѭ����ӡ����ǰ����������л������Եı�����ֵ
		while (e.hasMoreElements()) {
			String key=(String)e.nextElement();
			System.out.println(key+"="+sp.getProperty(key));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
