package java8Durga;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInter {
	public static void main(String[] args) {
		Supplier<Date> s=()->new Date();
		//System.out.println(s.get());
		
		Supplier<String> ss=()->{
			String otp="";
			for(int i=1;i<=6;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println("otp : "+ss.get());
		System.out.println("otp : "+ss.get());
		System.out.println("otp : "+ss.get());
		System.out.println("otp : "+ss.get());
		System.out.println("otp : "+ss.get());
		
	}

}
