package com.ddb.privatedemo;

public class ArraySortUingPackage {

	public static void printArr(int[] arr,String msg) {
		System.out.println(msg);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	class student{
		public student(String name) {
			super();
			this.name = name;
		}
		
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		private String name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr={3,5,2,6,8,4,7};
		printArr(arr, "����ǰ��");
		java.util.Arrays.sort(arr);//����Java�İ����ṩ�ķ�������
		printArr( arr, "����� ");
		
		
		
		
		
	}

}
