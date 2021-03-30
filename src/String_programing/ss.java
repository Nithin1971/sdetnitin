package String_programing;


public class ss {
	public static void main(String[] args) {
		String S="harsha halesh";
		String[] name = S.split(" ");//["harsha","halesh"]


		for(int i=0; i<name.length; i++){
			//			System.out.println(name[i]);//harsha
			String s1="";

			s1=s1+name[i].charAt(0);//h
			//			System.out.println(s1);
			for(int j=name[i].length()-1; j>0; j--)//harsha
			{
				s1=s1+name[i].charAt(j);//
			}
			System.out.print(s1+" ");
		}
	}
}
