//1  8  27  64  .....n;

package series;

import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		int b = 1;
		for(int i=1;i<=n;i++) {
			
			int a=b*b*b;
			System.out.println(a+"\t ");
			b++;
		}
	}

}
