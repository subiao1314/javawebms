package com.java.test.exception;

public class throwDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  int[]arr=new int[10];
    	  arr[12]=7;
    	  //�׳��쳣��ʵ��������
	//	throw ArrayIndexOutOfBoundsException("\n���Ǹ��Ի����쳣��Ϣ��\n�����±�Խ��");
		
	} catch (ArrayIndexOutOfBoundsException ex) {
		// TODO: handle
		ex.printStackTrace();
		System.out.println(ex);
	}
		
		
	}

}
