package whileloop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nmuber : ");
		int n = sc.nextInt();
		int temp=n;
		int sum=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		System.out.println("The Reverse of Number is : "+sum);
		if(temp==sum)
		{
			System.out.println("The given number is Armstrong.");
		}
		else
			System.out.println("The given number is not Armstrong.");
	}

}
