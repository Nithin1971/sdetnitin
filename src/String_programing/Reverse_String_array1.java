package String_programing;

public class Reverse_String_array1 {
	public static void main(String[] args) {
		String s="my name is nithin";
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		for(String r:s.split(" ")){
			System.out.print(r);
		}
		
		
	}
}
