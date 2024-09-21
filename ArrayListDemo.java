package Pragyan_Prabha;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> cars=new ArrayList<String>();

		cars.add("TATA");
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Maruti");

		System.out.println("Cars name before:" + cars);
		System.out.println("Index of first car is:" + " "  + cars.get(1));
		System.out.println(cars.set(0, "Breza"));
		System.out.println("Cars name after:" + cars);
		//cars.clear();
		//System.out.println("Cars name after clear:" + cars);
		System.out.println(cars.size());
		System.out.println(cars.remove(1));
		System.out.println(cars);
	}

}
