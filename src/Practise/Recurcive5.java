package Practise;

	public class Recurcive5 {
		static int f=1;
		static int doom(int a)  {
			if(a>=f){
				f=f*a;
				a--;
				doom(a);				
			}
			return f;
		}
		public static void main(String[] args) {
			int f1 = doom(10);
			System.out.println(f1);
		}
}
