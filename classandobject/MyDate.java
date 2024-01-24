package classandobject;

public class MyDate {

	int dd, mm, yy;
	public MyDate() {
		dd=12;
		mm=6;
		yy=2000;
	}
	public MyDate(int dd,int mm,int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void display() {
		System.out.println("Date :"+dd+"-"+mm+"-"+yy);
	}

}
