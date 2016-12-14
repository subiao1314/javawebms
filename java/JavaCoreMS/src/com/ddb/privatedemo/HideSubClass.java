package com.ddb.privatedemo;

import javax.swing.SortingFocusTraversalPolicy;

class Father{
	public static void  overWriting() {
		System.out.println("###father method");
	}
	static class son extends Father{
		public static void  overWriting() {
			System.out.println("###--son mathod");
		}
		
	}
}

public class HideSubClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Father dad=new son();
	//	dad.overWriting();
		
		
		
	}

}
