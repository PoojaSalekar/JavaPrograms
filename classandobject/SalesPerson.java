package classandobject;

public class SalesPerson extends Employee {
	float sales,commission, totalSalary;
	public SalesPerson() {
		super();
		sales=80;
	}
	public SalesPerson(int id, String name, MyDate dob, int workingdays, int perday, float sales)
	{
		super(id,name,dob,workingdays,perday);
		this.sales = sales;
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		
		if(sales >= 90)
		{
			commission = salary * 0.2f;
		}
		
		else if(sales >= 75)
		{
			commission = salary * 0.1f;
		}
		
		else if(sales >= 60)
		{
			commission = salary * 0.05f;
		}
		
		else
		{
			commission = 0;
		}
		
		totalSalary = salary + commission;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Commission : "+commission);
		System.out.println("Total Salary : "+totalSalary);
	}
}