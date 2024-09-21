package Pragyan_Prabha;

public class Exceptions1 {

	void checkAge(int age) {

		if(age<18) {
			throw new ArithmeticException("Access denied");
		}
		
		else {

			System.out.println("access grated");
		}
	}

	public static void main(String[] args) {
		
		Exceptions1 ex=new Exceptions1();
		ex.checkAge(15);
	}

}
