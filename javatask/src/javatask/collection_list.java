package javatask;

import java.util.*;
public class collection_list {
	
	public static void main(String[] args) {
		
		List<Object> list = new Vector();
		
		list.add(2);
		list.add("strong");
		list.add("weak");
		
		System.out.println(list);
		
		
		List<Object> list1 = new Vector();
		
		list1.add(32);
		list1.add("power");
		list1.add("density");
		
		list1.retainAll(list1);
		
	    List<Object> list2 =new Vector();
	    list.add("value");
	    list.add("transfer");
	    
		
		//list1.removeAll(list1);
		list1.addAll(list);
		list2.addAll(list1);
		System.out.println(list2);
	}

	

		

}
