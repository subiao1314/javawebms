package com.ddb.java.exam;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        PrintStream out=System.out;
        File file =new File("D:"+File.separator+"ExamTest"+File.separator+"test.txt"); //创建路径
        if (!file.exists()) {
			file.getParentFile().mkdirs(); //创建父类文件夹
		}
        FileOutputStream config =new FileOutputStream(file);
        Writer writer=new OutputStreamWriter(config,"utf-8");
		writer.write("  这是一个java上机题的文档：\r\n");
		writer.write("  一个正整数，它加上100后是一个完全平方数，再加上168后又是一个完全平方数，请问这个正整数是什么？\r\n");
		writer.write("  需要的参数如下，通过程序读取文件，解析下面的字符得到所需的参数值。\r\n");
		writer.write("  100#168#1000\r\n");
		writer.write("  题目的要求是：在此文档中用程序写入解题思路，同时在源码中，尽可能多写注释让人一眼看懂代码逻辑。\r\n");
		writer.write("  将计算结果，最后写回这个配置文件的尾部，有多个时分行输出，以方便阅读。\r\n");
		writer.write("\r\n");
		
		//读取文件内容
		String keyString; //用来保存有参数的一行
		ArrayList<Integer> numList=new ArrayList<Integer>();//numList用来保存参数和结果
		InputStream iStream=new FileInputStream(file);
		Reader reader=new FileReader(file);
		Scanner scanner=new Scanner(iStream,"utf-8");
		while (scanner.hasNextLine()) {
		     keyString=scanner.nextLine();	
		     out.println("读取当前内容为："+keyString);
		     if(keyString.indexOf("#")!=-1){ //如果有#就读出保存到keyString    
		   //  extractNumber(keyString.sumList);
		      
		     
		     
		     }
		
		
		}	
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
