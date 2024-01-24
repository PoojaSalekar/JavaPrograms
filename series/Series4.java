

//1/1+2/4+3/9+.......+n/n;

package series;

import java.util.Scanner;

public class Series4 {

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
			System.out.println((int)i+"/"+(int)(i*i));
		
			if(i<n) {
				System.out.println("+");
			}
		}
		System.out.println(" = "+sum);
	}

}
