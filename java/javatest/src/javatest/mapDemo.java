package javatest;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapDemo {

	public static void main(String[] args) {

		PrintStream out = System.out;
		Map<Long, Integer> hMap = new HashMap<Long, Integer>();
		hMap.put(11L, 111);
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
		out.println(" ");

	}

}
