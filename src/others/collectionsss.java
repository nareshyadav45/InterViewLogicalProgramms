package others;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class collectionsss {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(null);
		l.add(null);
		l.add(10);
		// System.out.println(l);

		Set<Integer> s = new LinkedHashSet<>();
		s.add(null);
		s.add(null);
		s.add(23);
		s.add(null);
		//System.out.println(s);
		
		
		SortedSet<Integer> ss=new TreeSet<>();
		ss.add(44);
		ss.add(23);
		//System.out.println(ss);
		
		
		Queue<Integer> q=new PriorityQueue<>();
		q.add(10);
		//q.add(null);
		//q.add(null);
		//System.out.println(q);
		
		
		
		
		
		Deque<Integer> d=new ArrayDeque<>();
		d.add(12);
		//d.add(null);
		d.add(23);
		d.add(45);
		d.add(3);
		System.out.println(d);
		
		List<Integer> n=new Vector<>();
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
