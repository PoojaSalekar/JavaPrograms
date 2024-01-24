package arrayex;

import java.util.Scanner;

public class AverageofArray {

	public static void main(String[] args) {
		
		int i;
		int evencount=0;
		int evensum=0;
		float evenavg=0;
		int oddcount=0;
		int oddsum=0;
		float oddavg=0;
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
				evensum=evensum+arr[i];
				evencount++;
			}
			
		}
		evenavg=evensum/evencount;
		System.out.println("Sum of array element is :"+evensum);
		System.out.println("Average of Even Elements of Array is :"+evenavg);
		
		for(i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				oddsum=oddsum+arr[i];
				oddcount++;
			}
			
		}
		oddavg=oddsum/oddcount;
		System.out.println("Sum of array element is :"+oddsum);
		System.out.println("Average of Even Elements of Array is :"+oddavg);
	}

}
