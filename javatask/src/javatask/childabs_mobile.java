package javatask;

public class childabs_mobile extends abs_mobile{

	@Override
	public void model() {
		System.out.println("13pro");
		
	}

	@Override
	public void pattern() {
	System.out.println("8888");
		
	}

	@Override
	public void battery() {
		System.out.println("100");
		
	}
public static void main(String[] args) {
	childabs_mobile c =new childabs_mobile();
	c.model();
	c.pattern();
	c.battery();
}



}

