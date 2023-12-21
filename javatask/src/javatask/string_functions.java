package javatask;

public class string_functions {

	public static void main(String[] args) {
		
		String s1= "do or die" ;
		 
		int length = s1.length();
		  System.out.println(length);
		  
		  boolean equals = s1.equals("never die");
		  System.out.println(equals);
		  
		String upperCase = s1.toUpperCase();  
		System.out.println(upperCase);
		
	 String lowerCase = s1.toLowerCase();
	 System.out.println(lowerCase);
	 
	 boolean startsWith = s1.startsWith("o");
		  System.out.println(startsWith);
		  
		  boolean endsWith = s1.endsWith("e");
		  System.out.println(endsWith);
		  
		  boolean contains = s1.contains("o");
		  System.out.println(contains);
		  
		  int indexOf = s1.indexOf("d");
		  System.out.println(indexOf);
		  
		  String replace = s1.replace("die", "do");
		  System.out.println(replace);
		 
		 char charAt = s1.charAt(3);
		 System.out.println(charAt);
		 
		 String concat = s1.concat("you win");
		 System.out.println(concat);
		 
		 String[] split = s1.split("");
		 
		 for (String kl: split) {
			System.out.println(kl);
		}
		  System.out.println("**************");
		  String split2[] = s1.split(" ");                  // reverse string
		  for (int i = split2.length -1; i>=0; i--) {
			System.out.println(split2[i]+" ");
		}
		  System.out.println("************************");
		}

}
	     
	    
	

		
		 
		  
		
		  
		  
		  
	
	
	
	
 
