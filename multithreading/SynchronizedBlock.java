package multithreading;

class Printable{
	public void print(int n) {
		synchronized(this){
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(n*i);
			}
		}
	}
}
class Thread1 extends Thread{
	Printable printable;

	public Thread1(Printable printable) {
		super();
		this.printable = printable;
	}
	@Override
	public void run() {
		printable.print(2);
	}
}

class Thread2 extends Thread{
	Printable printable;

	public Thread2(Printable printable) {
		super();
		this.printable = printable;
	}
	@Override
	public void run() {
		printable.print(3);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		Printable printable=new Printable();
		Thread1 t1= new Thread1(printable);
		Thread2 t2= new Thread2(printable);
		t1.setName("Pooja");
		t1.start();
		
		t2.setName("Salekar");
		t2.start();
	}

}
