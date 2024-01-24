// 1 3 5 7 .......n;

package series;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for( i=1;i<=n;i=i+2) {
			System.out.print(i+" ");
		}
	}

}
