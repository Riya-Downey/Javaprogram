package string.org;

import java.util.Scanner;

public class String8 {
	
	public static void main(String[] args) {
		//8.1
		Scanner scan=new Scanner(System.in);
		System.out.println("enter name:");
	    String next = scan.next();
		
		String lowerCase = next.toLowerCase();
		System.out.println("changed name:"+ lowerCase);
		//8.2
		System.out.println("enter name:");
	    String next1 = scan.next();
		
		String upperCase = next1.toUpperCase();
		System.out.println("changed name:"+ upperCase);
		  
		
		
		
	}

}
