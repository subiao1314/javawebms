package javatest;

import java.util.List;
import java.io.PrintStream;
import java.util.ArrayList;

public class listDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> strList =new ArrayList<String>();
       List<String> strList2 = new ArrayList<String>();
       List<Integer> intList = new ArrayList<Integer>();
       List<String> hmList = new ArrayList<String>();
       
       strList2.add("I");
       strList2.add("am");
       strList2.add("subiao");
       
       PrintStream out=System.out;
		//��ӡlist����
	out.println("strList .size() : "+strList .size());
	out.println("intList .size() : "+intList .size());
	out.println("hmList .size() : "+hmList .size());
	out.println("strList2 .size() : "+strList2 .size());
		
       //���Ԫ��
       out.println("strList ���Ԫ��");
       strList.add("I ");
       strList.add(" LOVE");
       strList.add(" China");
       strList.add("!");
       strList.add("!");
       out.println("strList.toString() :"+strList.toString());
       
       //Listɾ��Ԫ��
       out.println("strList ɾ��Ԫ��");
       strList.remove("!");
       out.println("strList.toString() :"+strList.toString());
     
       //Listɾ��ָ��λ��Ԫ��
       out.println("strList ɾ��ָ��λ��Ԫ��");
       strList.remove(0);
       out.println("strList.toString() :"+strList.toString());
       
       //List���ָ��λ��Ԫ��
       out.println("strList ɾ��ָ��λ��Ԫ��");
       strList.remove(0);
       out.println("strList.toString() :"+strList.toString());
       
       //Listɾ��ָ��λ��Ԫ��
       out.println("strList ɾ��ָ��λ��Ԫ��");
       strList.remove(0);
       out.println("strList.toString() :"+strList.toString());
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
		
	}

}
