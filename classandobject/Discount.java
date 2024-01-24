package classandobject;

public class Discount extends Customer {
	float discount,finalBill;
	public Discount()
	{
		super();
		discount =2090;
	}
	public Discount(int id,String name,MyDate dob,String prodName,int quantity,float price,float discount) 
	{
		super(id,name,dob,prodName,quantity,price);
		this.discount=discount;
	}
	public void calculate() {
		super.calculate();
		if(billAmount>=20000)		
			discount=0.15f*billAmount;		
		else if(billAmount>=15000)
			discount= 0.10f*billAmount;
		
		else if(billAmount>=10000)
			discount= 0.05f*billAmount;
		else
			discount=0;
		finalBill = billAmount - discount;
		}
	public void display()
	{
		super.display();
		System.out.println("Discount :"+discount);
		System.out.println("Final Bill : :"+finalBill);
		
	}
}

