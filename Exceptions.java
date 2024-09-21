package Pragyan_Prabha;

public class Exceptions {

	public static void main(String[] args) {
		
		/*to see the exception, run this code
		int[] a1= {1,2,3,3,5};
		
		System.out.println(a1[5]);*/
		
		//to catch the exception, run this code
		
		try {
			int[] a1= {1,2,3,3,5};
			
			System.out.println(a1[5]);
		}
		
		catch(Exception e){
			
			System.out.println("error");
		}
		
		finally {
			System.out.println("Something went wrong");
		}
	}
}
