package String_programing;

public class flipkart {

	public static void main(String[] args) {
		String s="Software enginer";
		String[] l = s.split(" ");//["Software","enginer"]
		System.out.println(l.length);//2
		
		
		for(int i=0; i<l.length;i++)//i<2
		{
			String s1="";
			s1 =s1+ l[i].toString().charAt(0);//null+S
			for(int j=l[i].length()-1;j>0;j--)//
			{
				s1= s1 + l[i].toString().charAt(j);//Se
			}
			System.out.print(s1+" ");
			
		}
		
		
	}
}
