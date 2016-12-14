package com.ddb.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class Exam {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
      PrintStream prit=System.out;
      File file =new File("D:"+File.separator+"Exam"+File.separator+"exam.txt");
		if (!file.exists()) {
			file.getParentFile().mkdirs();
		}
		
		FileInputStream in=new  FileInputStream(file);
		InputStreamReader inreader=new InputStreamReader(in);
		OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream(file), "GBK");
		out.write("  这是一个Java上机题的文本文档：\r\n");
		out.write("  一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该树是多少？\r\n");
		out.write("  需要的参数如下：通过程序程序读取文件，解析下面的字符串得到所需要的参数值\r\n");
		out.write("  100#168#1000\r\n");
		out.write("  题目的要求是：在此文档中用程序写入解题思路，同时在源码中，尽可能多写注释让人一眼看懂代码逻辑\r\n");
		out.write("  将计算结果，最后再写回这个配置文件的尾部，有多个结果时换行输出，以方便阅读。\r\n");
		out.write("\r\n");
        
		int l,m,n;
		Double a;
		for (int i = 1; i < 1001; i++) {
			l=i+100;
			m=l+168;
			if (Math.sqrt(l)%1<0) {
               if (Math.sqrt(m)%1<0) {
            	          prit.println("存在此正整数为： "+i);
               } else {
				        
               }
               } else {
                        
			}
		}
			
		inreader.close();
		out.close();
		in.close();
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
