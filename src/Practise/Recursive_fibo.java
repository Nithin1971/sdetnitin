package Practise;

public class Recursive_fibo {
	static int f1=0;
	static int f2=1;

	static void roo(int a){
		if(a<=10){
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(f3);
			a++;
			roo(a);
		}
		
	}
		
	public static void main(String[] args) {
		System.out.print(f1);
		roo(1);
	}
}
