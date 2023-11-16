package com.java8.lambda;

public class MainClass {
	public static void main(String[] args) {
		
		//MyInter myInter=new MyInterImpl();
		//myInter.Hello();
		
   //...................................AnnonymousClass...................................................................		
//		MyInter my=new MyInter() {
//			
//			@Override
//			public void Hello() {
//				System.out.println("This Is My First Annonymous Class ");
//				
//			}
//
////			@Override
////			public void howAreYou() {
////				System.out.println("Feeling fine First Annonymous class");
////				
////			}
//		};
//		
//		my.Hello();
//		//my.howAreYou();
		
//		MyInter second=new MyInter() {
//			
//			@Override
//			public void Hello() {
//				System.out.println("This Is My Second Annonymous Class ");
//				
//			}
//
////			@Override
////			public void howAreYou() {
////				System.out.println("Feeling fine Second Annonymous class");
////				
////			}
//		};
//		
//		second.Hello();
//		//second.howAreYou();
//		
		
		
//......................................LambdaExpression......................................................
		
		MyInter i = () ->
			System.out.println("this is my first lambda expression first statement ");
			System.out.println("this is my first lambda expression second statement");
		
		i.Hello();
		
		MyInter i2=()->{
			System.out.println("Second Lambda Expression ");
		};
		
		i2.Hello();
		
		SumInterface sumInter= (int c,int d) ->{
			return c+d;
		};
		
		System.out.println(sumInter.SumOfVar(12, 13));
		System.out.println(sumInter.SumOfVar(45, 0));
		
		//simple way
		
		SumInterface sum=(a,b)->  a+b;
		
		System.out.println("Simplest Way : "+sum.SumOfVar(30, 90));
		
		
		
		
		LenghtInterface l=(String str)->{
			return str.length();
		}
		;
		
		System.out.println("Length of string "+l.getStringlenght("hi"));
		
		
		
		
		LenghtInterface l2=(str)-> str.length();
		
		System.out.println("length of string "+l2.getStringlenght("hello"));
		
		
		
		
		
		
		
	}

}
