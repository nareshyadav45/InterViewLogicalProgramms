package java8Durga;

import java.util.Comparator;

public class LambdaWithMultiThreading {
public static void main(String[] args) {
	
	Runnable r=()->{
		for(int i=0;i<=10;i++) {
			System.out.println("Child Thread");
		}
	};
	
	//r.run();
	Thread t=new Thread(r);
	t.start();
	
	
	for(int i=0;i<=10;i++) {
		System.out.println("main thread");
	}
	
//	Comparator<T>;
}
}
