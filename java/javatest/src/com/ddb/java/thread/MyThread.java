package com.ddb.java.thread;

class MyThread extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}