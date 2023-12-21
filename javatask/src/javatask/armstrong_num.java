package javatask;

public class armstrong_num {


	public static void main(String[] args) {
		
		int b;
		int count=0;
		for (int i = 0; i <=1000; i++) {
			
				
				int a=i;
				int temp=a;
				int c=0;
			    for (int j = 0; j <=5; j++) {
					
				
			b=a%10;
			c=c+(b*b*b);
			a=a/10;
			}
		
	      if (temp==c) {
			 System.out.println("armstrong number" +temp);
			 count=count+1;
		}
		}
		System.out.println("available"+count+"armstrong number");
		}
		
		
		}
	
	

