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

		}   //get Name()方法，取得文件名
		
		out.println("文件名 ： "+f.getName());
		
		out.println("文件路径 "+f.getPath());
		
		out.println("绝对路径： "+f.getAbsolutePath());
		
		out.println("父文件夹名称： "+f.getParent());
		
		out.println(f.exists()?"文件存在":"文件不存在");
		
		out.println(f.canWrite()?"文件可写":"文件不可写");
		
		out.println(f.canRead()?"文件可读":"文件不可读");
		
		out.println(f.isDirectory()?"是":"不是"+"目录");
		
		out.println(f.isFile()?"是文件":"不是文件");
		
		out.println(f.isAbsolute()?"是绝对路径":"不是绝对路径");
		
		out.println("文件最后修改时间"+f.lastModified());
		
		out.println("文件大小"+f.length()+"Bytes");
		
		
		
		
		
		
		

	}

}
