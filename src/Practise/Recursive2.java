package Practise;

public class Recursive2 {
	static void cool(int a)
	{
		if (a<=10){
			if(a%2==0){
				System.out.println(a);
				}
			a++;
			cool(a);
			}
	}
	public static void main(String[] args) {
		cool(1);
	}
}
