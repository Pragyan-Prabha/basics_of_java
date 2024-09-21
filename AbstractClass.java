package Pragyan_Prabha;


abstract class Abs{ //abstract class
	
	public abstract void sleep(); //abstract method
	
	public void awake()  //regular method
	{
		
	System.out.println("zzzzz");
	}
}

class Child extends Abs{
	
	public void sleep() {
		
		System.out.println("I am sleeping");
		
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
		Child c1=new Child();
		
		c1.sleep();
		c1.awake();

	}

}
