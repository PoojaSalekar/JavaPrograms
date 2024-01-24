package arrayex;

import java.util.Scanner;

public class FrequencyofAarray {

	public static void main(String[] args) {
		int i;
		int y=0;
		int x=0;
		int z=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Element Array :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Array Elements :");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				x++;
			}
			else if(a[i]<0)
			{
				y++;
			}
			else 
			{
				z++;
			}
		}
		System.out.println("Frequency of Positive element of array is :"+x);
		System.out.println("Frequency of Negative element of array is :"+y);
		System.out.println("Frequency of Zero element of array is :"+z);
	}

}
