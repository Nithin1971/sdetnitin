package Pattern;

public class patt10 {

	public static void main(String[] args) {
		int row=5;
		for(int i=1; i<=row; i++){
			for(int j=row-i; j>=0; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}
			for(int k=row-i; k>=0; k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
