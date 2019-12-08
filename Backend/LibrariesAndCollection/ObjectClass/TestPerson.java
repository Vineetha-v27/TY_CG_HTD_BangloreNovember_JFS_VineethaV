
public class TestPerson extends Person {
	public TestPerson(String name) {
		super(name);
		
	}

	public static void main(String[] args) throws Throwable {
		System.out.println("-----main started---");
		Person p1 = new Person("john");
		TestPerson p2 = new TestPerson("deepa");
		p2.finalize();
		p1.finalize();
		p1 = null;
		System.gc();
		System.out.println("----main ended----");
	}

}
