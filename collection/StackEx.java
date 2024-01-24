package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Guava");
		stack.push("Mango");
		stack.push("Guava");
		stack.push("Apple");
		stack.push("Banana");
		stack.push(null);
		
		System.out.println("Stack :"+stack);
		System.out.println("Removing Element :"+stack.pop());
		System.out.println("Stack after removing:"+stack);
		System.out.println("search mango :"+stack.search("Mango"));
		System.out.println("search watermelon :"+stack.search("watermelon"));
	}

}
