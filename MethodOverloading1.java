package Pragyan_Prabha;

class MethodOverloading1 {
	
	public static void main(String[] args) {

		MethodOverloading1 m1=new MethodOverloading1();

		m1.school(10, 10);
		school(20,20.20);
		m1.school('a',30);

		System.out.println("print all method");

	}

	void school(int a, int e) {

		System.out.println("menthod1");
	}

	static void school(int b, double d) {

		System.out.println("menthod2");
	}

	void school(char c, int z) {

		System.out.println("menthod3");

	}
	
		}
