package string.org;

public class String4 {
	public static void main(String[] args) {
		 String s="Java";
		 String s2="Java";
		 boolean equals = s.equals(s2);
		System.out.println(equals);
		
		 String s3="Java";
		 String s4="java";
		 boolean equals1 = s3.equals(s4);
		System.out.println(equals1);
		
		 String s5="GreenTechnology";
		 String s6="Green Technonogy";
		 boolean equals2 = s5.equals(s6);
		System.out.println(equals2);
		
		 String s7="Java";
		 String s8="java";
		boolean equalsIgnoreCase = s7.equalsIgnoreCase(s8);
		System.out.println(equalsIgnoreCase);
		
		
		String s9="Nisha";
		 String s0="nisha";
		boolean equalsIgnoreCase1 = s9.equalsIgnoreCase(s0);
		System.out.println(equalsIgnoreCase1);
		
	}

}
