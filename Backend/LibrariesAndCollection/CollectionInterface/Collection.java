import java.util.ArrayList;
import java.util.concurrent.*;


public class Collection {
	public static void main(String[] args) {
		
		ArrayList c1 = new ArrayList();
		
		//adding an element
		c1.add(10);
		c1.add(34);
		c1.add(56);
		System.out.println(c1);
		
		//deleting an element
		 c1.remove(0);
		System.out.println(c1);
		
		//finding the size of the collection
		System.out.println(c1.size());
		
		//checking than collection is empty or not
		System.out.println(c1.isEmpty());
		
		//checking whether 10 object is there or not inside the collection
		System.out.println(c1.contains(10));
		
		
	}

	
}
