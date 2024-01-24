package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Created by Pooja Salekar

class Student{
	int id , age;
	String name;
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static List<Student> studentList(){
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(101,22,"Sadhna"));
		list.add(new Student(101,23,"Aishwarya"));
		list.add(new Student(101,26,"Sonali"));
		list.add(new Student(101,28,"Shivani"));
		list.add(new Student(101,20,"Sayli"));
		return list;
	}
}
public class PredicateEx {

	public static void main(String[] args) {
		
		
		List<Student> list = Student.studentList();
		
		Predicate<Student> s1 = p -> p.getName().startsWith("A");
		Predicate<Student> s2 = p2 ->p2.getAge()<30 && p2.getName().startsWith("S");
		
		boolean b1 = list.stream().anyMatch(s2);
		System.out.println("s2 with anyMatch :"+b1);
		
		boolean b2 = list.stream().allMatch(s2);
		System.out.println("s2 with anyMatch :"+b2);
		
		boolean b3 = list.stream().noneMatch(s2);
		System.out.println("s2 with anyMatch :"+b3);
		
		boolean b4 = list.stream().anyMatch(s1);
		System.out.println("s2 with anyMatch :"+b4);
		
		boolean b5 = list.stream().allMatch(s1);
		System.out.println("s2 with anyMatch :"+b5);
		
		boolean b6 = list.stream().noneMatch(s1);
		System.out.println("s2 with anyMatch :"+b6);
	}

}
