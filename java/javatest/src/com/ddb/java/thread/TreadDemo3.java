package com.ddb.java.thread;

public class TreadDemo3 {
    public static void main(String[] args) {
          new TestThread3().start();
          new TestThread3().start();
          new TestThread3().start();
          new TestThread3().start();

    }
}


       class TestThread3 extends Thread{
    	   public void run(){
    		  int tickets = 5 ;
             while (tickets>0) {
				System.out.println(Thread.currentThread().getName()+" 出售票  "+tickets);
				tickets-=1;
			}				
     	   
    	   }
       }
	
	
	
	
	
	
	
	
	
	