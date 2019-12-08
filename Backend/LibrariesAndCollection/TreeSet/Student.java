
public class Student implements Comparable<Student> {
	int Age;
	String sName;
	public Student(int age, String sName) {
		super();
		Age = age;
		this.sName = sName;
	}
	@Override
	public int compareTo(Student o) {
		if(this.Age > o.Age) {
			return 1;
		}else if(this.Age < o.Age) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Age;
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
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
		Student other = (Student) obj;
		if (Age != other.Age)
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [Age=" + Age + ", sName=" + sName + "]";
	}
	

}
