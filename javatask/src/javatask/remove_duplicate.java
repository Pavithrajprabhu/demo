package javatask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class remove_duplicate {

	public static void main(String[] args) {
		
		
		List<Integer> list= new ArrayList<Integer>();
		 
		list.add(39);
		list.add(33);
		list.add(34);
		list.add(38);
		list.add(34);
		list.add(33);
		list.add(34);
		
		Set<Integer> set= new HashSet<>(list);
		System.out.println("=====remove duplicate value=====");
		System.out.println(set);
		
		System.out.println("+++++++++ascending order++++++++");
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("++++++++decending order++++++++");
		
		Collections.reverse(list);
		System.out.println(list);
		
		
		
		
	}
	
       
}
