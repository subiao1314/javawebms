package com.ddb.java.thread;

import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.OverlayLayout;

public class ThreadStatus implements Runnable {
    PrintStream out=System.out;  
	public void run(){
          out.println("出去运行状态！");
	      Scanner scanner=new Scanner(System.in);
	      out.println("等待I/O，处于阻塞状态！");
	      out.println("请输入字符串");
	      scanner.next();//扫描
	      scanner.close();
	      out.println("结束阻塞状态，重新进入就绪状态，然后运行状态！");
	      try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      out.println("线程进入死亡状态");
	      
       }
	        public static void main(String[] args) {
				Thread thread=new Thread(new ThreadStatus());
				System.out.println("处于创建状态");
				thread.start();
				System.out.println("处于就绪状态！");
			}
	   
	
	
	
	
	
	
	
	
}
