package Pragyan_Prabha;

public class Palindrome {
	
public static void main(String args[]) {
		
	
	String original="racecar";
	String reverse="";
	
	int len=original.length();//10
	
	for(int i=len-1;i>=0;i--) 
	{	
		reverse=reverse + original.charAt(i);
	}
	
	System.out.println(reverse);
	
	if(original.equals(reverse))
	{
		System.out.println("palindrome");}
	else {
		
		System.out.println("not palindrome");}
	}
}
	
	


