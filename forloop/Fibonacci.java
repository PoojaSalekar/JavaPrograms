package forloop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n =sc.nextInt();
		int a=0,b=1;
		int t=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n;i++)
		{
			t=a+b;
			System.out.println(t);
			a=b;
			b=t;
		}
		
	}

}
