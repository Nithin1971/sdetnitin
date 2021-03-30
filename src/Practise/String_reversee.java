package Practise;

public class String_reversee {
	public static void main(String[] args) {
		String S="himalyan_rx";
		String rev="";
		for(int i=S.length()-1; i>=0; i--){
			char ch = S.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
}
