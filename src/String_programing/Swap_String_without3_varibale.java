package String_programing;

public class Swap_String_without3_varibale {
	public static void main(String[] args) {
		String S1="java";
		String S2="mavaa";
		
		S1=S1+S2;
		//System.out.println(S1);
		
		S2=S1.substring(0,S1.length()-S2.length());
		//System.out.println(S2);
		
		S1=S1.substring(S2.length());
				//System.out.println(S1);
		
		System.out.println(S1);
		System.out.println(S2);
	}
}
