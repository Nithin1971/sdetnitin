package Array_programing;

public class StringEquaals {

	public static void main(String[] args) {
		String s=" Harsha";
		String s1="HaRsha ";
		
		s=s.toLowerCase().trim();
		s1= s1.toLowerCase().trim();
		
		if(s.equals(s1)){
			System.out.println("String is equals");
		}else{
			System.out.println("String not equal");
		}
	}
}
