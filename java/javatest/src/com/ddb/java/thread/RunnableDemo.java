package com.ddb.java.thread;

public class RunnableDemo {

	
		public static void main(String[] args) {
	       
			TestThread1 t=new TestThread1();
			//new Thread(t).start();
			Thread thread=new Thread(t);
			thread.start();
			for (int i = 0; i < 5; i++) {
				System.out.println("main 线程在运行");
			 try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
		   }
		 }
			
	   }
	}
			
	class TestThread1 implements Runnable{	
		public void run(){
			for (int i = 0; i < 5; i++) {
				System.out.println("TestThread  在运行");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			 }  
		   }
		}
	 }		
			
		
