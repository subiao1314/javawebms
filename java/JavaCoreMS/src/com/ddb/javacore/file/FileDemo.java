package com.ddb.javacore.file;

import java.io.File;
import java.io.PrintStream;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		File f=new File("c:\\1.txt");
		if (f.exists()) {
			f.delete();
		} else {
			try {
				f.createNewFile();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}   //get Name()������ȡ���ļ���
		
		out.println("�ļ��� �� "+f.getName());
		
		out.println("�ļ�·�� "+f.getPath());
		
		out.println("����·���� "+f.getAbsolutePath());
		
		out.println("���ļ������ƣ� "+f.getParent());
		
		out.println(f.exists()?"�ļ�����":"�ļ�������");
		
		out.println(f.canWrite()?"�ļ���д":"�ļ�����д");
		
		out.println(f.canRead()?"�ļ��ɶ�":"�ļ����ɶ�");
		
		out.println(f.isDirectory()?"��":"����"+"Ŀ¼");
		
		out.println(f.isFile()?"���ļ�":"�����ļ�");
		
		out.println(f.isAbsolute()?"�Ǿ���·��":"���Ǿ���·��");
		
		out.println("�ļ�����޸�ʱ��"+f.lastModified());
		
		out.println("�ļ���С"+f.length()+"Bytes");
		
		
		
		
		
		
		

	}

}
