package String_programing;

public class String_vowels_constents {
	public static void main(String[] args) {
		String S="javathalenovu";
		int vowel_count=0;
		int constents_count=0;
		String vowel="";
		String constens="";
		for(int i=0;i<S.length();i++){
			char ch = S.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				vowel_count++;
				vowel=vowel+ch;
			}else{
				constents_count++;
				constens=constens+ch;
			}
		}
		System.out.println(vowel_count);
		System.out.println(constents_count);
		System.out.println(vowel);
		System.out.println(constens);
	}
}
