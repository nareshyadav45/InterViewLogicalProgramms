package codinng;

import java.util.StringJoiner;

public class PreSuf {
	public static void main(String[] args) {
		
		StringJoiner joiner=new StringJoiner(".","Chinthala "," Yadav");
		joiner.add("Naresh");
		
		System.out.println("String after prefix and suffix ");
		System.out.println(joiner);
		
	}

}
