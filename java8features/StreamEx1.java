package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// created by Pooja Salekar

public class StreamEx1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sayli","Sadhana","Tejaswini","Aishwarya","Akanksha","Dipali");
		//create a stream 
		Stream<String> allnames = names.stream();
		
		//perform itermediate opration
		Stream<String> longNames = allnames.filter(str ->str.length()>7);
		
		//perform terminate operation
		System.out.println("Using forEach() :");
		longNames.forEach(str -> System.out.println(str));
		
		//single line
		//collect(Collectors.toList()): used to convert stream into list
		List<String> namesCollect = names.stream().filter(str ->str.length()>7).collect(Collectors.toList());
		System.out.println("\n using collect() :");
		//names.Collect.forEach(str -> System.out.println(str));
		namesCollect.forEach(System.out::println);
	}

}
