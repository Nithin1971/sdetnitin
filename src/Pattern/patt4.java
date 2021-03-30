package Pattern;

public class patt4 {

	public static void main(String[] args) {
		int row=5;
		for(int i=1; i<=row; i++){
			for(int j=row-i; j>=1; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int a=1; a<=row; a++){
			for(int b=1; b<=a; b++){
				System.out.print(" ");
			}
			for(int c=row-1; c>=a; c--){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
