
public class TestDemo4 {
	public static void main(String[] args) {
		Demo4 d1 = new Demo4("john",25);
		System.out.println(d1.hashCode());
		
		int age = d1.getAge();
		String name = d1.getName();
		System.out.println("age is "+age);
		System.out.println("name is "+name);
	
		
	}

}
