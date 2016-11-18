package com.ddb.java.thread;

import java.io.PrintStream;

public class TestThread  {
 public static void main(String[] args) throws InterruptedException {
    	Thread thread= Thread.currentThread();
	    PrintStream out=System.out;
	    out.println("thread.isInterrupted()"+thread.isInterrupted());
	    out.println("thread.isAlive()"+thread.isAlive());
	    out.println("thread.isDaemon()"+thread.isDaemon());
	    out.println("thread.getName()"+thread.getName());
	    out.println("thread.getId()"+thread.getId());
	    out.println("thread.getPriority()"+thread.getPriority());
	    out.println("thread.getClass()"+thread.getClass());
	    out.println("thread.getContextClassLoader()"+thread.getContextClassLoader());
	    out.println();
        out.println("thread.getState()"+thread.getState());
        out.println("thread.toString()"+thread.toString());
        out.println("thread.activeCount()"+thread.activeCount());
        out.println();      
        out.println("Thread.MAX_PRIORITY"+Thread.MAX_PRIORITY);
        out.println("Thread.MIN_PRIORITY"+Thread.MIN_PRIORITY);
        out.println(Thread.activeCount());
       // out.println(Thread.enumerate(null));
        //out.println(Thread.holdsLock(null));
        out.println("打印当前时间 "+System.currentTimeMillis());
        Thread.sleep(1000);
        out.println("打印当前时间 "+System.currentTimeMillis());
	
 }
}
