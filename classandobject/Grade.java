package classandobject;

public class Grade extends Student1{
	String grade;
	public Grade() {
		super();
		grade="A";
		
	}
	public Grade(int id,String name,MyDate dob,float phy, float chem, float maths) {
		super(id,name,dob,phy,chem,maths);
		
	}
	public void calculate() {
		super.calpercent();
		if(percentage>=90)
			grade="O";
		else if(percentage>=80)
			grade="A";
		else if(percentage>=70)
			grade="B";
		else if(percentage>=60)
			grade="C";
		else if(percentage>=50)
			grade="D";
		else if(percentage>=40)
			grade="E";
		else if(percentage<40)
			grade="F";
		
	}
	public void display() {
		super.display();
		System.out.println("Grade :"+grade);
	}
}
