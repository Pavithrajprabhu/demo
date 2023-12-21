package javatask;

public class achild_override extends a_override {
	@Override
	public void add(int a, int b) {
		
		super.add(a, b);
	}
	@Override
	public void sub(int a, int b) {
		
		super.sub(a, b);
	}
		
	public static void main(String[] args) {
		achild_override a2=new achild_override();
		a2.add(88, 99);
		a2.sub(99, 77);
	}

}
