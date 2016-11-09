package com.ddb.javaCore.exceptiontest;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class Human implements Comparable<Human> {
	private String id;
	
	private String name;
	private Integer age;
	private String work;
	
	
	public Human() {
		//super();
		System.out.println("杩欐槸Human 绫荤殑鏃犲弬鏋勯�犳柟娉曪紝浣滅敤鍒涘缓Human绫荤殑涓�涓疄渚嬪璞�?");
	}
	
	
	public Human(String id, String name, Integer age, String work) {
		//super();
		this();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
		System.out.println("杩欐槸Human 绫荤�?4涓弬鏁版�?�閫犳柟娉曪紝浣滅敤鍒涘缓Human绫荤殑涓�涓疄渚嬪璞�?");
	}




	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + "]";
	}


	public Human(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


public Human(String id, Integer age) {
	super();
	this.id = id;
	this.age = age;
}


@Override
public int compareTo(Human o) {
	// TODO Auto-generated method stub
	return 0;
}

	
}
