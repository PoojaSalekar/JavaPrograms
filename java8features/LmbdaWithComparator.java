package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class LmbdaWithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		list.add(new Product(101,"Notebook",1300));
		list.add(new Product(102,"Pencil box",300));
		list.add(new Product(103,"Keyboard",8900));
		list.add(new Product(104,"Mouse",4700));
		list.add(new Product(105,"Monitor",15600));
		
		Collections.sort(list,(p1,p2)-> {
			return p1.name.compareTo(p2.name);
		} );
		/*for (Product product : list) {
			System.out.println(product);
		}*/
		
		//for each method
		
		list.forEach(p ->System.out.println(p) );
	}

}
