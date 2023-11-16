package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeePredicate {
	private String name;
	private Double salary;
	
	public EmployeePredicate(String name,Double salary) {
       this.name=name;
       this.salary=salary;
	}
	public String toString() {
		return name+" "+salary;
	}
	
	public static void main(String[] args) {
		List<EmployeePredicate> l=new ArrayList<>();
		l.add(new EmployeePredicate("naresh", 3000.0));
		l.add(new EmployeePredicate("suresh",8000.0));
		l.add(new EmployeePredicate("madhu", 6000.0));
		l.add(new EmployeePredicate("raju", 7000.0));
		l.add(new EmployeePredicate("kcr", 2000.0));
		System.out.println(l);
		
		Predicate<EmployeePredicate> e=(p)->p.salary>3000.0 && p.name.length()%2==0 && p.name.length()>5 ;
		for(EmployeePredicate j:l) {
			if(e.test(j)) {
				System.out.println(j);
			}
		}
		
		
		
		
	}

}
