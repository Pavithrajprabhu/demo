package javatask;

import java.util.HashSet;
import java.util.Set;

public class collection_set {
	
	
	
	public static void main(String[] args) {
		
		Set<Object> set1= new HashSet<Object>();
		
		set1.add(123);
		set1.add("akash");
		
		Set<Object> set2 = new HashSet<Object>();
		
		set2.add(234);
		set2.add("value");
		
		set1.clear();
		
		
	System.out.println(set2);
	
	}

}
