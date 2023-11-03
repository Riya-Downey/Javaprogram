package string.org;

import java.util.Scanner;

public class String6 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("enter phone number:");
	long nextLong = scan.nextLong();
	
	
	if(nextLong>=10)
		System.out.println("valid number");
	
	else
		System.out.println("invalid number");
}
}
