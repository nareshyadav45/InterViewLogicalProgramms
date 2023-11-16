package others;

import java.util.Arrays;

public class SwapStringInt {
	public static void main(String[] args) {
		String s="12345";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length-1;i+=2) {
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		System.out.println(ch);
	}

}
