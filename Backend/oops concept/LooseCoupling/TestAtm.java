
public class TestAtm {
public static void main(String[] args) {
	Atm a1 = new Atm();
	
	Bank b1 = new Bank();
	Hdfc h1 = new Hdfc();
	Sbi s1 = new Sbi();
	a1.atmCard(h1);
}
}
