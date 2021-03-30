package Array_programing;

public class ArrayChar {

	public static void main(String[] args) {
		char [] arr={'a','d','r','a','s'};
		int l = arr.length;
		String s="";
		
		for(int i=0; i<l; i++){
			 s=s+arr[i];
		}
		
		System.out.println(s);
	}
}
