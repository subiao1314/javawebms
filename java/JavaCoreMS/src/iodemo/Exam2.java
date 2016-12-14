package iodemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Exam2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("D:\\team.txt"),"GBK");
		out.write("100#168#1000\r\n");
		out.write("我要写入记事本文件的内容\r\n");
		out.close();
		
		
		
		
	}

}
