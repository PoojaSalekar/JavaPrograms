package collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		Set<String> hashset =  new HashSet<>();
		hashset.add("Riya");
		hashset.add("Ravia");
		hashset.add("Riya");
		hashset.add("Meera");
		hashset.add(null);
		System.out.println("implementing Hashset :"+hashset);
		for (String string : hashset) {
			System.out.println(string);
		}
		
		LinkedHashSet<String> linkedHashedSet = new LinkedHashSet<>();
		linkedHashedSet.add("Mango");
		linkedHashedSet.add("Banana");
		linkedHashedSet.add("Mango");
		linkedHashedSet.add("Guava");
		linkedHashedSet.add(null);
		
		System.out.println("implementing LinkedListset :"+linkedHashedSet);
		
		TreeSet<String> treeSet = new TreeSet();
		treeSet.add("Pizza");
		treeSet.add("Burger");
		treeSet.add("Cofee");
		treeSet.add("Pizza");
		//treeSet.add(null);

		System.out.println("implementing TreeSet :"+treeSet);

}

}
