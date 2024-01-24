package classandobject;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		int a,b,c,i,j;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		for(i=1;i<=a;i++) 
		{
			for(j=1;j<=a-i;j++) 
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(i=1;i<=b;i++) 
		{
			for(j=1;j<=b-i;j++) 
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(i=1;i<=c;i++) 
		{
			for(j=1;j<=c-i;j++) 
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
}
}
