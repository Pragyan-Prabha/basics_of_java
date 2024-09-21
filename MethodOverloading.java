
package Pragyan_Prabha;

public class MethodOverloading {
	
	static int plusMethod(int x,int y)
	{
		return x+y;
	}
	
	static double plusMethod(double x,double y)
	{
		return x+y;
	}

	public static void main(String[] args) {
		
		int myNum1=plusMethod(5,5);
		
		double myNum2=plusMethod(5.1,5.1);
		
		System.out.println("value of integer is:" + "   " +myNum1);
		System.out.println("value of integer is:" + "   " +myNum2);

	}

}
