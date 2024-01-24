package collection;

import java.util.ArrayDeque;
import java.util.Deque;

//created by Pooja Salekar

public class ArrayDequeEx {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.add("Apple");
		deque.offer("Mango");
		deque.offerFirst("Watermelon");
		deque.offer("Guava");
		deque.offerLast("Banana");
		deque.offer("Papaya");
		deque.offer("Grapes");
		deque.offer("PineApple");
		//deque.offer(null);
		
		System.out.println("\n Deque :"+deque);
		System.out.println(" Head of Deque : "+deque.element());
		System.out.println(" Deque :"+deque);
		System.out.println(" Removing 1st element of Deque : "+deque.pollFirst());
		System.out.println(" Deque :"+deque);
		System.out.println(" Head of Deque : "+deque.peek());
		System.out.println(" Deque :"+deque);
		System.out.println(" Removing last element of Deque : "+deque.pollLast());
		System.out.println(" Deque :"+deque);
		System.out.println(" last element of Deque : "+deque.peekLast());
		System.out.println(" Deque :"+deque);
	}

}
