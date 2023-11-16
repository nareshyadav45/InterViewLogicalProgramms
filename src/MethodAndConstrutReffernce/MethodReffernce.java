package MethodAndConstrutReffernce;

public class MethodReffernce {
	public static void main(String[] args) {
		
//		MethodInterface methodRef=()->{
//			System.out.println("Method Interface Implementaion");
//		};
		
		MethodInterface methodRef=Stuff::doStuff;
		//methodRef.doSmthg();
		
		Runnable run=RunnMethod::sqaure;
		
		//run.run();
		Thread t=new Thread(run);
		//t.start();
		
		
		//Non Static Methods referrnce
		
		Stuff ob=new Stuff();
		Runnable rub2=ob::printHello;
		
		Thread tt=new Thread(rub2);
		tt.start();
		
		
	
		
		
		
		
	}

}
