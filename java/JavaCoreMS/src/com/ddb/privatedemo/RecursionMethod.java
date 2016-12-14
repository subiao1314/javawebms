package com.ddb.privatedemo;

public class RecursionMethod {
      //�ǵݹ鷽ʽʵ��"1+2+...+n"
	 public int addNonrecursion(int n){
		 int result=0;
		 for(int i=1;i<=n;i++){
			 result+=i;
		 }
		 return result;
	 }
	
	 //�ݹ鷽������
	 public int addRecursion(int n){
		 //�ݹ���ڣ���n��1ʱ�����ͻ���㷵��
		 if (n<=1) return n;
			return n+addRecursion(n-1);
		
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecursionMethod test =new RecursionMethod();
		int result=test.addNonrecursion(10);
		System.out.println("�ǵݹ鷽������1+2+...+n���"+result);
		
		int result2=test.addRecursion(10);
		System.out.println("�ݹ鷽������1+2+...+n���"+result2);
		
		
		
		
	}

}
