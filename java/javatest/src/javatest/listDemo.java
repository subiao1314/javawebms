package javatest;

import java.util.List;
import java.io.PrintStream;
import java.util.ArrayList;

public class listDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> strList =new ArrayList<String>();
       List<String> strList2 = new ArrayList<String>();
       List<Integer> intList = new ArrayList<Integer>();
       List<String> hmList = new ArrayList<String>();
       
       strList2.add("I");
       strList2.add("am");
       strList2.add("subiao");
       
       PrintStream out=System.out;
		//打印list长度
	out.println("strList .size() : "+strList .size());
	out.println("intList .size() : "+intList .size());
	out.println("hmList .size() : "+hmList .size());
	out.println("strList2 .size() : "+strList2 .size());
		
       //添加元素
       out.println("strList 添加元素");
       strList.add("I ");
       strList.add(" LOVE");
       strList.add(" China");
       strList.add("!");
       strList.add("!");
       out.println("strList.toString() :"+strList.toString());
       
       //List删除元素
       out.println("strList 删除元素");
       strList.remove("!");
       out.println("strList.toString() :"+strList.toString());
     
       //List删除指定位置元素
       out.println("strList 删除指定位置元素");
       strList.remove(0);
       out.println("strList.toString() :"+strList.toString());
       
       //List添加指定位置元素
       out.println("strList 删除指定位置元素");
       strList.remove(0);
       out.println("strList.toString() :"+strList.toString());
       
       //List删除指定位置元素
       out.println("strList 删除指定位置元素");
       strList.remove(0);
       out.println("strList.toString() :"+strList.toString());
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
		
	}

}
