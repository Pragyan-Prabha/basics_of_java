package Pragyan_Prabha;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String,Integer> name=new HashMap<String,Integer>();
		
		name.put("Pragyan", 25);
		name.put("Prabha", 28);
		System.out.println(name);
		System.out.println(name.get("Prabha"));
		System.out.println(name.size());
		

	}

}
