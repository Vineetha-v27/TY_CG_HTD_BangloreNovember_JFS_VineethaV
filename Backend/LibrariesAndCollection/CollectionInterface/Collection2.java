import java.util.Collection;
import java.util.ArrayList;

public class Collection2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		
		c1.add(12);
		c1.add(24);
		System.out.println(c1);
		
		Collection c2 = new ArrayList();
		c2.add(25);
		c2.add(26);
		System.out.println(c2);
		System.out.println("---addall---");
		c1.addAll(c2);
		System.out.println(c2);
		System.out.println("------retainsall----");
		c1.retainAll(c1);
		System.out.println(c1);
		
		c1.removeAll(c2);
		System.out.println("------removeall-----");
		System.out.println(c1);
		
		System.out.println("------containsall----");
		System.out.println(c1.containsAll(c2));
		
		System.out.println(c1);
		c1.clear();
		
		System.out.println(c1);
		c1.add(c2);
		System.out.println(c1);
		Object a[] = c2.toArray();
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
