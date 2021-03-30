package Practise;

public class Prime {
	public static void main(String[] args) {
		int num=5;
		boolean flag=true;
		for(int i=2; i<num; i++ ){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println("its prime number "+ num);
		}else{
			System.out.println("its not prime number "+num);
		}
	}
}
