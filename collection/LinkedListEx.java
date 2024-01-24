package collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list= new LinkedList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");
		list.add("Apple");
		list.add(null);
		
		for (String string : list) {
			System.out.println(string);
		}
		
		LinkedList<String> list2= new LinkedList<>();
		list2.add("Rose");
		list2.add("Lilly");
		list.addAll(list2);
		System.out.println("Adding List 2 in first List : \n"+list);
	}
}
