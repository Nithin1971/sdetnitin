package String_programing;

public class Palindrome {
	public static void main(String[] args) {
		String s="level";
		String rev="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)){
			System.out.println("its palindrome");
		}else{
			System.out.println("its not palindrome");
		}
	}	
}
