package Practise;

public class String_Up_low_num {
	public static void main(String[] args) {
		String s="JaVa1M2aV3a";
		String upper="";
		String lower="";
		String num="";
		for(int i=0; i<s.length();i++){
			char ch = s.charAt(i);
			if((ch>=65)&&(ch<=90)){
				upper=upper+ch;
			} else if((ch>=97)&&(ch<=122)){
				lower=lower+ch;
			}else{
				num=num+ch;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(num);
	}
}
