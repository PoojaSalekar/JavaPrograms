package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamwithMap {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(45);
		marks.add(56);
		marks.add(78);
		marks.add(85);
		marks.add(75);
		marks.add(64);
		System.out.println("Marks before grace :" +marks);
		
		//I want to grace marks by 10
		List<Integer> updateMarks =marks.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println("Marks after grace :" +updateMarks);
		
	}

}
