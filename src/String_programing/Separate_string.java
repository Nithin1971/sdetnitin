package String_programing;

public class Separate_string {
	public static void main(String[] args) {
		
	String s="NiThIn@1*9/7$1&Rx";
	String upper="";
	String lower="";
	String num="";
	String special_char="";
	for(int i=0; i<s.length();i++){
		char ch = s.charAt(i);
		if((ch>=65)&&(ch<=90)){
			upper=upper+ch;
		}else if ((ch>=97)&&(ch<=122)) {
			lower=lower+ch;
		}else if ((ch>=48)&&(ch<=57)) {
			num=num+ch;
		}else{
			special_char=special_char+ch;
		}
	}
	System.out.println(upper);
	System.out.println(lower);
	System.out.println(num);
	System.out.println(special_char);
	}
}
