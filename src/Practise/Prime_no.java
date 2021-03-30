package Practise;

public class Prime_no {
	public static void main(String[] args)
	{
		for(int i=1; i<=100;i++ )
		{
			int no=i;
			boolean flag=true;
			for(int k=2; k<no; k++){
				if(no%k==0){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.println("prime number "+no);
			}else{
				System.out.println("not prime number "+no);
			}
		}
	}
}
