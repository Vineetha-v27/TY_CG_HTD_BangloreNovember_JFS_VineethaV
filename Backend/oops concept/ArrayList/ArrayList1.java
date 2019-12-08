import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(12);
		a1.add(35);
		a1.add(38);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		
		//iterating an arraylist using for loop
		System.out.println("---------------");
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
			
		}
		
		//iterating for each loop
		System.out.println("---------------");
		for(Integer i1 : a1) {
			System.out.println(i1);
		}
		System.out.println("--------iterator method------");
		Iterator<Integer> itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("--------------listiterator method-------------");
		ListIterator<Integer> itr1 = a1.listIterator(a1.size());
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
			
		}
		
		ArrayList<Integer> a2 = new ArrayList();
		a2.add(23);
		a2.add(24);
		System.out.println(a2);
		a2.remove(new Integer(23));
		System.out.println(a2);
		System.out.println("---------------------------");
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("vvv");
		a3.add("iii");
		a3.add("nnnn");
		a3.add("iiiii");
		System.out.println(a3);
		a3.remove("n");
		System.out.println(a3);
		for(int i=0; i<a3.size(); i++) {
			System.out.println(a3.get(i));
		}
		System.out.println("-----for each---");
		for(String s1 : a3) {
			System.out.println(s1);
		}
		Iterator<String> itr3 = a3.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		}

}
