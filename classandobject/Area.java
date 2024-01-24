package classandobject;

public class Area {
	int radius;
	int sides;
	int length;
	int breadth;
	int base;
	int height;
	double carea;
	double sarea;
	double rarea;
	double tarea;

	public Area(){
		radius = 5;
		sides = 6;
		length = 7;
		breadth = 9;
		base = 3;
		height = 4;
	}
	
	public Area(int radius,int sides,int length,int breadth,int base,int height) {
		this.radius=radius;
		this.sides=sides;
		this.length=length;
		this.breadth=breadth;
		this.base=base;
		this.height=height;
	}
	public void areaofcircle() {
		carea= 3.14*radius*radius;
	}
	public void areaofsquare() {
		sarea= sides*sides;
	}
	public void areaofrectangle() {
		rarea= length*breadth;
	}
	public void areaoftriangle() {
		tarea=0.5*base*height;
	}
	public void display() {
		System.out.println("Area of Circle : "+carea);
		System.out.println("Area of Square : "+sarea);
		System.out.println("Area of Rectangle : "+rarea);
		System.out.println("Area of Triangle : "+tarea);
	}

	public static void main(String[] args) {
		Area area1=new Area();
		area1.areaofcircle();
		area1.areaofsquare();
		area1.areaofrectangle();
		area1.areaoftriangle();
		area1.display();
		Area area2 = new Area(3,6,2,7,5,7);
		area2.areaofcircle();
		area2.areaofsquare();
		area2.areaofrectangle();
		area2.areaoftriangle();
		area2.display();
	}
}
