package javatask;

import java.util.Scanner;

public class if_condition {

	public static void main(String[] args) {
		 Scanner s1=new Scanner(System.in) ;
		 System.out.println("value of database");
		 int data= s1.nextInt();
		        
	
		 
		 if(data>48) {
		 System.out.println("higher level data");
		 } 
		 
		 else if (data==40) {
	    	System.out.println("medium level data");
	    	
	    }
		 else {
			 System.out.println("no data ");
		 }
 
			
		
		
		
		
	
	}
	
	
	
}
