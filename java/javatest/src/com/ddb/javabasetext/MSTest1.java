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

public class MSTest1 {

	public static void main(String[] args) throws IOException {
		File file = new File("F:" + File.separator + "MSTest" + File.separator + "mytest");
		// 创建地址文件
		if (!file.exists()) {
			file.getParentFile().mkdirs();
		}
		PrintStream out = System.out;
		FileOutputStream fout = new FileOutputStream(file);  //建立输入流！！！
		Writer writer = new OutputStreamWriter(fout); // 建立输入流，并输入题目要求
		writer.write("    1.   计算XX以内所有能被7整除的数的和以及平均数。 \r\n");
		writer.write("     要求：\r\n ");
		writer.write("        A.xx的值从控制台用Scanner读取；创建文本文件，将当前题目及要求写入文档： \r\n");
		writer.write("        B.代码编写要具有灵活性，不要我随便改个参数导致你的代码，大面积修改！！： \r\n");
		writer.write("        C.在文档中打出解题思路，同时输出从控制台读取的值，符合条件的数有几个？" + "对符合条件的数，排序输出！和是多少，平均数是多少，最大值是多少，最小值是多少？ \r\n");
		writer.write("       \r\n");
		writer.flush();
		// 分别设置变量
		/**
		 * num:接收数值， max：最大数 average：平均值 sum：所有数之和 a:用来整除的数
		 */
		int num, sum = 0, max = 0, average = 0, a = 7;
		ArrayList list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		// 请输入需要求的正整数a
		while (true) {   //循环控制来判断所输入的是否为大于7的正整数
			out.println("请输入一个大于7的正整数：");
			if (scanner.hasNextInt()) {
				num = scanner.nextInt(); // num接收控制台输入的数值

				if (num < a) {

					out.println("您输入的有误，请重新输入一个大于7的正整数：");
					continue;
				} else {
					break;
				}
			} else {
				out.println("您输入的有误，请重新输入一个大于7的正整数：");
				scanner.next();
			}
		}
            //for循环进行数学计算
		for (int i = a; i <= num; i++) {
			if (i % a == 0) {
				sum += i;
				list.add(i);
				if (i >= max) {
					max = i;
				}
			}
		}

		average = sum / list.size();
		// 计算并输出所得结果
		out.println("  您输入的数值为：" + num);
		out.println("  符合条件的数有 " + list.size() + "  个；分别为：");
		for (Object object : list) {
			out.print(object+"  ");
		}
		out.println();
		out.println("  其中最大值为："+max);
	//	out.println("  其中最大值为："+list.get(list.size()-1));
		out.println("  其中最小值为："+list.get(0));
		out.println("  所有满足条件的值和为："+sum);
		out.println("  其中平均值为："+average);
     //  list.sort(null);  队列进行排序
		
		writer.write("\r\n");
		writer.write(   "  您输入的数值为：" + num  + "\r\n");
		writer.write(   "  符合条件的数有 " + list.size() + " 个；分别为："  + "\r\n");
		writer.write(   list  + "\r\n");
		writer.write(   "  其中最大值为："+max  + "\r\n");
		writer.write(   "  其中最小值为："+list.get(0)  + "\r\n");
		writer.write(   "  所有满足条件的值和为："+sum  + "\r\n");
		writer.write(   "  其中平均值为："+average  + "\r\n");
		writer.close();
		
		
		
		
	}

}
