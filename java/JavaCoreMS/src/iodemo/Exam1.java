package iodemo;

import java.io.File;
import java.io.FileWriter;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fwriter =new FileWriter(config);
		fwriter.write("这是一个Java上机题的文档文件：\n");
		fwriter.write("一个正整数，它加上100后就是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？\n");
		fwriter.write("需要的参数如下：通过程序读取文本件，解析下面的字符串得到需要的参数值：\n");
		fwriter.write("100#168#1000\n");
		fwriter.write("题目的要求是：在此文档中使用程序写入解题思路，同时在源码中，尽可能多写注释让人一眼看懂源代码逻辑：\n");
		fwriter.write("讲计算的结果，最后再写回这个配置文件的尾部，有多个结果时换行输出，以方便阅读。");
		
		
	}

}
