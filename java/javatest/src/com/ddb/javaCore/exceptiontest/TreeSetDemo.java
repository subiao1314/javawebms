package com.ddb.javaCore.exceptiontest;

import java.io.PrintStream;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          PrintStream out=System.out;
		TreeSet<Human> tSet =new TreeSet<Human>();
		 out.println("tSetDemo");
		 out.println("tSet.size() : "+tSet.size());
		tSet.add(new Human("ID---01",11));
		tSet.add(new Human("ID---02",12));
		tSet.add(new Human("ID---03",13));
		tSet.add(new Human("ID---04",14));
		tSet.add(new Human("ID---05",15));
		
		out.println("tSet.size() : "+tSet.size());
		out.println("tSet : "+tSet);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
