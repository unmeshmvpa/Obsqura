package setandlist;

import java.util.LinkedList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> l= new LinkedList<Integer>();
		l.add(2);
		l.add(4);
		l.add(6);
		l.add(8);
		System.out.println(l);
		System.out.println(l.get(3));
		l.set(2, 10);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.remove(2);
		System.out.println(l);
		System.out.println(l.contains(2));
		System.out.println(l.contains(5));
		System.out.println(l.indexOf(4));
		l.add(4);
		System.out.println(l);
		System.out.println(l.indexOf(4));
		System.out.println(l.lastIndexOf(4));
		System.out.println("Non Generic");
		System.out.println("------------");
		
		List nonG = new LinkedList();
		nonG.add(123);
		nonG.add("Hello");
		System.out.println(nonG);
		nonG.set(1, "Hello World");
		System.out.println(nonG);
		nonG.add(2.5);
		System.out.println(nonG);
		System.out.println(" No of Elements  : "+nonG.size());
		System.out.println(nonG.contains(2.5));
		System.out.println("Index of 2.5 is "+nonG.indexOf(2.5));
		
		
		
		
	}

}
