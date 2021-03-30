package String_programing;

public class Compare_String {
	public static void main(String[] args) {
		String S1="java";
		String S2="java";
		if(S1==S2){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		if(S1.equals(S2)){
			System.out.println("equals pass");
		}else{
			System.out.println("equals fail");
		}
	}
}
