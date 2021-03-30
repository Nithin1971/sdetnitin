package String_programing;

public class Reverse_String_array {
	public static void main(String[] args) {
		String s="my name is nithin";
		String[] sp = s.split(" ");
		for(int i=sp.length-1;i>=0;i--){
			System.out.print(sp[i]+" ");
		}
	}
}
