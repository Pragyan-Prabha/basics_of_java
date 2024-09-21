package Pragyan_Prabha;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		LinkedList<String> cars=new LinkedList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Maruti");

		System.out.println("Cars name:" + cars);
		cars.addFirst("Audi");
		System.out.println("Cars name after adding new car in first place:" + cars);
		cars.addLast("TATA");
		System.out.println("Cars name after adding new car at last place:" + cars);
		System.out.println(cars.size());
		System.out.println(cars.removeFirst());
		System.out.println(cars.removeLast());
		System.out.println("Cars name:" + cars);
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());
		
		System.out.println(cars.get(1));  //BMW
		
		cars.clear();
		System.out.println(cars); //empty list
	}
}
