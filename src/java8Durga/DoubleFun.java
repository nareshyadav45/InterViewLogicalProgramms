package java8Durga;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class DoubleFun {
	public static void main(String[] args) {
		
		DoubleFunction h=k->{return (k>35.0)?"greter value":"low value";};
	System.out.println(h.apply(89.0));
       
	IntFunction d=l-> {return ((l<67)?10.0:20.0);};	
	System.out.println(d.apply(70));
	
	DoubleToIntFunction f=(k)->{
		return (k<90)?45:90;
	};
	System.out.println(f.applyAsInt(90.0));
	
	ToIntFunction<String> t=r->{return r.length();};
	System.out.println(t.applyAsInt("naresh"));
	
	ToDoubleFunction<Integer> m=g->Math.sqrt(g);
	System.out.println(m.applyAsDouble(9));
	
	Supplier<T>
	
	
	
	
	
	
	}

}
