package javatask;

public class inf_child3 implements inf_parent1,inf_parent2 {

	@Override
	public void shirtbrand3() {
		System.out.println("tommy");
		
	}

	@Override
	public void shirtbrand4() {
		System.out.println("arrow");
		
	}

	@Override
	public void shirtbrand1() {
		System.out.println("calvinkelin");
		
	}

	@Override
	public void shirtbrand2() {
		System.out.println("puma");
		
		
	} 
public static void main(String[] args) {
	inf_child3 e=new inf_child3();
	e.shirtbrand1();
	e.shirtbrand2();
	e.shirtbrand3();
	e.shirtbrand4();
}
	
}
