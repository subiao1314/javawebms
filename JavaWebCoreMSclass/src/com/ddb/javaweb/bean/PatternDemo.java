package com.ddb.javaweb.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

import javafx.scene.chart.PieChart.Data;

public class PatternDemo {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

/*	final String REGEX = "\\bcat\\b";
	final String INPUT = "cat cat cat cattie cat";
	Pattern p = Pattern.compile(REGEX);
	Matcher m = p.matcher(INPUT); // 获取 matcher 对象
*/
		
		
	/*	private static final String regex="\\bcat\\b";
		  final String all="cat cat cat cattile cat"
		Pattern p=Pattern.compile(regex);
		Matcher m=p.Matcher(all); 
		*/

		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:sss");
		System.out.println(" 现在的时间："+format.format(date));
		
		
		
	/*	final String regex="\\bcat\\b";
		String all="cat,cat,cattil,cat";
		Pattern p = Pattern.compile(regex);
		Matcher m=((Object) p).matcher(all);*/
		
	}

}
