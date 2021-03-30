package Practise;

public class String1 {
	public static void main(String[] args) {
		String S1="Hi hello how are you";
		String[]arr = S1.split(" ");
		for(int i= arr.length-1; i>=0; i--){
			System.out.print(arr[i]+" ");
		}
	}	
}