import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add(23);
		ts.add(25);
		ts.add(22);
		ts.add(21);
		ts.remove(21);
		
		for(Object o1 : ts) {
			System.out.println(o1);
		}
		
		
			
	}

}
