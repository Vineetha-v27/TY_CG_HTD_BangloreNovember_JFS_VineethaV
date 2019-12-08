package com.capgemini.queue1.priorityqueue;

public class Student implements Comparable<Student> {
	int studAge;
	String studName;
	public Student(int studAge, String studName) {
		super();
		this.studAge = studAge;
		this.studName = studName;
	}
	@Override
	public String toString() {
		return "Student [studAge=" + studAge + ", studName=" + studName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studAge;
		result = prime * result + ((studName == null) ? 0 : studName.hashCode());
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
		if (studAge != other.studAge)
			return false;
		if (studName == null) {
			if (other.studName != null)
				return false;
		} else if (!studName.equals(other.studName))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		if(this.studAge > o.studAge) {
			return 1;
		}
		else if(this.studAge < o.studAge) {
			return -1;
		}else {
			return 0;
		}
	}
	

}
