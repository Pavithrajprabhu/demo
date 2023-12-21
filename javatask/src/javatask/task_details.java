package javatask;

import java.util.Scanner;

public class task_details {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
System.out.println("enter the string value");
 String next=sc.next();
 System.out.println(next);
 
 System.out.println("enter the stringline value");
 String nextline=sc.next();
 System.out.println(nextline);
	
	System.out.println("enter the float value");
	float nextfloat=sc.nextFloat();
	System.out.println(nextfloat);
	
	System.out.println("enter the double value ");
	double nextdouble=sc.nextDouble();
	System.out.println(nextdouble);
	
	System.out.println("enter the short value");
	short nextshort=sc.nextShort();
	System.out.println(nextshort);
	
	System.out.println("enter the long value");
	long nextlong=sc.nextLong();
	System.out.println(nextlong);
	
	System.out.println("enter the char value");
	char charAt=sc.next().charAt(1);
	System.out.println(charAt);
	
	System.out.println("enter the int value");
	int nextint=sc.nextInt();
	System.out.println(nextint);
	
	System.out.println("enter the boolean value");
	boolean nextboolean=sc.hasNext();
	System.out.println(nextboolean);
	
	
	
	
	
 }

}
