package javatask;

public class reverse_string {
	
	
	public static void main(String[] args) {
		
		
		String s = "life is hard";
		
		String[] split =  s.split("");
		
		for (int i = split.length -1;i>=1;i--) {
			System.out.println(split[i]+" ");
		}
		
		
	}
	

}
