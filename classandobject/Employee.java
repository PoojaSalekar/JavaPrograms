package classandobject;
 
public class Employee extends Person{
	int workingdays , perday ,salary;
	public Employee() {
		super();
		workingdays = 22;
		perday = 350;
	}
	public Employee(int id, String name, MyDate dob, int workingdays, int perday) {
		super(id,name,dob);
		this.workingdays=workingdays;
		this.perday=perday;
	}
	public void calculate() {
		salary = workingdays * perday;
	}
	public void display() {
		super.display();
		System.out.println("Salary : "+salary);
	}
}
