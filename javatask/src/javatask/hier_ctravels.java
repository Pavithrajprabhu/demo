package javatask;

public class hier_ctravels extends hier_travels {

	@Override
	public void passenger() {
		
		super.passenger();

	}
	
	@Override
	public void conductor() {
		
		super.conductor();
	}
	
	public static void main(String[] args) {
		hier_ctravels h1=new hier_ctravels();
	h1.conductor();
	h1.passenger();
	}
	
	
}
