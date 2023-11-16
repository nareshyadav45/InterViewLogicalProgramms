package java8Durga;

public class MethodAndConstructorRef {
	
	public static void m1() {
		for(int i=0;i<=5;i++) {
			System.out.println("static Thread using ref");
		}
	}
	
	private int m2() {
		for(int i=0;i<=5;i++) {
			System.out.println("instance thread ref");
		}
		return 7;
	}
	
	
	
	
	public static void main(String[] args) {
//		Runnable r=()->{
//			for(int i=0;i<=5;i++) {
//				System.out.println("Chiled Thread");
//			}
//		};
		
		Runnable r1=MethodAndConstructorRef::m1;
		
		
		MethodAndConstructorRef instance=new MethodAndConstructorRef();
		Runnable r=instance::m2;
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("Main Thraed");
			
		}
		
		
		
		
		
	}

}
