package Array_programing;

public class sortarray {

	public static void main(String[] args) {
		int [] arr={10,5,8,13,20,1};
		int l = arr.length;
		for(int i=1; i<l; i++){
			for(int j=1; j<l; j++){
				if(arr[j-1]>arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	for(int k=0; k<l;k++){
		System.out.println(arr[k]);
	
	}
	}
	
}
