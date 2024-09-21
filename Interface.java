package Pragyan_Prabha;

interface Inter{
	
	public void method1();
	
	public void method2();
	
}


class SubCls implements Inter{

	public void method1()
	{
		System.out.println("I am method1");
	}
	
	public void method2()
	{
		System.out.println("I am method2");
	}
}

public class Interface {

	public static void main(String[] args) {
		
		SubCls sb=new SubCls();
		sb.method1();
		sb.method2();

	}

}
