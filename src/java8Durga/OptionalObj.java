package java8Durga;

import java.lang.invoke.LambdaConversionException;
import java.util.Optional;

public class OptionalObj {
public static void main(String[] args) {
	//Optional<Object> empty = Optional.empty();
	//System.out.println(empty);
	
	String email="nareshyadav@gmail.com";
	String emailNull=null;
	//Optional<String> of = Optional.of(email);
	//System.out.println(of);
	
	Optional<String> ofNullable = Optional.ofNullable(email);
	Optional<String> ofNullableNull = Optional.ofNullable(emailNull);
	//System.out.println(ofNullable);
	
	String string = ofNullable.get();
	//System.out.println(string);
	
	if(ofNullableNull.isPresent()) {
	//	System.out.println(ofNullable.get());
	}else {
	//	System.out.println("no value present");
	}
	
	String orElse = ofNullableNull.orElse("myEmail.com");
	//System.out.println(orElse);
	
	
	String orElseGet = ofNullableNull.orElseGet(()->"default orElseGet Method  ");
	String orElseGet2 = ofNullable.orElseGet(()->("default"));
	
	//System.out.println(orElseGet2);
	
	//String orElseThrow = ofNullableNull.orElseThrow(()-> new IllegalArgumentException("no value present"));
	//System.out.println(orElseThrow);
	
	//String orElseThrow2 = ofNullable.orElseThrow(()->new IllegalAccessError());
	//System.out.println(orElseThrow2);
	
//	String orElseThrow3 = ofNullableNull.orElseThrow();
//	System.out.println(orElseThrow3);
	//ofNullableNull.ifPresent((s)->System.out.println("no value present"));
	//ofNullable.ifPresent((s)->System.out.println(s.length()));
	
	String str=" abc ";
	System.out.println(str);
//	if(str!=null & str.contains("abc") ) {
	//	System.out.println(str.toUpperCase());
	//}
	
	Optional<String> ofNullable2 = Optional.ofNullable(str);
//	ofNullable2.filter((s)->
//	          s.contains("abc")
//			).ifPresent((ss)->System.out.println(ss.toUpperCase()));
//	
	ofNullable2.map((s)->s.trim()+ s.toUpperCase()).ifPresent((s)->System.out.println(s));
	//System.out.println(map);
	//Junit4 annotations can't support in junit5 because junit5 dosen't contain junit4 libraries  if we add
	//Junit4 libraries in Junit5 then start supports Jnuit4 annotations. 
}
}
