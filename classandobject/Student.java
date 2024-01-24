package classandobject;

public class Student {
	int rollnumber;
	String name;
	float phy,chem,maths,total,percentage;
	public Student() {
		rollnumber = 101;
		name = "Pooja";
		phy =78;
		chem = 67;
		maths = 80;
	}
	public Student(int rollnumber, String sname, float phy, float chem, float maths) {
		this.rollnumber = rollnumber;
		name=sname;
		this.phy=phy;
		this.chem=chem;
		this.maths=maths;
	}
	public void calpercent() {
		total= phy+chem+maths;
		percentage= total/3;
	}
	public void display() {
		System.out.println("Student Roll Number : "+rollnumber);
		System.out.println("Student Name : "+name);
		System.out.println("Total : "+total);
		System.out.println("percentage : "+percentage);
	}
	
	public static void main(String[] args) {
		Student student1= new Student();
		student1.calpercent();
		student1.display();
		
		Student student2= new Student(102,"Ashwini",67,78,90);
		student2.calpercent();
		student2.display();
		
	}

}
