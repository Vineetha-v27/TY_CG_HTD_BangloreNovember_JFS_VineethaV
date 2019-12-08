import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(45);
		hs.add(24);
		hs.add(56);
		hs.add(23);
		hs.add(24);
		hs.add(null);
		for(Object object : hs) {
			System.out.println(object);
			//System.out.println(object.hashCode());
			
		}
		//String type
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("vini");
		hs1.add("vidya");
		hs1.add("varshi");
		hs1.add("mickey");
		hs1.add(null);
		for(Object object : hs1) {
			System.out.println(object);
			}
	}

}
