package series;

import java.util.Scanner;

public class Series9 {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :");
			int n = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum = sum + (i - (i + 1));
				System.out.println( i + "-"+(i+1));

				if (i < n) {
					System.out.println("+");
				}

			}
			System.out.println("= " + sum);

	}

}
