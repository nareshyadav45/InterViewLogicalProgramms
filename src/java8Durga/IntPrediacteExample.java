package java8Durga;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class IntPrediacteExample {
	public static void main(String[] args) {
		int []x= {1,2,3,4,5,6,7,8};
		IntPredicate p=pp->pp%2==0;
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		
      DoublePredicate d=o->o>50.0;
      System.out.println(d.test(12));
      
      
	}

}
