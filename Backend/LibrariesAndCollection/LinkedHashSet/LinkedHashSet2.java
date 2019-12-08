import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
		ls.add(56);
		ls.add(45);
		ls.add(100);
		
		Iterator<Integer> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
