package Practise;

public class String2 {
	public static void main(String[] args) {
		String S1=new String("hi hello how are you");
		String output="";
	    for (int i = 0; i < S1.length(); i++) {
	      for (int j = 0; j < S1.length(); j++) {
		                if (S1.charAt(i) != output.charAt(j)) {
		                    output = output + S1.charAt(i);
		                }
		            }
		        }

		        System.out.println(output);

		    }

		
	}

