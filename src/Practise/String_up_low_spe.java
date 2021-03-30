package Practise;

public class String_up_low_spe {
	public static void main(String[] args) {
		String s ="VaRuN123&#@";
		String upper="";
		String lower="";
		int No=0;
		String sp="";
		for(int i=0;i<s.length(); i++){
			char ch = s.charAt(i);
			if((ch>=65)&&(ch<=90)){
				upper=upper+ch;
			}else if((ch>=97)&&(ch<=122)){
				lower=lower+ch;
			}else if((ch>=48)&&(ch<=57)){
				No=No+ch;
			}else{
				sp=sp+ch;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(No);
		
	}
}
