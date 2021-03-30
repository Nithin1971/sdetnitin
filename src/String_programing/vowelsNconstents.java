package String_programing;

public class vowelsNconstents {

	public static void main(String[] args) {
		String s1="nithinuimsjlajsu";
		int vowel=0;
		int constents=0;
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++){
			char s = s1.charAt(i);
			if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
				vowel++;
			}else{
				constents++;
			}
		}
		System.out.println(vowel);
		System.out.println(constents);
	}
}
