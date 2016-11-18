package com.ddb.java.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FullSquare {

	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		// 获取文件地址，如果文件存在直接写，不存在就创建
		File file = new File("F:" + File.separator + "Test" + File.separator + "config.txt");
		createFile(file);
		// 向文件写入内容
		FileOutputStream config = new FileOutputStream(file);
		Writer writer = new OutputStreamWriter(config, "utf-8");
		writer.write("这是一个java上机题的文档文件：\r\n");
		writer.write("一个正整数，它加上100后是一个完全平方数，再加上168有是一个完全平方数，请问该数是多少？\r\n");
		writer.write("需要的参数如下：通过程序读取本文件，解析下面的字符串得到需要的参数值\r\n");
		writer.write("100#168#1000\r\n");
		writer.write("题目的要求是：在此文档中使用程序写入解题思路，同时在源码中，尽可能多写注释让人一眼看懂代码逻辑\r\n");
		writer.write("将计算的结果，最后再写回这个配置文件的尾部，有多个结果时换行输出，以方便阅读。");
		writer.flush();
		// 读取文件内容
		String keyString; // keyString 用来保存有参数的一行
		List<Integer> numList = new ArrayList<Integer>(); // numList用来保存参数和结果
		InputStream iStream = new FileInputStream(file);
		Scanner scanner = new Scanner(iStream, "utf-8");
		while (scanner.hasNextLine()) {
			keyString = scanner.nextLine();
			out.println("读取当前行内容为 ： " + keyString);
			if (keyString.indexOf("#") != -1) { // 如果此行有“#”，就取出保存到keyString
				extractNumber(keyString, numList); // 调用方法取出keyString中所需要的参数,存到numList中
				out.print("当前行中，有需要的参数，参数为     ");
				for (Integer integer : numList) {
					out.print(integer + "  ");
				}
				out.println("\r\n不再读取当前文件，读取配置文件的方法退出！");
				break;
			}
		}
		// 计算题目
		int keys = numList.size(); // 取出只有参数的numList大小
		squareNumbers(numList); // 算出完全平方数，添加到numList后面
		writer.write("\r\n" + printThought()); // 向文件中写入解题思路
		writer.write("\r\n经过分析计算，结果为 ： ");
		out.println("\r\n经过分析计算，结果为 ： ");
		// out.println("结果为 ： ");
		if (keys == numList.size()) { // 如果没有增加数据，则没有答案
			writer.write("\r\n+++++对不起没有这个数！+++++");
			out.println("+++++对不起没有这个数！+++++");
		} else {
			for (int i = keys; i < numList.size(); i++) { // 输出算出的答案
				writer.write("\r\n" + numList.get(i));
				out.println(numList.get(i));
			}
		}
		writer.close();
		scanner.close();
	}
	// 文件不存在就创建
	private static void createFile(File file) throws IOException {
		if (!file.exists()) {
			if (file.isDirectory()) {
				file.mkdirs();
			} else {
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
		}
	}
	private static void extractNumber(String string, List<Integer> numList) {
		int i, j;
		String str = string;
		while ((i = str.indexOf("#")) != -1) {
			j = str.indexOf("#", i + 1);
			if (i != 0) {
				numList.add(Integer.parseInt(str.substring(0, i)));
				str = str.substring(i);
			} else if (j >= (i + 1)) {
				if (j == i + 1) {
					str = str.substring(j);
				} else {
					numList.add(Integer.parseInt(str.substring(1, j)));
					str = str.substring(j);
				}
			} else if (i == str.length() - 1) {
				break;
			} else if (j == -1) {
				numList.add(Integer.parseInt(str.substring(i + 1)));
				str = str.substring(i + 1);
			}
		}
	}
	// 计算完全平方数，(int)Math.sqrt(x)==Math.sqrt，就是完全平方数
	private static void squareNumbers(List<Integer> numList) {
		PrintStream out = System.out;
		out.println("通过读取配置文件得到参数为 ：" + numList.get(0) + "\t" + numList.get(1) + "\t" + numList.get(2));
		int a, b;
		double x, y;
		for (int i = 0; i <= numList.get(2); i++) {
			a = (int) Math.sqrt(i + numList.get(0));
			x = Math.sqrt(i + numList.get(0));
			b = (int) Math.sqrt(i + numList.get(1));
			y = Math.sqrt(i + numList.get(1));
			if ((x - a == 0) && (y - b == 0)) {
				numList.add(i);
			}
		}
	}
	// 解题思路
	private static String printThought() {
		String string;
		return string = ("\r\n-------解题思路--------" + "\r\n1.将题目写入文件" + "\r\n\t1).判断文件是否存在，如果不存在创建文件"
				+ "\r\n\t2).创建OutputStream流" + "\r\n\t3).在使用writer写入文件" + "\r\n2.读出文档文件" + "\r\n\t1).创建IntputStream流"
				+ "\r\n\t2).使用Scanner扫描文件" + "\r\n\t3).判断hasnextLine（）是否存在并打印"
				+ "\r\n\t4).判断nextLine（）是否有关键字“#”，如果有的话就保存到keyString" + "\r\n\t5).结束扫描，输出找到的参数" + "\r\n3.使用while循环获取参数"
				+ "\r\n\t1).使用 indexOf(“#”)判断第一个“#”的位置是否等于0，如果不等于0就使用subString(0,indexOf())"
				+ "\r\n\t\t获取参数，使用keyString=subString(indexOf()+1),截掉这一段" + "\r\n\t2).判断“#”是否在最后一个，在最后一个就跳出循环"
				+ "\r\n\t3).在使用ingdexOf(1)判断下一个“#”位置是否等于-1" + "\r\n\t\t1>.等于-1则剩下的就是需要的参数"
				+ "\r\n\t\t2>.不等于-1\t\ta.如果两个“#”连着的就去掉第一个“#”\tb.不连着，两者中间就是所需的参数，再保留第二个“#”" + "\r\n\t\t后面的字符串"
				+ "\r\n4.计算结果" + "\r\n\t1).定义两个int数，两个double数" + "\r\n\t2)int数用来存开方后的数转成int型"
				+ "\r\n\t3)double数用来存开方后的数" + "\r\n\t4)判断int数等于double数就是结果" + "\r\n5.向文件写入结果和思路"
				+ "\r\n----------------");
	}
}
