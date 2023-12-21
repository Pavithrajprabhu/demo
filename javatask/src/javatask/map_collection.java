package javatask;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class map_collection {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> m = new TreeMap<>();
		
		m.put(1,"morning");
		m.put(2,"afternoon");
		m.put(3,"evening");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
    	String string = m.get(3);
		System.out.println(string);		


////		Set<Integer> keySet = m.keySet();
//		System.out.println(keySet);
////		
//		Collection<String> values = m.values();
//		System.out.println(values);
//		
//		boolean containsKey = m.containsKey(2);
//		System.out.println(containsKey);
//		
//		boolean containsValue = m.containsValue("evening");
//		System.out.println(containsValue);
//		
//	
	}
	
	

}
