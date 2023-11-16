package java8Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreeamString {
public static void main(String[] args) {
	ArrayList<String> s=new ArrayList<>();
	s.add("allu arjun");
	s.add("vijay");
	s.add("prabhas");
	s.add("mahesh babu");
	s.add("chiranjivi");
	s.add("tarak");
	
	System.out.println(s);
List<String> sorted = s.stream().sorted().collect(Collectors.toList());
	System.out.println(sorted);
	
	List<String> collect8 = s.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
	System.out.println(collect8);
	
	List<String> collect9 = s.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
	System.out.println(collect9);
	
	List<String> collect10 = s.stream().sorted((k1,k2)->{
		if(k1.length()<k2.length()) {return -1;}
		else if(k1.length()>k2.length()){return +1;}
		else{return k1.compareTo(k2);}
		}).collect(Collectors.toList());
	
	System.out.println(collect10);
	
	List<String> collect11 = s.stream().sorted((i1,i2)->{
	  if(i1<i2.length()) {
		  return -1;
		  }
	  else if(i1>i2) {
		  return +1;
		  }
	  else {
		  return 0;
		  }
	}).collect(Collectors.toList());
	
	System.out.println(s);
	System.out.println(collect11);
}
}
