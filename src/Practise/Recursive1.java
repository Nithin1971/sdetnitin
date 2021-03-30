package Practise;

public class Recursive1 {
	static void doo(int a) throws InterruptedException{
		if (a>=1){
			System.out.println(a);
			Thread.sleep(2000);
			a--;
			doo(a);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		doo(10);
	}
}
