package com.ddb.java.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



class Account {

    private String accountNo;
    private double balance;
    // 标识账户中是否已有存款
    private boolean flag = false;

    public Account() {

    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
     }

	public void deposite(double amount, int i) {
		// TODO Auto-generated method stub
		
	}

	public void draw(double amount, int i) {
		// TODO Auto-generated method stub
		
	}
}