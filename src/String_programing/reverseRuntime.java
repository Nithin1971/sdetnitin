package String_programing;

import java.util.Scanner;

public class reverseRuntime {

	public static void main(String[] args) {
		String s1;
		String rev="";
		Scanner in=new Scanner(System.in);
		System.out.println("enter string to reverse");
		s1=in.nextLine();
		int l = s1.length();
		for(int i=l-1;i>=0;i--){
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}
}
