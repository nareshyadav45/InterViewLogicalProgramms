package java8Durga;

public class one implements DefaultMethod{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	public  void m3() {
		
		System.out.println("changing impl of default method of interface in impl class");
		
	}
	
	
	public static void main(String[] args) {
		one p=new one();
		p.m3();
	}

}
