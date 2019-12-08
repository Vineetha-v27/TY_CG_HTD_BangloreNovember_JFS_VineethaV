import java.util.ArrayList;
import java.util.List;

	public class ArrayList2 {
		public static void main(String[] args) {
			List l1 = new ArrayList();
			l1.add(0,"vini");
			l1.add(1,"vidya");
			l1.add(2,"veena");
			l1.add(3,"xyz");
			l1.add(4, "vaishu");
			l1.add(1, "abc");
			System.out.println(l1);
			
			l1.remove(2);
			System.out.println(l1);
			System.out.println(l1.indexOf("abc"));
			l1.add("ccc");
			System.out.println(l1);
			System.out.println(l1.lastIndexOf("abc"));
			System.out.println("----------------");
			for(int i=0; i<l1.size(); i++) {
				System.out.println(l1.get(i));
			}
			
			List l2 = new ArrayList();
			l2.add("nnn");
			l2.add("aaaa");
			l2.add("bbbb");
			l2.add("vvvv");
			System.out.println(l2.addAll(l2));
			
			List l3 = new ArrayList();
			l3.add("vvvvvv");
			l3.add("iiiiii");
			l3.add("nnnn");
			l3.set(1, "uuuuuu");
			System.out.println(l3);
			
			List l4 = new ArrayList();
			l4.add("ttt");
			l4.add("hhhh");
			l4.add("aaa");
			
			List l5 = l4.subList(0, 2);
			System.out.println(l5);
			
			}

	}



