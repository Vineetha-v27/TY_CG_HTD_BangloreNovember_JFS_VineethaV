import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(0,12);
		l1.add(1,13);
		l1.add(2,14);
		l1.add(3,15);
		l1.add(4, 16);
		l1.add(1, 18);
		System.out.println(l1);

		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.indexOf(18));
		l1.add(18);
		System.out.println(l1);
		System.out.println(l1.lastIndexOf(18));
		System.out.println("----------------");
		for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}

		List l2 = new ArrayList();
		l2.add(45);
		l2.add(46);
		l2.add(47);
		l2.add(48);
		System.out.println(l2.addAll(l2));

		List l3 = new ArrayList();
		l3.add(52);
		l3.add(54);
		l3.add(53);
		l3.set(1, 1000);
		System.out.println(l3);

		List l4 = new ArrayList();
		l4.add(45);
		l4.add(46);
		l4.add(47);

		List l5 = l4.subList(0, 2);
		System.out.println(l5);

	}

}
