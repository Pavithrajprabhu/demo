package javatask;

public class movie_collection {
private void actionmovie(String name,int a) {
	System.out.println(name+""+a);

}

private void actionmovie(long budget,int dm) {
	System.out.println(budget+""+dm);

}	

private void actionmovie(char gender) {
	System.out.println(gender);

}	
private void actionmovie(float collection) {
	System.out.println(collection);

}	

private void actionmovie(short top) {
	System.out.println(top);

}	
private void actionmovie(int p,int o,int i) {
	System.out.println(p+""+o+""+i);
	}
public static void main(String[] args) {
	movie_collection m=new movie_collection();
   m.actionmovie("avanger", 10);
   m.actionmovie(23455, 98987); 
   m.actionmovie('m');
   m.actionmovie(988889.8766555f);
   m.actionmovie(1);
   m.actionmovie(9, 8, 7);
}


}
