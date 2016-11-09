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
		
		hMap.put(11L, 119);
		hMap.put(12L, 112);
		hMap.put(13L, 113);
		hMap.put(14L, 114);
		hMap.put(15L, 115);
		out.println("hMap.size() : " + hMap.size());
		out.println("hMap : " + hMap);

		Set<Map.Entry<Long, Integer>> hSetEntrys = hMap.entrySet();
		out.println("Map--->key:Value ");
		for (Entry<Long, Integer> entry : hSetEntrys) {
			out.println("entry : " + entry);
			out.println(entry.getKey() + "=" + entry.getValue());
		}
		out.println(hSetEntrys);

		out.println("hMap.get(14L) : "+hMap.get(14L));

        out.println("out all keys :");
        for (Long key : hMap.keySet()) {
			out.println(key);
		}
            
        out.println("hMap.containsKey(11L) : "+hMap.containsKey(11L));
        out.println("hMap.containsKey(12L) : "+hMap.containsKey(12L));
        out.println("hMap.containsKey(13L) : "+hMap.containsKey(13L));
        out.println("hMap.containsKey(14L) : "+hMap.containsKey(14L));
        out.println("hMap.containsKey(15L) : "+hMap.containsKey(15L));

        out.println();
        out.println("hMap.containsValue(119) : "+hMap.containsValue(119));
        out.println("hMap.containsValue(112) : "+hMap.containsValue(112));
        out.println("hMap.containsValue(113) : "+hMap.containsValue(113));
        out.println("hMap.containsValue(114) : "+hMap.containsValue(114));
        out.println("hMap.containsValue(115) : "+hMap.containsValue(115));

        out.println("É¾³ýÓ³Éä");
        hMap.remove(11L);
        out.println("hMap : "+ hMap);
           hMap.replace(15L, 150);
           out.println("hMap : "+ hMap);
           hMap.replace(15L, 150, 520);
           out.println("hMap : "+ hMap);
           
           out.println("hMap.values() :");
           for (Entry<Long, Integer> entry : hSetEntrys) {
        	   out.println(hMap.values() );
			
		}
        
           out.println("hMap.values() :");
             for(Integer entry : hMap.values()){
             out.println(entry);
             }        
        
             out.println("hMap.key() :");
             for(Long entry : hMap.keySet()){
            	 out.println(entry);
             }        
             
        hMap.clear();
        out.println("hMap.clear(): "+hMap);
        
        
        
        
        
        


	}

}
