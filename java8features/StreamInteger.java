package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//created by Pooja Salekar

public class StreamInteger {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(67);
		list.add(56);
		list.add(43);
		list.add(98);
		list.add(77);
		list.add(32);
		list.add(61);
		list.add(24);
		list.add(53);
		list.add(86);
		
		System.out.println("List of Even numbers :");
		List<Integer> number =list.stream().filter(s -> s%2==0).collect(Collectors.toList());
		number.forEach(s -> System.out.println(s));
	}

}
