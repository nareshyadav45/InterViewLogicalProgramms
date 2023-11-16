package others;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesArrHashSet {
	
	public static void main(String[] args) {
		
		
//		String a[]= {"java","python",".net","java","python"};
//		Set<String> s=new HashSet<>();
//		boolean dup=false;
//		for(String l:a) {
//			if(s.add(l)==false) {
//				System.out.println("duplicates element found  "+l );
//				dup=true;
//				
//			}
//			
//		}
//		if(dup==true) {
//			System.out.println("duplicate element found ");
//		}else {
//			System.out.println("duplicate element not found");
//		}
		
		//duplicate integers
		
//		int [] in= {1,2,3,4,1,2,5};
//		Set<Integer> intHash=new HashSet<>();
//		for(int j:in) {
//			if(intHash.add(j)==false) {
//				System.out.println("duplicate element found "+j);
//			}
//		}
//		
		
		
		int [] in= {1,2,3,4,1,2,5};
	
		for(int i=0;i<in.length;i++) {
			for(int j=i+1;j<in.length;j++) {
				if(in[i]==in[j]) {
					System.out.println("duplicate element found "+in[i]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
