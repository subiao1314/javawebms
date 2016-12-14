package com.ddb.privatedemo;

import java.io.PrintStream;

abstract class Action{
public static final int EAT=1;	  
public static final int WORK=2;
public static final int SLEEP=5;
public static final int RUN=10;
public abstract void eat();
public abstract void work();
public abstract void sleep();
public abstract void run();
public void command(int ch) //声明的命令
{
  switch (ch) {
case EAT:
	this.eat();
	break;
case WORK:
	this.work();
	break;
case SLEEP:
	this.sleep();
	break;
case RUN:
	this.run();
	break;
case EAT+WORK:
	this.eat();
    this.work();
	break;
case EAT+SLEEP+RUN:
	this.eat();
    this.sleep();
    this.run();
	break;
case EAT+SLEEP+RUN+WORK:
	this.eat();
    this.work();
    this.sleep();
    this.run();
	break;
  }
 }
}	
class Robot extends Action{ //定义子类Robot行为	
	public void eat() //实现抽象方法
	{
         System.out.println("为机器加燃料");
	}
    public void sleep(){}
    public void run(){}
    public void work(){
    	System.out.println("让机器人开始工作");
    }
}

class Woman extends Action{ //定义子类Robot行为	
	public void eat() //实现抽象方法
	{
         System.out.println("请美女吃饭");
	}
    public void sleep(){
    	System.out.println("让美女睡美容觉");
    }
    public void run(){
    	System.out.println("让美女跑步健身");
    }
    public void work(){}
}

class Man extends Action{ //定义子类Robot行为	
	public void eat() //实现抽象方法
	{
         System.out.println("请帅哥吃饭");
	}
    public void sleep(){
    	System.out.println("让帅哥睡美容觉");
    }
    public void run(){
    	System.out.println("让帅哥跑步健身");
    }
    public void work(){
    	System.out.println("帅哥为了和美女更好的生活在一起，要好好工作！");
    }
}

public class TemplateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PrintStream out=System.out;
		Action actA =new Robot();//机器人的行为
		actA.command(Action.EAT);
		actA.command(Action.WORK);
		
		Action actB=new Woman();//美女的行为
		actB.command(Action.EAT+Action.SLEEP+Action.RUN);
		
		Action actc=new Man();//帅哥的行为
		actc.command(Action.EAT+Action.SLEEP+Action.RUN+Action.WORK);
		
		
		
		
		
		
		
	}

}
