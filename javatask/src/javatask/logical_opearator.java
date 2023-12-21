package javatask;

import java.util.Scanner;

public class logical_opearator {
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("income tax");
		int income=s1.nextInt();
		 
		
		if (income >10000 && income>20000) {
			System.out.println("high level tax");
			
		}
		else if (income==30000) {
			System.out.println(" convince tax paid");
		}
		
		else if (income<5000  || income <10000) {
			System.out.println("low level tax");
			
			
	}
	}
	
  
}
