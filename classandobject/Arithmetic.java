package classandobject;

public class Arithmetic {
	int a;
	int b;
	double addition;
	double substraction;
	double multiplication;
	double division;
	
	public Arithmetic() {
		a=96;
		b=53;
	}
	public Arithmetic(int a,int b) {
		this.a = a;
		this.b = b;
		
	}
	public void addition() {
		addition = a+b;
	}
	public void substraction() {
		substraction = a-b;
	}
	public void multiplication() {
		multiplication = a*b;
	}
	public void division() {
		division = a/b;
	}
	public void display() {
		System.out.println("Addition is :"+addition);
		System.out.println("Substraction is :"+substraction);
		System.out.println("Multiplication is :"+multiplication);
		System.out.println("Division is :"+division);
	}
	public static void main(String[] args) {
		Arithmetic arithmetic1 = new Arithmetic();
		arithmetic1.addition();
		arithmetic1.substraction();
		arithmetic1.multiplication();
		arithmetic1.division();
		arithmetic1.display();
		Arithmetic arithmetic2 = new Arithmetic(74,29);
		arithmetic2.addition();
		arithmetic2.substraction();
		arithmetic2.multiplication();
		arithmetic2.division();
		arithmetic2.display();
	}
}
