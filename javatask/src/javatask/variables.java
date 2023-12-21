package javatask;

public class variables {
 // classvariable
	int a=11;
	int b;
	float f=22.3f;
	double d=2.3d;
	short s=232;
	char c='e';
// static variable
	static String name;
	static double t=2.4d;
	static boolean k=true;
	static short p=323;
	
// static method
	public static void train() {
		System.out.println("kpmexpress");
  
	}
     public static void trainplat() {
  System.out.println(3);

	}
// static block
     static {
    	 System.out.println("head");
     }

//localvariable
	public void transformers() {
    int z=11;
    long y=22;
    System.out.println(z);
    System.out.println(y);

	}
	public static void main(String[] args) {
		variables v=new variables();
	 System.out.println(v.a);
	 System.out.println(v.b);
     System.out.println(v.c);	
	System.out.println(v.d);
	 System.out.println(v.f);
	 System.out.println(v.s);
	 System.out.println(v.k);
	 System.out.println(name);
	 System.out.println(v.p);
	 
		
		v.transformers();
		train();
		trainplat();
	}
	
	
	
	
}
