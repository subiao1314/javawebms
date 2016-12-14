package com.java.test.exception;

public class DealException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  System.out.println("---A、计算A之前");
		try {
			
			int arr[]=new int[5];
			arr[0]=3;
			arr[1]=6;
			//arr[1]=0;
			arr[10]=7;
			int result =arr[0]/arr[1];
			System.out.println("---B、除法jisuanjies"+result);}
			catch (ArithmeticException ex) {
				// TODO: handle exception
				ex.printStackTrace();
			}
		catch (ArrayIndexOutOfBoundsException ex ) {
			// TODO: handle exception
	            ex.printStackTrace();
           
		}
		finally {
			System.out.println("---c chichubuguanshifouchucuodouhuizhixing");
		}
		System.out.println("end of main()method!!");
		
		
	}

}
