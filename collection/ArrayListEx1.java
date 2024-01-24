package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Raj");
		list.add(20);
		list.add(56.89);
		list.add(null);
		list.add(true);
		list.add("Raj");
		
		System.out.println("List elements :"+list);
		
		ArrayList<String> list2 = new  ArrayList<String>();
		list2.add("Rose");
		list2.add("Lilly");
		list2.add("Mogra");
		list2.add("Lotus");
		list2.add("Rose");

		//list2.add(null);
		System.out.println("Generic list :"+list2);
		
		System.out.println("Iterating list using iterator interface :");
		Iterator<String> iterator = list2.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("Iterating list using for each loop :");
		for (String string : list2) {
			System.out.println(string);
		}
		
		System.out.println("List After Sorting :");
		Collections.sort(list2);
		for (String string : list2) {
			System.out.println(string);
		}
	}

}
