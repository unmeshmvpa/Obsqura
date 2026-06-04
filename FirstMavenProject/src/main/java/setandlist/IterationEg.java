package setandlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> i = new ArrayList<Integer>();
		i.add(5);
		i.add(10);
		i.add(15);
		i.add(20);
		System.out.println(i);
		Iterator<Integer> x = i.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}
		x.remove();
		System.out.println(i);

	}

}
