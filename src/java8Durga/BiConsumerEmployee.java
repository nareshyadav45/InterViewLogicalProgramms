package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerEmployee {
	String name;
	Double salary;
	public BiConsumerEmployee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		
		List<BiConsumerEmployee> ll=new ArrayList<>();
		ll.add(new BiConsumerEmployee("naresh", 1000.0));
		ll.add(new BiConsumerEmployee("sanghamesh", 2000.0));
		ll.add(new BiConsumerEmployee("shankar", 3000.0));
		
		BiConsumer<BiConsumerEmployee,Double> c=(e,s)->e.salary=e.salary+s;
		for(BiConsumerEmployee bi:ll) {
			c.accept(bi, 500.0);
		}
		
		for(BiConsumerEmployee bb:ll) {
		System.out.println("name :"+bb.name);
		System.out.println("salary :"+bb.salary);
		System.out.println("...............");
		}
		
	}

}
