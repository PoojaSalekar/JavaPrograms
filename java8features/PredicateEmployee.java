package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee1{
	int id,age;
	String Name;
	float salary;
	public Employee1(int id, int age, String name, float salary) {
		super();
		this.id = id;
		this.age = age;
		Name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", age=" + age + ", Name=" + Name + ", salary=" + salary + "]";
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
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public static List<Employee1> employeeList(){
		ArrayList<Employee1> list = new ArrayList<>();
		list.add(new Employee1(101,23,"Sonali",35000));
		list.add(new Employee1(102,24,"Shivani",20000));
		list.add(new Employee1(103,27,"Daksha",25000));
		list.add(new Employee1(104,21,"Trishika",50000));
		list.add(new Employee1(105,28,"Mahi",68000));
		list.add(new Employee1(106,22,"Pallavi",15000));
		return list;
	}
}
public class PredicateEmployee {

	public static void main(String[] args) {
		List<Employee1> list = Employee1.employeeList();
		
		 
		
		Predicate<Employee1> s1 = p -> p.getName().startsWith("A");
		Predicate<Employee1> s2 = p2 ->p2.getAge()<30 && p2.getName().startsWith("S");
		
	
	}

}
