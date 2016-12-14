package com.java.test.exception;

public class throwDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  int[]arr=new int[10];
    	  arr[12]=7;
    	  //抛出异常的实例化对象
	//	throw ArrayIndexOutOfBoundsException("\n我是个性化的异常信息；\n数组下标越界");
		
	} catch (ArrayIndexOutOfBoundsException ex) {
		// TODO: handle
		ex.printStackTrace();
		System.out.println(ex);
	}
		
		
	}

}
