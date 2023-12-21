package javatask;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class collections_entryset {
	
	public static void main(String[] args) {
		
	String m ="work hard play hard";
	 
	String replace = m.replace(" ","" );
		
	char[] charArray = replace.toCharArray();
	 
	Map<Character,Integer> m1 = new HashMap<>();
	
	
	for (char cr : charArray) 
	{
		
		if (m1.containsKey(cr)) {
			
			Integer integer= m1.get(cr);
			m1.put(cr, integer+1);
			
		}
		else {
			m1.put(cr, 1);
		}
	
	}

		
	System.out.println(m1);
	}
      
}
