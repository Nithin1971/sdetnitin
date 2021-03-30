package Practise;

public class Recursive {
	static void disp(int a){
	if(a<=10){
		System.out.println(a);
		a++;
		disp(a);
	}	
	
	}
	public static void main(String[] args) {
		disp(1);
	}
}
