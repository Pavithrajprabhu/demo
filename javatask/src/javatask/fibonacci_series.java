package javatask;

public class fibonacci_series {

	public static void main(String[] args) {
		int a=1,b = 0,c=0;
		int p=20;
		
		for (int i = 0; i <=p; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
