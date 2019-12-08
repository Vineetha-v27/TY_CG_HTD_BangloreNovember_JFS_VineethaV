import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(27);
		l1.add(28);
		l1.add(29);
		l1.add(30);
		l1.add(31);
		System.out.println(l1);
		System.out.println("---peek,peekFirst and peekLast--");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		System.out.println("-----poll,pollfirst and polllast---");
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		System.out.println("--offer,offerfirst and offerlast--");
		System.out.println(l1.offer(56));
		System.out.println(l1.offerFirst(78));
		System.out.println(l1.offerLast(45));
		System.out.println(l1);

	}

}
