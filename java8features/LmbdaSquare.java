package java8features;

import java.util.Scanner;

//Created by Pooja Salekar

interface Square{
	int printSquare(int n);
}
public class LmbdaSquare {

	public static void main(String[] args) {
		Square s1 = (n) -> {
			return n*n;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int s =sc.nextInt();
		System.out.println("Square :"+s1.printSquare(s));
	}

}
