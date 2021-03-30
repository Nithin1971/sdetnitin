package Practise;

public class Fibonasy {
	static int a=0;
	static int b=1;
	static int c;
	static public void fib(int count){
		if(count>=0){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			fib(count-1);
		}
	}
	public static void main(String[] args) {
		int count=10;
		System.out.println(a);
		System.out.println(b);
		Fibonasy.fib(count-2);
	}
}
