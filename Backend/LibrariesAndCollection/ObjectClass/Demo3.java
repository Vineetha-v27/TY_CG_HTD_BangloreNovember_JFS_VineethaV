
public class Demo3 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("vini");
		System.out.println(s1.hashCode());
		s1 = s1.append("borgar");
		System.out.println(s1.hashCode());
	}

}
