package multithreading;

public class AccountSnchronized implements Runnable{
	private  Account account= new Account();
	
	public static void main(String[] args) {
		AccountSnchronized accountSnchronized = new AccountSnchronized();
		Thread thread1 = new Thread(accountSnchronized);
		Thread thread2 = new Thread(accountSnchronized);
		thread1.setName("Riya");
		thread2.setName("Meera");
		thread1.start();
		thread2.start();
	}
	
	
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			makeWithdrawal(1000);
		}
	}
	
	synchronized void makeWithdrawal(int amount)
	{
		if(account.getBalance()>=amount)
		{
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+"complete withdraw. Balance : "+account.getBalance());
		}
		else {
			System.out.println("Not enough balance in account for "+Thread.currentThread().getName()+"Balance :"+account.getBalance());
		}
	}

}
