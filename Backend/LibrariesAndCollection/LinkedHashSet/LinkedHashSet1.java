import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		
		ls.add(25);
		ls.add(23);
		ls.add(67);
		ls.add(25);
		ls.add(null);
		
		Iterator itr  =ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
