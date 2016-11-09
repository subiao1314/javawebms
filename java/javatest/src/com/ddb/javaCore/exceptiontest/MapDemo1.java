package com.ddb.javaCore.exceptiontest;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
        Set<String> srtSet=new HashSet<String>();
        Set<Integer> intSet=new HashSet<Integer>();
		  
	    intSet.add(10);	
	    intSet.add(11);	
	    intSet.add(12);	
	    intSet.add(13);	
	    intSet.add(14);	
	    intSet.add(15);	
	    out.println(intSet.size());
	    out.println("intSet : "+intSet);
		
		intSet.add(11);
		intSet.add(11);
		out.println(intSet.size());
		out.println("intSet : "+intSet);
		
		intSet.remove(10);
		out.println(intSet.size());
		out.println("intSet : "+intSet);
		
		intSet.remove(18);
		out.println(intSet.size());
		out.println("intSet : "+intSet);
		
		out.println("intSet.toArray() : "+intSet.toArray());
		out.println(intSet);
		out.println("********");
		Object[]objects= intSet.toArray();
		for (Object object : objects) {
			out.println(object);
		}
		
		Integer[] y =intSet.toArray(new Integer[2]);
		out.println("intSet.toArrary() : "+intSet.toArray());
		out.println("intSet : "+intSet);
		
		List<Integer> intlist =new ArrayList<Integer>();
		for (int i = 1; i <=15; i++) {
			intlist.add(i+ 10);
		}
		intlist.add(11);
		intlist.add(11);
		intlist.add(11);
		intlist.add(11);
		intlist.add(11);
		intlist.add(11);
		intlist.add(11);
		out.println("intlist :"+intlist);

		List<Integer>integers=new ArrayList<Integer>();
		integers.add(11);
		out.println("intlist.removeAll(integers) : "+intlist.removeAll(integers));
		out.println("intList : "+intlist);
		
		out.println("********");
	/*	intlist.removeAll(intSet);
		out.println("intlist : "+intlist);
		
		*/
		
		
		
		
		
		
		
		
	}

}
