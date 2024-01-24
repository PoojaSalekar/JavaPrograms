package multithreading;

public class MyThread extends Thread {
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Currently executing Trhead : "+getName());

		}
	}
	public static void main(String[] args) {
		MyThread t1= new MyThread();
		t1.setName("Pooja"); 	//setting thread name
		t1.start();     	//starting thread
		
		MyThread t2= new MyThread();
		t2.setName("Salekar"); 	//setting thread name
		t2.start(); 

	}

}
