package whileloop;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nmuber : ");
		int n = sc.nextInt();
		int temp=n;
		int rev=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			rev=rem+rev*10;
			n=n/10;
		}
		System.out.println("The Reverse of Number is : "+rev);
		if(temp==rev)
		{
			System.out.println("The given number is Palindorm.");
		}
		else
			System.out.println("The given number is not Palindorm.");

	}

}
