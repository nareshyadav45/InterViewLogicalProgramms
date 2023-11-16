package InterfaceMultipleInher;

public class threee implements one,two{

	@Override
	public void hi() {
		System.out.println("hi method");
		
	}

	@Override
	public void hello() {
		System.out.println("hello method");
		
	}
	
	public static void main(String[] args) {
		threee t=new threee();
		t.hi();
		t.hello();
	}

}

