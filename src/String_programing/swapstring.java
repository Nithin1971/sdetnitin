package String_programing;

public class swapstring {

	public static void main(String[] args) {
		String s1="hi";
		String s2="hello";
		s2=s1+s2;
		s1=s2.substring(s1.length() );
		s2=s2.substring(0, s2.length()-s1.length());
		System.out.println(s1);
		System.out.println(s2);
	}
}
