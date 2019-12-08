
public class Vehicle implements Cloneable{
	String Name;
	

	public Vehicle(String name) {
		super();
		Name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
