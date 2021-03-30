package Pattern;

public class patt5 {

	public static void main(String[] args) {
		int row=6;
		for(int i=1; i<=row; i++){
			for(int j=row-i; j>=0; j--){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
