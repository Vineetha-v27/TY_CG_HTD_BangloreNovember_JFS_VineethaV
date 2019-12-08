
public class TestCalculator {
	public static void main(String arr[]) {
		Calculator c1 = new Calculator();
		int r1 = c1.add(10);
		System.out.println("result is"+r1);
		int r2 = c1.add(10,20);
		System.out.println("result is"+r2);
		double r3 = c1.add(10.56);
		System.out.println("result is"+r3);
		Calculator.multiply(20);
		Calculator.multiply(20,20);
		Calculator.multiply(20.30);
	}
}
