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
		out.write("  ����һ��Java�ϻ�����ı��ĵ���\r\n");
		out.write("  һ����������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�\r\n");
		out.write("  ��Ҫ�Ĳ������£�ͨ����������ȡ�ļ�������������ַ����õ�����Ҫ�Ĳ���ֵ\r\n");
		out.write("  100#168#1000\r\n");
		out.write("  ��Ŀ��Ҫ���ǣ��ڴ��ĵ����ó���д�����˼·��ͬʱ��Դ���У������ܶ�дע������һ�ۿ��������߼�\r\n");
		out.write("  ���������������д����������ļ���β�����ж�����ʱ����������Է����Ķ���\r\n");
		out.write("\r\n");
        
		int l,m,n;
		Double a;
		for (int i = 1; i < 1001; i++) {
			l=i+100;
			m=l+168;
			if (Math.sqrt(l)%1<0) {
               if (Math.sqrt(m)%1<0) {
            	          prit.println("���ڴ�������Ϊ�� "+i);
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
