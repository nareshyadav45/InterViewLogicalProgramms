package others;

public class removeWhiteSpacesString {
	public static void main(String[] args) {
		String s="remove all white spaces from string";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				System.out.print(ch[i]);
			}
		}
	}

}
