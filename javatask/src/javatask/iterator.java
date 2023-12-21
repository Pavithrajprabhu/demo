package javatask;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iterator {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		list.add(90);
		list.add(87);
		list.add(100);
		list.add(76);
		
		ListIterator<Integer> listIterator = list.listIterator();
		
		System.out.println("++++++hasnext & next function+++++");
		
	 while (listIterator.hasNext()) {
		  System.out.println(listIterator.next());
	 }
		  
      System.out.println("++++++++hasprevious &  previous function");
      
      while (listIterator.hasPrevious()) {
    	  System.out.println(listIterator.previous());
		
	}
		
	
	}
		
	
			
		


			
		
		
	
	
	}	
	
	

