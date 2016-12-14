package com.ddb.javaCore.exceptiontest;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapDemo {

	public static void main(String[] args) {

		PrintStream out = System.out;
		Map<Long, Integer> hMap = new HashMap<Long, Integer>();

		Map<Long, Integer>
		
		hMap1.put(11L, 119);
		hMap1.put(12L, 112);
		hMap1.put(13L, 113);
		hMap1.put(14L, 114);
		hMap1.put(15L, 115);
		out.println("hMap.size() : " + hMap1.size());
		out.println("hMap : " + hMap1);

		Set<Map.Entry<Long, Integer>> hSetEntrys = hMap1.entrySet();
		out.println("Map--->key:Value ");
		for (Entry<Long, Integer> entry : hSetEntrys) {
			out.println("entry : " + entry);
			out.println(entry.getKey() + "=" + entry.getValue());
		}
		out.println(hSetEntrys);

		out.println("hMap.get(14L) : "+hMap1.get(14L));

        out.println("out all keys :");
        for (Long key : hMap1.keySet()) {
			out.println(key);
		}
            
        out.println("hMap.containsKey(11L) : "+hMap1.containsKey(11L));
        out.println("hMap.containsKey(12L) : "+hMap1.containsKey(12L));
        out.println("hMap.containsKey(13L) : "+hMap1.containsKey(13L));
        out.println("hMap.containsKey(14L) : "+hMap1.containsKey(14L));
        out.println("hMap.containsKey(15L) : "+hMap1.containsKey(15L));

        out.println();
        out.println("hMap.containsValue(119) : "+hMap1.containsValue(119));
        out.println("hMap.containsValue(112) : "+hMap1.containsValue(112));
        out.println("hMap.containsValue(113) : "+hMap1.containsValue(113));
        out.println("hMap.containsValue(114) : "+hMap1.containsValue(114));
        out.println("hMap.containsValue(115) : "+hMap1.containsValue(115));

        out.println("ɾ��ӳ��");
        hMap1.remove(11L);
        out.println("hMap : "+ hMap1);
           hMap1.replace(15L, 150);
           out.println("hMap : "+ hMap1);
           hMap1.replace(15L, 150, 520);
           out.println("hMap : "+ hMap1);
           
           out.println("hMap.values() :");
           for (Entry<Long, Integer> entry : hSetEntrys) {
        	   out.println(hMap1.values() );
			
		}
        
           out.println("hMap.values() :");
             for(Integer entry : hMap1.values()){
             out.println(entry);
             }        
        
             out.println("hMap.key() :");
             for(Long entry : hMap1.keySet()){
            	 out.println(entry);
             }        
             
        hMap1.clear();
        out.println("hMap.clear(): "+hMap1);
        
        
        
        
        
        


	}

	private static void put(long l, int i) {
		// TODO Auto-generated method stub
		
	}

}
