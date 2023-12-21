package javatask;

public class hier_c2travels extends hier_travels{
	@Override
	public void passenger() {
		
		super.passenger();
	}
@Override
public void conductor() {
	
	super.conductor();
}
public static void main(String[] args) {
	hier_c2travels h2=new hier_c2travels();
	h2.conductor();
	h2.passenger();
}
}
