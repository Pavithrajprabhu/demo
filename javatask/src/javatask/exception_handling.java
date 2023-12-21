package javatask;

public class exception_handling {
	
	public static void main(String[] args) {
		
		System.out.println("*******arithmetic exception*******");
		try {
			
		} catch (ArithmeticException e) {
			
		
		int a=11;
		int c=a/0;
		
		System.out.println(c);
		
		}
		finally {
			System.out.println("****** mlmlmlmlmlm******");
		}
		 
		System.out.println("*****null pointer*****");
		try {
			
		} catch (NullPointerException e) {
			
		
		String v=null;
		int length=v.length();
		
		System.out.println(length);
	}
		
		finally {
			System.out.println("null pointer get direct finally");
		}
		
		
		
		
		
		}
	    
	
	    
	}



