package java8Durga;

public class IntrefImpl implements InterF{
	

	public static void m1() {
		System.out.println("Child static interF method");
	}
	public static void main(String[] args) {
		InterF.m1();
//		m1();
		IntrefImpl.m1();
		IntrefImpl p=new IntrefImpl();
		p.m1();
	}

}
