import java.util.HashSet;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet<StudentSet> hs = new HashSet<StudentSet>();
		
		hs.add(new StudentSet(24,"vini") );
		hs.add(new StudentSet(23,"vidya") );
		hs.add(new StudentSet(26,"mickey") );
		hs.add(new StudentSet(24,"vini") );
		hs.add(new StudentSet(27,"ramesh") );
		
		for(StudentSet s1 :  hs) {
			System.out.println(s1.studName + "  and age is "+s1.studId);
			
		}
		
		
	}

}
