package setandlist;

import java.util.HashSet;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> i = new HashSet<Integer>();
		Set <Integer> j = new HashSet<Integer>();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(40);
		System.out.println(i);
		j.add(2);
		j.add(4);
		j.add(6);
		j.add(8);
		
		System.out.println(j);
		i.addAll(j);
		System.out.println(i);
		System.out.println(i.size());
		System.out.println(i.isEmpty());
		System.out.println(i.contains(200));
		System.out.println(i.containsAll(j));
		i.remove(20);
		System.out.println(i);
		i.removeAll(j);
		System.out.println(i);
		i.clear();
		System.out.println(i);
	}

}
