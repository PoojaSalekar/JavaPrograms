package java8features;

import java.util.ArrayList;
//Created by Pooja Salekar 

public class StreamEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Daksha");
		list.add("Dipali");
		list.add("Vaishnavi");
		list.add("Sayli");
		list.add("Tejaswini");
		list.add("Sadhana");
		list.add("Aishwarya");
		
		//count name with length less than 7
		int count =0;
		for (String string : list) {
			if(string.length()<7) {
				count++;
			}
		}
		System.out.println("There are "+count+"string with less than 7");
		
		//with stream API
		
		long count1 = list.stream().filter(str ->str.length()<7).count();
		System.out.println("There are "+count1+"string with less than 7");
	}

}
