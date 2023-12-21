package javatask;

public class a_override {
public void add(int a,int b) {
	System.out.println(a+b);

}

private void add(String a , int b) {
	
System.out.println(a);
}

private void add(char a , String b) {
	

}
public void sub(int a,int b) {
	System.out.println(a-b);
}
public static void main(String[] args) {
	a_override a1=new a_override();
	a1.add(11, 21);
	a1.sub(33, 22);
	
}
}
