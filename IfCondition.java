package Pragyan_Prabha;

public class IfCondition {

	void checkAge(int age)
	{
		if(age>=18) {

			System.out.println("eligible for vote");
		}
		else
		{

			System.out.println("not eligible for vote");
		}	
	}

	public static void main(String[] args) {

		IfCondition obj=new IfCondition();
		obj.checkAge(20);
		obj.checkAge(15);

	}

}
