package javatask;

public class singlem_child extends singlem_parent{
@Override
public void doctorname() {

	super.doctorname();
}
public static void main(String[] args) {
	singlem_parent s=new singlem_parent();
			s.doctorname();
			s.patientid();
}
}




