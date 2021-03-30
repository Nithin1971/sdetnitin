package String_programing;

public class revString {

	public static void main(String[] args) {
		String s="my name is nithin";
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length; i++){
			String s1=arr[i];
			String rev="";
			for(int j=s1.length()-1; j>=0;j--){
				rev=rev+s1.charAt(j);
			}
			System.out.print(rev+" ");
		}
	}
}
