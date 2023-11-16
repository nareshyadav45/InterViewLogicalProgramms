package others;

public class palindrome {
	public static void main(String[] args) {
		int num=121;
		int temp=num;
		int rem=0;
		int rev=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(rev==temp) {
			System.out.println("palindrome Number");
		}else {
			System.out.println("not a palindromue number");
		}
	}

}
