import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(23);
		l1.add(24);
		System.out.println(l1);
		l1.addFirst(45);
		System.out.println(l1);
		l1.addLast(65);
		System.out.println(l1);
		System.out.println("------remove()----");
		l1.remove();
		System.out.println(l1);
		System.out.println("----removeFirst and removeLast---");
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		LinkedList l2 = new LinkedList();
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l2.add(16);
		l2.removeFirstOccurrence(12);
		l2.removeLastOccurrence(16);
		System.out.println(l2);
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());
	}


}
