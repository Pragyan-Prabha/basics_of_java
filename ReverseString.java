package Pragyan_Prabha;

public class ReverseString {
	
public static void main(String args[]) {
		
	
	String original="AutomatioN";
	String reverse="";
	
	int len=original.length();//10
	
	for(int i=len-1;i>=0;i--) 
	{	
		reverse=reverse + original.charAt(i);
	}
	
	System.out.println(reverse);
	
}}
	
	


