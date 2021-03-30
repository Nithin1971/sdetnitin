package Pattern;

public class patt7 {

	public static void main(String[] args) {
		int row=6;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}
			for(int k=row-i; k>=0; k--){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
