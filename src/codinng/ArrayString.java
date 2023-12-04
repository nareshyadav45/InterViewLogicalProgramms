package codinng;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayString {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Naresh Yadav","Sanghamesh Nandi","Suarabh Katti","Nilesh Chavan","Srikanth Rainier");
		str.stream().sorted().forEach(System.out::println);;
		//stream.forEach(System.out::println);
		//List<Integer> ll=new ArrayList();
	}

}
