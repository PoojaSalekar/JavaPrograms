package arrayex;

import java.util.Scanner;

public class EvenArray {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size :");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array Elements :");
		for( i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Even number of an arrray elements are :");
		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
