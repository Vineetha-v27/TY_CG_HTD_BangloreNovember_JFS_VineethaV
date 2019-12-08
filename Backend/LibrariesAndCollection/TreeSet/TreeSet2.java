import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();
		
		ts.add(new Student(22,"vinu"));
		ts.add(new Student(25,"deepa"));
		ts.add(new Student(22,"vinu"));
		
		for(Object o1: ts) {
			System.out.println(o1);
			
		}
		
		
	}

}
