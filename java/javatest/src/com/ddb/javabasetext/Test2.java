package com.ddb.javabasetext;

import java.lang.reflect.Method;

class Run implements Runnable{
	@Override
	public void run() {
      Class<?>class1=Test3.class;
      try {
		Method me=class1.getMethod("main1");
		me.invoke(class1.newInstance());
	} catch (Exception  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
	}
	
}

public class Test2 {

	public static void main(String[] args) {
      Run run=new Run();
      Thread t=new Thread(run);
      t.start();
		
	}

}
