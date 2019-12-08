
public class Employee implements Comparable<Employee>{
	int empAge;
	double salary;
	String empName;
	public Employee(int empAge, double salary, String empName) {
		super();
		this.empAge = empAge;
		this.salary = salary;
		this.empName = empName;
	}
	public int compareTo(Employee e){
		if(this.empAge > e.empAge ) {
			return 1;
		}else if(this.empAge < e.empAge) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empAge;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empAge != other.empAge)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [empAge=" + empAge + ", salary=" + salary + ", empName=" + empName + "]";
	}
	

}
