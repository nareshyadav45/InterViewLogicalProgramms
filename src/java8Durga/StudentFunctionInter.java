package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentFunctionInter {
	
	private String name;
	private int marks;
	
	public StudentFunctionInter(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "StudentFunctionInter [name=" + name + ", marks=" + marks + "]";
	}
	
	public static void main(String[] args) {
		
		List<StudentFunctionInter> l=new ArrayList<>();
		l.add(new StudentFunctionInter("naresh", 90));
		l.add(new StudentFunctionInter("sangha", 80));
		l.add(new StudentFunctionInter("saurabh", 60));
		l.add(new StudentFunctionInter("raju", 20));
		l.add(new StudentFunctionInter("nilesh", 35));
		
		System.out.println(l);
		
		Function<StudentFunctionInter, Character> f=(k)->{return (k.marks>80)?'A':(k.marks>70)?'B':(k.marks>60)?'C':(k.marks>50)?'D':(k.marks>=35)?'E':'F';};
		Predicate<StudentFunctionInter> d=(z)->z.marks>=60;
		
		Consumer<StudentFunctionInter> c=c1->{
			System.out.println("Name of the student :"+c1.name);
			System.out.println("Marks of the student :"+c1.marks);
			System.out.println("Grade of the student :"+f.apply(c1));
			System.out.println();
		};
		
		for(StudentFunctionInter s:l) {
			if(d.test(s)) {
           c.accept(s);	
			}
			}
		
		
//		Function<StudentFunctionInter,String> f=(k)->{
//			String grade=null;
//			if(k.marks>80) grade=''
//			
//					};
//		
		
		
		Function<Integer,Integer> c1=(ll)->ll*2;
		Function<Integer, Integer> c2=(o)->o*o*o;
		Function<Integer, Integer> c3=w->w+w;
		
		System.out.println(c1.andThen(c2).andThen(c3).apply(5));
		System.out.println(c1.compose(c2).compose(c3).apply(4));	
		
		
		
//....................with out consumer.........................................
		

//		List<StudentFunctionInter> l=new ArrayList<>();
//		l.add(new StudentFunctionInter("naresh", 90));
//		l.add(new StudentFunctionInter("sangha", 80));
//		l.add(new StudentFunctionInter("saurabh", 60));
//		l.add(new StudentFunctionInter("raju", 20));
//		l.add(new StudentFunctionInter("nilesh", 35));
//		
//		System.out.println(l);
//		
//		Function<StudentFunctionInter, Character> f=(k)->{return (k.marks>80)?'A':(k.marks>70)?'B':(k.marks>60)?'C':(k.marks>50)?'D':(k.marks>=35)?'E':'F';};
//		Predicate<StudentFunctionInter> d=(z)->z.marks>=60;
//		
//		
//		
//		for(StudentFunctionInter s:l) {
//			
//			if(d.test(s)) {
//			System.out.println("Name :"+s.name);
//			System.out.println("Marks :"+s.marks);
//			System.out.println("Grade: "+f.apply(s));
//			System.out.println("......................................");
//			}
//			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	}


