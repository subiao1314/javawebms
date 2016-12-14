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

		//声明实例化对象 p
		Person p= new Person();
		//给p中属性赋值
		p.setName("SuBiao");
		p.setAge(24);
		p.say();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
