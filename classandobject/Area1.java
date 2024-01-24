package classandobject;

import java.util.Scanner;

public class Area1 {
	
   float area;
   Scanner sc=new Scanner(System.in);
   public void circle()
   {
	 float radius;
	 System.out.println("Enter radius:");
	 radius=sc.nextFloat();
	 area=3.14f*radius*radius;
	 System.out.println("Area of circle:"+area);
   }
   public int square() {
	   int side;
	   System.out.println("Enter side:");
	   side=sc.nextInt();
	   return side*side;
   }
   public void rectangle(int length,int breadth) {
	   System.out.println("Area of Rectangle:"+(length*breadth));
   }
   public float triangle(float base,float height) {
	   area=0.5f* base*base;
	   return area;
   }
   
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area1 area= new Area1();
		area.circle();
		int ar=area.square();
		Scanner sc= new Scanner(System.in);
		System.out.println("Area of square :"+ar);
		int length,breadth;
		System.out.println("Enter Length and breadth:");
		length=sc.nextInt();
		breadth= sc.nextInt();
		area.rectangle(length, breadth);
		float tr=area.triangle(7, 8);
		System.out.println("Area of triangle :"+tr);
	}
}
