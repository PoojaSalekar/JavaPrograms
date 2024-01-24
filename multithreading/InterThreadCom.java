package multithreading;
class Customer{
	private int balance=10000;
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw Rs. "+amount);
		if(balance<amount) {
			System.out.println("Not enough balance in account waiting for deposit.....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		balance=balance-amount;
		System.out.println("Rs."+amount+" Withdraw. Balance is :"+balance);
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit Rs."+amount);
		balance=balance+amount;
		System.out.println("deposited Rs. "+amount+" Balance is :"+balance);
		notify();
	}
}
public class InterThreadCom {

	public static void main(String[] args) {
		Customer customer= new Customer();
		new Thread("Paras") 
		{		
			public void run() {customer.withdraw(15000);};
		}.start();
		new Thread("Manas") 
		{		
			public void run() {customer.deposit(20000);};
		}.start();
	}

}
