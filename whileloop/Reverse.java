package whileloop;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nmuber : ");
		int n = sc.nextInt();
		int rev=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			rev=rem+rev*10;
			n=n/10;
		}
		System.out.println("The Reverse of Number is : "+rev);
	}
}
