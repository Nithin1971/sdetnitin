package Array_programing;

public class RemoveDupli {
	public static void main(String[] args) {
		char [] arr={'a','b','c','a','c','a','c'};
		int l = arr.length;
		char c;
		for(int i=0; i<l; i++){
			
			for(int j=i+1; j<l; j++){
				if((arr[i]==arr[j])&&arr[i]!='0'){
					System.out.println(arr[j]);
					arr[j]='0';
				}
			}		
		}
		for(int i=0; i<l; i++){
			if(arr[i]!='0'){
				System.out.print(arr[i]);
			}
		}

	}
}
