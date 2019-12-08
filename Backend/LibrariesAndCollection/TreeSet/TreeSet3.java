import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		EmployeeName e1 = new EmployeeName();
		EmployeeSalary e2 = new EmployeeSalary();
		EmployeeAge e3 = new EmployeeAge();
		
//		TreeSet<Employee> ts = new TreeSet<Employee>(e1);
//		TreeSet<Employee> ts = new TreeSet<Employee>(e2);
		TreeSet<Employee> ts = new TreeSet<Employee>(e3);
		
		ts.add(new Employee(22,40000,"vini"));
		ts.add(new Employee(25,44000,"vidya"));
		ts.add(new Employee(23,45000,"varshi"));
		
		for(Employee e : ts) {
			System.out.println(e);
		}
		
		
	}

}
