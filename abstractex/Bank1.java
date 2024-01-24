package abstractex;
abstract class Bank{
	public abstract void getBalance();
}
class BankA extends Bank{

	@Override
	public void getBalance() {
		System.out.println("Deposited Balance : $100");
		
	}
	
}
class BankB extends Bank{

	@Override
	public void getBalance() {
		System.out.println("Deposited Balance : $150");
		
	}
	
}
class BankC extends Bank{

	@Override
	public void getBalance() {
		System.out.println("Deposited Balance : $200");
		
	}
	
}
public class Bank1 {
	public static void main(String[] args) {
		BankA bank1 = new BankA();
		bank1.getBalance();
		BankB bank2 = new BankB();
		bank2.getBalance();
		BankC bank3 = new BankC();
		bank3.getBalance();
	}
}
