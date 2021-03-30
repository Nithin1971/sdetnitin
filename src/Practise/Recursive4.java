package Practise;

public class Recursive4 {
	static int f=1;
 static int facto(int a){
	 if(a>=1){
		 f=f*a;
		
	 	 a--;
		 facto(a);
	 }	
	 return f;
 }
 public static void main(String[] args) {
	int f1 = Recursive4.facto(10);
	 System.out.println(f1);
}
}
