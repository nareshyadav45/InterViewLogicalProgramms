package java8Durga;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorFun {
	public static void main(String[] args) {
		IntUnaryOperator o=l->l*l;
		System.out.println(o.applyAsInt(9));
		
		BiFunction<String, String, String> v=(b1,b2)->b1+b2;
		System.out.println(v.apply("Naresh ", "Yadav"));
		
		BinaryOperator<String> c=(d1,d2)->d1+d2;
		System.out.println(c.apply("sanghmesh", "nandi"));
		
		IntUnaryOperator n1=n->n+1;
		IntUnaryOperator n2=n->n*n;
		System.out.println(n1.andThen(n2).applyAsInt(4));
	}

}
