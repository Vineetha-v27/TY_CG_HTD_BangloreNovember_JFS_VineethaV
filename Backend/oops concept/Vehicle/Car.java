
public class Car extends Vehicle {
	int cost = 30000;
	void carDetails() {
		int cost = 50000;
		System.out.println("local variable of the cost is "+cost);
		System.out.println("gobal variable of the cost is "+this.cost);
		System.out.println("variable of super class cost is "+super.cost);
	}

	
}
