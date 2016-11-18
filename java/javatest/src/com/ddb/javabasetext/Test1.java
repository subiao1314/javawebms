package com.ddb.javabasetext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.helpers.AbstractMarshallerImpl;

public class Test1 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      PrintStream out=System.out;
      File file =new File("F:"+File.separator+"Test"+File.separator+"config1");
      //创建一个文件夹
      if (!file.exists()) {
		file.getParentFile().mkdirs();
	}
		FileOutputStream outputStream=new FileOutputStream(file);
		Writer writer=new OutputStreamWriter(outputStream,"GBK");
		//用字节流写入题目要求
		writer.write("  1.   计算XX以内所有能被7整除的数的和以及平均数。\r\n");
		writer.write("    要求：\r\n");
		writer.write("    A.xx的值从控制台用Scanner读取；创建文本文件，将当前题目及要求写入文档\r\n");
		writer.write("    B.代码编写要具有灵活性，不要我随便改个参数导致你的代码，大面积修改！！\r\n");
		writer.write("    C.在文档中打出解题思路，同时输出从控制台读取的值，符合条件的数有几个？"
				+ "对符合条件的数，排序输出！和是多少，平均数是多少，最大值是多少，最小值是多少？\r\n");
		writer.flush();     
		//关闭字符流
		out.println("请输入一个正整数，计算0到这个数内所有能被7整除的数的和以及平均数：");
        //利用scanner语句，从控制台输入数据		
      Scanner scanner =new Scanner(System.in);
       int num;  //定义一整型变量来接收输入的参数
       num=scanner.nextInt();
      int a=7,max=0,average=0,sum=0;
      ArrayList<Integer> list = new ArrayList<Integer>();
      //定义变量，分别用来接收所求得的最大值，最小值，平均值，所有数之和，和所有满足要求的数组
      if (num>=a) {
		
      for (int i = a; i <= num; i++) {
		 if (i%a==0) {
           sum=sum+i;	
           list.add(i);	
           if (i>=max) {
			  max=i;
		    }
         }
		
	    }		 
      }else{
    	  out.println("0到"+num+"之内没有能被"+a+"整除的数");
    	  return;
    	  }
    	average=sum/list.size(); 
      //将计算结果输出来
      out.println("最大值是："+max);
      out.println("最小值是："+list.get(0));
      out.println("这些数之和是："+sum);
      out.println("这些数的平均值是："+average);
      out.println("符合要求的数组为：");
    	  for (Integer integer : list) {
			out.print(integer+"\t");
		}
   //所得结果输入到文档中
    writer.write("\r\n");
    writer.write("所得的最大值为       "+max+"\r\n");
    writer.write("最小值是：    "+list.get(0)+"\r\n");
    writer.write("这些数之和是：    "+sum+"\r\n");
    writer.write("这些数的平均值是："+average+"\r\n");
    writer.write("符合要求的数组为：  "+"\r\n");
   writer.write(""+list);;
    writer.flush();  
   
	}
	
}
      
      

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
        
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
      
