package ConsrtutorRef;

public class Test {
	public static void main(String[] args) {
		
		Provider po=Student::new;
		
		Student student = po.getProvider();
		student.display();
		
		
		
		
	}

}
