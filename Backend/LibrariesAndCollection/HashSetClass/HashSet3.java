import java.util.HashSet;

public class HashSet3 {
	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<Person>();
		
		hs.add(new Person(22,"divya"));
		hs.add(new Person(24,"vini"));
		hs.add(new Person(23,"mouse"));
		
		for(Person p1: hs) {
			System.out.println(p1.pName +" and age is "+p1.Age );
			
		}
		
	}

}
