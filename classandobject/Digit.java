package classandobject;

import java.util.Scanner;

public class Digit {
	
	public static void main(String[] args) {
		int digit,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		n=sc.nextInt();
		while(n>0) {
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("Sum :"+sum);
	}
}
