//1/1+1/2+1/3+1/4+.......+1/n;

package series;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		double i;
		double sum=0;
		for(i=1;i<=n;i++)
		{
			sum=sum+1/i;
			System.out.println(1+"/"+(int)i);
		
			if(i<n) {
				System.out.println("+");
			}
		}
		System.out.println(" = "+sum);
	}

}
