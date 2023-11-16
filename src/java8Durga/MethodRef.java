package java8Durga;

public class MethodRef {
	public static void main(String[] args) {
		
		Runnable r=MethodAndConstructorRef::m1;
		Thread t=new Thread(r);
		t.start();
		
		
		
		
		
	}

}
