
public class TestEmployee1 {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(222,"anu");
		Employee1 e2 = new Employee1(222,"anu");
		Employee1 e3 = new Employee1(234,"vinu");
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		
	}

}
