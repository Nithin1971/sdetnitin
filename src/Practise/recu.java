package Practise;

public class recu {
	
		static int i=1;
		static int meth(int a){
			if(a>=i){
				i=i*a;
				a--;
				meth(a);
			}
			return i;
		}
	
		public static void main(String[] args) {
			int i1=meth(10);
			System.out.println(i1);
		}
	
}
