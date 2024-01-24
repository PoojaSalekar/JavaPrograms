package classandobject;

public class Student1 extends Person {
	float phy,chem,maths,total,percentage;
	public Student1() {
		super();
		phy =78;
		chem = 67;
		maths = 80;
	}
	public Student1(int id,String name,MyDate dob,float phy, float chem, float maths) {
		super(id,name,dob);
		this.phy=phy;
		this.chem=chem;
		this.maths=maths;
	}
	public void calpercent() {
		total= phy+chem+maths;
		percentage= total/3;
	}
	public void display() {
		super.display();
		System.out.println("Total : "+total);
		System.out.println("percentage : "+percentage);
	}
}
