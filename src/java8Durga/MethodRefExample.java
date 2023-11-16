package java8Durga;

public class MethodRefExample {
	
	private static void sum(int x,int y) {
		System.out.println("The sum :"+(x+y));
		
	}
	
	
	public static void main(String[] args) {
		
	MethodRefExample instanceRef=new MethodRefExample();
	
	//MethodRefInterface m=instanceRef::sum;
	
	MethodRefInterface m=MethodRefExample::sum;
	m.add(12, 340);	
	}
	
	
	
	
	

}
