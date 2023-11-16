package java8Durga;

public class LambdaImpl {
	
	public static void main(String[] args) {
		
//		Functionalnter f=()->System.out.println("calling lambda ex by funtional interface");
//		f.m1();
		//f.m2();
		
//		FunctionalInterface2 f2=(a,b)->System.out.println(a+b);
//		f2.add(12, 12.0);
		
		
				FunctionalInterface2 ff=(a,b)->a+b;
		System.out.println(ff.add(12, 12.0));
		
		
		Functionalnter f=n->n*n;
		System.out.println(f.squareIt(10));
		
	}

}
