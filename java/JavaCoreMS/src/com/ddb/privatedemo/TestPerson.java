package com.ddb.privatedemo;

import java.time.Period;

class Person{
  private String name;
  private int age;
  private void talk(){
	  System.out.println("woshi "+name +" jinnian "+age+" years old");
  }
  public void say(){
	  talk();
  }
  public String getName(){
	  return name;
  }
  public void setName(String name){
	  this.name=name ;
  }
  public int getAge(){
	  return age;
  }
  public void setAge(int age){
	  this.age=age;
  }
  }

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����ʵ�������� p
		Person p= new Person();
		//��p�����Ը�ֵ
		p.setName("SuBiao");
		p.setAge(24);
		p.say();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
