package codingchallenges;

import java.util.Scanner;
import java.util.stream.Collectors;

//created by Pooja Salekar 

public class Capgemini {
	public String interSpace(String s)
	{
		return s.chars().mapToObj(ch ->(char)ch+" ").collect(Collectors.joining());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input= sc.nextLine();
		Capgemini c1 = new Capgemini();
		String result =  c1.interSpace(input);
		System.out.println(result);
		sc.close();
	}

}
