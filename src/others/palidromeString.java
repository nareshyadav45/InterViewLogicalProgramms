package others;

public class palidromeString {
	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);	
		}
		if(rev.equals(s)) {
			System.out.println("palindrome String");
		}else {
			System.out.println("not a palindrome String ");
		}
	}

}
