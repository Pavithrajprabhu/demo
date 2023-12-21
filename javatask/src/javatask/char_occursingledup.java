package javatask;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class char_occursingledup {

	public static void main(String[] args) {
		
		String s= "object oriented program and data";
		 
		String replace = s.replace(" ", "");
		 

		char[] charArray = replace.toCharArray();
		 
		Map<Character,Integer> m1 = new HashMap<>();
		
		for (char c : charArray) {
			
			Integer inte = m1.get(c);
			
			if (inte==null) {
				m1.put(c, 1);
				
			}
			else {
				m1.put(c,inte+1);
				
			}
			
		}
       System.out.println(m1);
       
       System.out.println("+++++++++++finding duplicate value+++++++");
       
       Set<Entry<Character,Integer>> entrySet = m1.entrySet();
       
       for (Entry<Character, Integer> entry : entrySet) {
		
    	   if (entry.getValue()>1) {
    		   
    		   System.out.println(entry.getKey()+"="+entry.getValue()+",");
    		
		}
    	   
	}
       System.out.println();
       
       System.out.println("+++++++++++++++find the single entry value++++++++++");
       
       Set<Entry<Character,Integer>> entrySet2 = m1.entrySet();
       
       for (Entry<Character, Integer> entry1 : entrySet2) {
    	   
    	   if (entry1.getValue()==1) {
			
    		   System.out.println(entry1.getKey()+"="+entry1.getValue()+",");
		}
		
	}
		
		System.out.println();
		
		
		
		
		
		
	}
	
}

	
	
	
	
	
	
	

