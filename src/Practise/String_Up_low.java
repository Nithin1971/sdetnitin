package Practise;

public class String_Up_low {
	public static void main(String[] args) {
		String s="JaVaMaVa";
//		char c1='a';
//		int ascii=c1;
//		System.out.println(ascii);
		
		String upper="";
		String lower="";
		for(int i=0; i<s.length(); i++){
			char ch=s.charAt(i);
			if((ch>=65)&&(ch<=90)){
				upper=upper+ch;
			}else{
				lower=lower+ch;
			}			
		}
		System.out.println(upper);
		System.out.println(lower);
	}
}
