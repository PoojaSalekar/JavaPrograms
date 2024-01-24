package arrayex;

import java.util.Scanner;

public class ProductOfOdd {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
		int product=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size :");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array Elements :");
		for( i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of Even Array Element :"+sum);
		for(i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				product=product*arr[i];
			}
		}
		System.out.println("Product of Odd Array Element :"+product);
	}

}
