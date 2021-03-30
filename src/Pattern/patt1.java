package Pattern;

public class patt1 {

	public static void main(String[] args) {
		int row=5;
		for(int i=1; i<=row; i++){
			
			for(int j=1; j<=(row-i); j++){
				
				System.out.print(" ");
			}
			for(int k=i; k>0; k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
