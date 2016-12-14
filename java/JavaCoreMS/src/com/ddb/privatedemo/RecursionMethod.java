package com.ddb.privatedemo;

public class RecursionMethod {
      //非递归方式实现"1+2+...+n"
	 public int addNonrecursion(int n){
		 int result=0;
		 for(int i=1;i<=n;i++){
			 result+=i;
		 }
		 return result;
	 }
	
	 //递归方法计算
	 public int addRecursion(int n){
		 //递归出口，讲n《1时函数就会逐层返回
		 if (n<=1) return n;
			return n+addRecursion(n-1);
		
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecursionMethod test =new RecursionMethod();
		int result=test.addNonrecursion(10);
		System.out.println("非递归方法计算1+2+...+n结果"+result);
		
		int result2=test.addRecursion(10);
		System.out.println("递归方法计算1+2+...+n结果"+result2);
		
		
		
		
	}

}
