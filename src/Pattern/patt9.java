package Pattern;

public class patt9 {

	public static void main(String[] args) {
		int row=5;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=row; i++){
			for(int j=row-i; j>=1; j--){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
