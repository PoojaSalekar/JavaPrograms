package classandobject;

public class Customer extends Person{
	String prodName;
	int quantity;
	float price;
	float billAmount;
	
	public Customer()
	{
		super();
		prodName="Soap";
		quantity =20;
		price=50;
	}
	public Customer(int id,String name, MyDate dob,String prodName,int quantity,float price) 
	{
		super(id,name,dob);
		this.prodName=prodName;
		this.quantity=quantity;
		this.price=price;
	}
	public void calculate()
	{
		billAmount = quantity*price;
	}
	public void display() {
		super.display();
		System.out.println("Product Name :"+prodName);
		System.out.println("Quantity :"+quantity);
		System.out.println("BillAmount :"+billAmount);
	}
}
