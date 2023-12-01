package others;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner Num=new Scanner(System.in);
		System.out.println("Please Enter Factorial Number");
		int n = Num.nextInt();

		int fact=1;
		
		for(int i=n;i>=1;i--) {
			fact=fact*i;	
		}
		System.out.println(fact);
	}
	
	
	

}
