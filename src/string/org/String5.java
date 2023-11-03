package string.org;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
//		//5.1
//		 String s="velmurugank541@gmail.com";
//		 boolean contains = s.contains("@");
//		 System.out.println(contains);
//		 
//		 if(contains==true)
//		  System.out.println("valid mail id");
//		  
//		  //5.2
//		  String s1="5-35-2a,venkatesh nivas,Aruppukottai";
//		  boolean contains1 = s1.contains("pincode");
//		  System.out.println(contains1);
//			 
//		 if(contains1==true)
//		 System.out.println("valid mail id");
//	     else
//		 System.out.println("invalid address");
//		 
//		 //5.3
		Scanner scan=new Scanner(System.in);
//		System.out.println("enter id:");
//		String next = scan.next();
//		
//		
	  //boolean contains2 = next.contains("@");
		//   System.out.println(contains2);
		
		   //5.4
		   
			System.out.println("enter phone number:");
			String phone = scan.next();
			
			boolean contains3 = phone.contains("abcdefghijklmnopqrstuwxyz");
			
			if(contains3==false)
				System.out.println("valid number");
			else {
				System.out.println("invalid number");
		}
			
			
			 
	     }
}
	
	
			  	  
		  
		  
	
	
	

