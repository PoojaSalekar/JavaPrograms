package java8features;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.stream.Stream;

//Created by Pooja Salekar

public class StreamcharacterS {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Shivani");
		list.add("Sonali");
		list.add("Sadhana");
		list.add("Aishwarya");
		list.add("Siddhi");
		list.add("Trishika");
		list.add("Sayli");
		list.add("Shweta");
		list.add("Vaishnavi");
		
		
		Stream<String> str = list.stream();
		Stream<String> str1 = str.filter(s ->s.startsWith("S"));
		//str1.collect(Collectors.toList());
		str1.forEach(s ->System.out.println(s));
		
	}

}
