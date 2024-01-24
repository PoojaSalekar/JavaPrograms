package multithreading;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Currently executing thread: "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		MyThread2 mythread2=new MyThread2();
		Thread t1= new Thread(mythread2);
		t1.setName("Pooja");
		t1.start();
		
		Thread t2= new Thread(mythread2);
		t2.setName("Salekar");
		t2.start();
	}

}
