package java8Durga;

public class AllRight implements left,Right {
	public void m3() {
	 System.out.println("child method");
	}
	
	public static void main(String[] args) {
		AllRight a=new AllRight();
		a.m3();
	}

}
