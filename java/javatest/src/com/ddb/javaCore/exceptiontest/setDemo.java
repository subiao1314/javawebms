package com.ddb.javaCore.exceptiontest;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PrintStream out=System.out;
		//List<String>strList=new ArrayList<String>();
		
		Set<Integer>intSet1=new HashSet<Integer>();
		Set<Integer>intSet2=new HashSet<Integer>();
		
		out.println("intSet1.size() :" +intSet1.size());
		intSet1.add(10);
		intSet1.add(11);
		intSet1.add(12);
		intSet1.add(13);
		intSet1.add(14);
		out.println("intSet1.size() :" +intSet1.size());
		out.println("intSet1.size :" +intSet1);
		intSet1.add(11);
		intSet1.add(11);
		intSet1.add(11);
		intSet1.add(11);
		out.println("intSet1.size() :" +intSet1.size());
		out.println("intSet1.size :" +intSet1);
		
		intSet1.remove(13);
		intSet1.remove(13);
		intSet1.remove(13);
		out.println("intSet1.size() :" +intSet1.size());
		out.println("intSet1.size :" +intSet1);

        intSet2.add(6);	
        intSet2.add(7);	
        intSet2.add(8);	
        intSet2.add(9);	
        intSet2.add(5);	
        out.println("intSet2.size() :" +intSet2.size());
        out.println("intSet2.size :" +intSet2);
        
		intSet1.equals(intSet1);
		intSet1.equals(intSet2);
		out.println("intSet1.size :" +intSet1);
		out.println("intSet2.size :" +intSet2);
		out.println(intSet1.equals(intSet1));
		out.println(intSet1.equals(intSet1));
		out.println(intSet1.equals(intSet2));
		
		intSet1.addAll(intSet1);
		intSet1.addAll(intSet2);
		out.println("intSet1.size :" +intSet1);
		out.println("intSet2.size :" +intSet2);
        intSet1.add(13);		
		intSet1.remove(intSet2);
		out.println("intSet1.size :" +intSet1);
		out.println("intSet2.size :" +intSet2);
		intSet1.removeAll(intSet2);
		out.println("intSet1.size :" +intSet1);
		out.println("intSet2.size :" +intSet2);
		
		out.println("intSet1.toArray()"+intSet1.toArray());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
