package Int;

public class Armstrong {

	public static void main(String[] args) {
		int no=153,c=0;
		int temp=no;
		while(no>0){
			int a=no%10;
			no=no/10;
			c=c+(a*a*a);
			
		}
		if(temp==c){
			System.out.println("its armstrong");
		}else{
			System.out.println("its not armstrong");
		}
	}
}
