package string.org;

import java.util.Scanner;

public class String7 {
public static void main(String[] args) {
	//7.1
	String s="Welcome to class java";
	
	String replace = s.replace(s, "Welcome to class sql");
	System.out.println(replace);
	
	//7.2
    String s1="Greens adayar";
	
	String replace1 = s1.replace(s, "Greens Omr");
	System.out.println(replace1);
	//7.3
	String s2=" Welcome to class java";
	String replace2=s2.replace( " ", "#");
	System.out.println(replace2);
	
//7.4
	Scanner scan=new Scanner(System.in);
	System.out.println("enter Email:");
	String next = scan.next();
	
	String replace3=next.replace( "@gmail","@yahoo");
	System.out.println(replace3);
	
	//7.5
	  System.out.println("enter address:");
	  String nextLine = scan.nextLine();
	  boolean contains = nextLine.contains("pincode-626101");
	 
	 if(contains==true) {
	    String replace4 = nextLine.replace(",pincode-626101", " ");
	    System.out.println(replace4);
	 }
	
	
	
	
	
}




}
