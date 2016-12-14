package com.ddb;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Theacher {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*    PrintStream out=System.out;
    File file = new File("F:"+File.separator+"Theacher"+File.separator+"theacher.txt"); 
 		file.mkdir();
 		file.createNewFile();*/
 		
 		System.currentTimeMillis();
 		
 		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:sss");
		System.out.println(" 现在的时间："+format.format(date));
		
 		
	}

}
