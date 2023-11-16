package com.java8.lambda;

public class ThreadMain {
	public static void main(String[] args) {
		
	
	
	Runnable firstThread=()->{
		
		for(int i=0;i<=10;i++) {
			System.out.println("MyThread :"+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	};
	
	Thread t=new Thread(firstThread);
	t.setName("NARESH");
	t.start();
	
	
	//Second Thread
	
	Runnable secondThread=()->{
		for(int i=1;i<=10;i++) {
			System.out.println("Square of Number "+i*2 );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	
	
	Thread t2=new Thread(secondThread);
	t2.start();
	
	
	
	}
}
