package Practise;

public class Recursive3 {
	static void hot(int a){
		if(a>=1){
			if(a%2==1){
				System.out.println(a);
			}
			a--;
			hot(a);
		}
	}
	public static void main(String[] args) {
		hot(10);
	}
}
