import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {
	public static void main(String[] args) {
		LinkedHashSet<Employee> ls = new LinkedHashSet<Employee>();
		
		ls.add(new Employee(22,"vinu"));
		ls.add(new Employee(23,"vidya"));
		ls.add(new Employee(22,"vinu"));
		Iterator<Employee> itr =ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
