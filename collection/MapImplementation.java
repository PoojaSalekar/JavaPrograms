package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

//Created by Pooja Salekar

public class MapImplementation {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("In", "India");
		map.put("Br", "Brazil");
		map.put("De", "Germany");
		map.put("Fr", "France");
		map.put(null, null);
		
		System.out.println("Implemanting HashMap : ");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Country Code : "+entry.getKey() +"," +"Country : "+entry.getValue());
			
		}
		
		Map<String, String> treemap = new TreeMap<>();
		treemap.put("BR102", "Coffee");
		treemap.put("L207","Chole Puri");
		treemap.put("D305","Pasta");
		treemap.put("Br405","Tea");
		treemap.put("BR445","Biryani");
		//map.put(null, null);
		
		System.out.println("\nImplemanting TreeMap : ");
		
		for (Map.Entry<String, String> entry : treemap.entrySet()) {
			System.out.println("Code : "+entry.getKey() +"," +"Menu : "+entry.getValue());
			
		}
		
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("BR102", "Coffee");
		hashtable.put("L207","Pizza");
		hashtable.put("D565","Pasta");
		hashtable.put("Br405","Tea");
		hashtable.put("L445","Biryani");
		//map.put(null, null);
		
		System.out.println("\nImplemanting HashTable : ");
		
		for (Map.Entry<String, String> entry : hashtable.entrySet()) {
			System.out.println("Code : "+entry.getKey() +"," +"Menu : "+entry.getValue());
			
		}
	}

}
