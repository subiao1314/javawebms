package com.ddb.javaCore.exceptiontest;

import java.io.PrintStream;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         PrintStream out=System.out;
		 TreeMap<Long, Integer> hUTreeMapMap=new TreeMap<Long,Integer>();
		out.println("tMap.size() : "+hUTreeMapMap.size());
		hUTreeMapMap.put(11L, 111);
		hUTreeMapMap.put(12L, 112);
		hUTreeMapMap.put(13L, 113);
		hUTreeMapMap.put(14L, 114);
		hUTreeMapMap.put(15L, 115);
		out.println("tMap.size() : "+hUTreeMapMap.size());
		out.println("tMap : "+hUTreeMapMap);
		
		out.println("hUTreeMapMap.remove(11L) : "+hUTreeMapMap.remove(11L));
		out.println("hUTreeMapMap : "+hUTreeMapMap);
		
		out.println("hUTreeMapMap.remove(11L, 111) : "+hUTreeMapMap.remove(11L, 111));
		
		out.println("hUTreeMapMap.isEmpty()  : "+hUTreeMapMap.isEmpty());
		
		hUTreeMapMap.put(11L, 119);
		out.println("hUTreeMapMap : "+hUTreeMapMap);
		
		out.println("hUTreeMapMap.ceilingEntry(9L) : "+hUTreeMapMap.ceilingEntry(9L));
		
		out.println("hUTreeMapMap.ceilingKey(9L) : "+hUTreeMapMap.ceilingKey(9L));
		
		out.println("hUTreeMapMap.clone() : "+hUTreeMapMap.clone());
		
		out.println("hUTreeMapMap.comparator() : "+hUTreeMapMap.comparator());
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
