package Array_programing;

public class removeDuplicate {

	public static void main(String[] args) {
		int arr[]={1,2,5,3,6,5,5,4,7,9,5,1,2,2,1,4,5,7,8,9};
		int l = arr.length;
		for(int i=0; i<l; i++){
			for(int j=i+1; j<l; j++){
				if(arr[i]==arr[j]){
				arr[j]=0;
				}
			}
		}
	
	for(int i=0; i<l; i++){
		if(arr[i]!=0){
			System.out.println(arr[i]);
		}
	}
	}
	
}