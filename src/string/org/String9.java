package string.org;

public class String9 {
             public static void main(String[] args) {
            	 
            	 //9.1
				String s="Welcome to class java";
				boolean startsWith = s.startsWith(s);
				System.out.println(startsWith);
				//9.2
				String s1=" Hai i am nisha";
				boolean startsWith1 = s1.startsWith("welcome");
				System.out.println(startsWith1);
				
				//9.3
				String s2="Welcome to java class";
				boolean endsWith = s2.endsWith(s2);
				System.out.println(endsWith);
				
				//9.4
				String s3="Welcome to java class";
				boolean endsWith1 = s3.endsWith("java");
				System.out.println(endsWith1);
				//9.5
				String s4="Welcome to java class";
				boolean empty = s4.isEmpty();
				System.out.println(empty);
				//9.6
				String s5=" ";
				boolean empty1 = s5.isEmpty();
				System.out.println(empty1);
				
				
				
				
			}
	   
	
}
