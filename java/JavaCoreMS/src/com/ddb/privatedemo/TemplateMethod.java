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
public void command(int ch) //����������
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
class Robot extends Action{ //��������Robot��Ϊ	
	public void eat() //ʵ�ֳ��󷽷�
	{
         System.out.println("Ϊ������ȼ��");
	}
    public void sleep(){}
    public void run(){}
    public void work(){
    	System.out.println("�û����˿�ʼ����");
    }
}

class Woman extends Action{ //��������Robot��Ϊ	
	public void eat() //ʵ�ֳ��󷽷�
	{
         System.out.println("����Ů�Է�");
	}
    public void sleep(){
    	System.out.println("����Ů˯���ݾ�");
    }
    public void run(){
    	System.out.println("����Ů�ܲ�����");
    }
    public void work(){}
}

class Man extends Action{ //��������Robot��Ϊ	
	public void eat() //ʵ�ֳ��󷽷�
	{
         System.out.println("��˧��Է�");
	}
    public void sleep(){
    	System.out.println("��˧��˯���ݾ�");
    }
    public void run(){
    	System.out.println("��˧���ܲ�����");
    }
    public void work(){
    	System.out.println("˧��Ϊ�˺���Ů���õ�������һ��Ҫ�úù�����");
    }
}

public class TemplateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PrintStream out=System.out;
		Action actA =new Robot();//�����˵���Ϊ
		actA.command(Action.EAT);
		actA.command(Action.WORK);
		
		Action actB=new Woman();//��Ů����Ϊ
		actB.command(Action.EAT+Action.SLEEP+Action.RUN);
		
		Action actc=new Man();//˧�����Ϊ
		actc.command(Action.EAT+Action.SLEEP+Action.RUN+Action.WORK);
		
		
		
		
		
		
		
	}

}
