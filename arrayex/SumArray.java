package arrayex;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements : ");
		for (int i=0;i<n;i++) 
		{
			arr[i] = sc.nextInt();
		}		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of array element is :"+sum);
	}

}
