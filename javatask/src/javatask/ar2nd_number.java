package javatask;

public class ar2nd_number {
	
	public static void main(String[] args) {
		
		int a[]= {21,22,34,55,44,554,344};
	    
		
		int sn =a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i]>sn)
			{
			sn=a[i];
			}
			System.out.println(a[i]);
		}
		
		
		
	}

}
