package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiFunctionEmployee {
	
	int num;
	String name;

	public BiFunctionEmployee(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	public static void main(String[] args) {
		List<BiFunctionEmployee> l=new ArrayList<>();
		BiFunction<Integer, String , BiFunctionEmployee> b=(number,Ename)-> new BiFunctionEmployee(number, Ename);
		
	    l.add(b.apply(12, "naresh"));
	    l.add(b.apply(13, "sanghamesh"));
	    l.add(b.apply(15, "saurabh"));
	    
	    for(BiFunctionEmployee ff:l) {
	    	System.out.println(ff.num);
	    	System.out.println(ff.name);
	    	System.out.println("...................");
	    }
		
		
		
		
		
		
		
	}

}
