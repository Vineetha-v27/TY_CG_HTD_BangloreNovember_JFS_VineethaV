import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(4);
		l1.add(5);
		l1.push(56);
		System.out.println(l1);
		l1.pop();
		System.out.println(l1);
		System.out.println(l1.element());
		System.out.println(l1);
	}

}
