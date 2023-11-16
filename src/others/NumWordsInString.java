package others;

public class NumWordsInString {
	public static void main(String[] args) {
		String s="welcome to naresh IT";
		int count=1;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Number words present in in given String "+count);
	}

}
