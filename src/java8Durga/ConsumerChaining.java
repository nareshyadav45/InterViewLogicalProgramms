package java8Durga;

import java.util.function.Consumer;

public class ConsumerChaining {
	
	private String name;
	
	public ConsumerChaining(String name) {
		this.name=name;	
	}
	
	public static void main(String[] args) {
		Consumer<ConsumerChaining> c1=c->System.out.println("movie name"+c.name);
		Consumer<ConsumerChaining> c2=c->System.out.println(c.name +"will be a biggest Industrial Hit!!! ");
		Consumer<ConsumerChaining> c3=c->System.out.println(c.name +"is a tollywood movie ");
		
		//Consumer<ConsumerChaining> cc=c1.andThen(c2).andThen(c3);
		Consumer<ConsumerChaining> cc = c1.andThen(c2).andThen(c3);
		
		ConsumerChaining c=new ConsumerChaining("Project-K.");
	    cc.accept(c);
	}

}
