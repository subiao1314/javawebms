package com.ddb.java.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account2 {
  private final Lock lock=new ReentrantLock();
	private String accountno;
	private double balance2;
	public Account2(String accountno,double balance2){
        this.balance2=balance2;      		
	    this.accountno=accountno;
	}
	public String getaccountno(){
		return accountno;
	}
	 public String balance2(){
		 return balance2();
	 }
//	public void setaccountno(string)
	
	
	
	
	
	
}
