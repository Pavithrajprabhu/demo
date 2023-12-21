package javatask;

public class palindrome_pd {

	public static void main(String[] args) {
		int a=232,b,c=0;
		 
		int temp=a;
		for (int i = 0; i <=a; i++) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
		}
			
		if	(temp==c) {
			System.out.println("its polidrome");
		}
			else {
				System.out.println("its not polidrome");
			}
		}
		
	}
	
	
	

