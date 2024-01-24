//1/1!

package series;

import java.util.Scanner;

public class Series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		double sum = 0.00, fact;
		for (double i = 1; i <= n; i++) {
			fact = 1;

			for (double j = 1; j <= i; j++) {
				fact = fact * j;

			}
			sum = sum + (i / fact);
			System.out.print((int) i + "/" + (int) i + "!");

			if (i < n) {
				System.out.print("+");
			}
		}

		System.out.println(" =" + sum);
	}

}
