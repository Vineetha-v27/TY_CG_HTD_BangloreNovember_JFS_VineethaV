import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.add(23);
		s1.add(45);
		s1.push(43);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.search(new Integer(45)));
		System.out.println(s1);
	}

}
