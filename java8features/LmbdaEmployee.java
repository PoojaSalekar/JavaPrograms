package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Created by Pooja Salekar 

class Employee {
	int id,age;
	String name;
	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}
public class LmbdaEmployee {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101,23,"Daksha"));
		list.add(new Employee(102,21,"Sayli"));
		list.add(new Employee(103,22,"Ashwini"));
		list.add(new Employee(104,20,"Dipali"));
		list.add(new Employee(105,24,"Sadhana"));
		
		Collections.sort(list,(e1,e2) -> {
			return e1.name.compareTo(e2.name);
		});
		list.forEach(e ->System.out.println(e));
	}

}
