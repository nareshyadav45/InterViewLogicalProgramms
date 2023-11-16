package others;

public class stringReverse {
	public static void main(String[] args) {
		String s="alpha";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--) {
			char charac = s.charAt(i);
			System.out.print(charac);
		}
	}

}
