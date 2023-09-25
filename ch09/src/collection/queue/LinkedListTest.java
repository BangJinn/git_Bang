package collection.queue;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		List<String> myList = new LinkedList<>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(2,"D");
		System.out.println(myList);
		
		for(String list : myList) {
			System.out.print(list + " ");
			
		}
		
		
	}

}