package javatask;

public class my_details {
	
	 my_details() {
		System.out.println("male");
	}
	my_details(int weight) {
		this();
	System.out.println(weight);
	}
	my_details(String name){
		this(75);
		System.out.println(name);
	
	}
    my_details(float height){
    	this("akruth");
    	System.out.println(height);
    }
	
	my_details(double bmi){
		this(175.8f);
		System.out.println(bmi);
	}
	my_details(char strenth){
		this(7.0d);
		System.out.println(strenth);
	}
	my_details(long fat){
		this('1');
		System.out.println(fat);
	}
	public static void main(String[] args) {
		my_details y=new my_details(11l);
	}
	

}
