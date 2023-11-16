package java8Durga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
	private String name;
	private Integer id;
	
	@Override
	public String toString() {
		return id+" "+name;
	}

	public Employee(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<>();
		l.add(new Employee("nareshyadav", 45));
		l.add(new Employee("sanghamesh", 12));
		l.add(new Employee("ajay", 2));
		l.add(new Employee("nilesh", 78));
		l.add(new Employee("vivek", 35));
		System.out.println(l);
		
		
//		Comparator<Employee> c=(e1,e2)->{
//			if(e1.id<e2.id) {
//				return -1;
//			}else if(e1.id>e2.id) {
//				return +1;
//				
//			}else {
//				return 0;
//			}
//		};
		
//		Comparator< Employee> c=(t1,t2)->{
//			return (t1.id<t2.id)?-1:(t1.id>t2.id)?1:0;
//		};
//		
//		Comparator< Employee> c=(c1,c2)->(c1.id<c2.id)?-1:(c1.id>c2.id)?1:0;
//		
//		Collections.sort(l, c);
//		System.out.println(l);
		
//		Comparable<Employee> e=(e1,e2)->{
//			return
//		};
		
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);	
		
		Employee e=new Employee("xxlws", 12);
	
	}

}
