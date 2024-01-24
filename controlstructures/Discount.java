package controlstructures;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Puchase amount :");
		float amount =sc.nextInt();
		float discount;
		if(amount>=10000)
		{
			discount = amount*0.1f;
		}
		else 
		{
			discount=amount*0.02f;
		}
		System.out.println("Discount is :"+discount);
	}

}
